package personal.testing.map_reduce.mapper;

import org.apache.commons.lang.StringUtils;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

/**
 * created by ravibhushan.k on 26/01/19
 */
public class GenericMapper<T1, T2> extends Mapper<T1, T2, Text, Text> {
    private boolean curBucketFlag = false;
    private String curProcessDate;
    private String curProcessHour;
    private String curProcessBucket;
    private Configuration conf;
    private String inFile;
    private String methodToCall = null;

    @Override
    public void setup(Context context) throws IOException {
        conf = context.getConfiguration();
        curProcessDate = conf.get("cur-date");
        curProcessHour = conf.get("cur-hour");
        curProcessBucket = conf.get("cur-bucket");
        inFile = context.getInputSplit().toString();
        curBucketFlag = checkIfEventIsCurrent(context);
        String subPath = conf.get("sub-path");
        if(subPath!= null && StringUtils.containsIgnoreCase(inFile, subPath)) {
            methodToCall = "generateResult";
        }
        if(methodToCall == null) {
            throw new RuntimeException("Unable to find method call for input file -" + inFile);
        }
    }

    @Override
    public void cleanup(Context context) throws InterruptedException, IOException {

    }

    @Override
    public void map(T1 key, T2 value, Context context) throws IOException, InterruptedException {
        try {
            context.write(new Text(key.toString()), new Text(value.toString()));
        } catch (Exception e) {
            throw new RuntimeException("Mapper is failed due to " + e.getMessage());
        }
    }

    private boolean checkIfEventIsCurrent(Context context) {
        Boolean currFlag = false;
        //String inFile = context.getInputSplit().toString();
        String[] processDate = StringUtils.split(curProcessDate, "/");
        String inPathString = null;

        if (processDate != null && processDate.length >= 3) {
            inPathString = String.format("year=%s/month=%s/day=%s/hour=%s/minute=%s/longdate=%s/p=00",
                    processDate[0],
                    processDate[1],
                    processDate[2],
                    curProcessHour,
                    curProcessBucket,
                    processDate[0] + processDate[1] + processDate[2] + curProcessHour + curProcessBucket);
        }

        if (inPathString != null && inFile.contains(inPathString)) {
            currFlag = true;
        }

        return currFlag;
    }
}
