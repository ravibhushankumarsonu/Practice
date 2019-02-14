package personal.testing.map_reduce.mapper;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.InputSplit;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mrunit.mapreduce.MapDriver;
import org.apache.hadoop.mrunit.types.Pair;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

/**
 * created by ravibhushan.k on 26/01/19
 */
public class GenericMapperTest {
    MapDriver<Text, Text, Text, Text> mapDriver;
    GenericMapper mapper;

    @Before
    public void setup() {
        final String filePath = "/filepath/ravi/year=2019/month=01/day=20/hour=20/minute=00/longdate=201901202000/p=00/filename.json";
        mapper = new GenericMapper();
        mapDriver = MapDriver.newMapDriver(mapper);
        Configuration conf = mapDriver.getConfiguration();
        conf.set("cur-date", "2019/01/20");
        conf.set("cur-hour", "20");
        conf.set("cur-bucket", "00");
        conf.set("sub-path", "ravi");
        mapDriver.setMapInputPath(new Path(filePath));
        when(mapDriver.getContext().getInputSplit())
                .thenReturn(new InputSplit() {
                    @Override
                    public long getLength() throws IOException, InterruptedException {
                        return 1;
                    }

                    @Override
                    public String[] getLocations() throws IOException, InterruptedException {
                        String[] arr = new String[1];
                        arr[0] = filePath;
                        return arr;
                    }

                    @Override
                    public String  toString() {
                        return filePath;
                    }
                });

    }

    @Test
    public void mapperTest() throws IOException{
        mapDriver.withInput(new Text("REQ_ABC"), new Text("ravi"));
        List<Pair<Text, Text>> results = mapDriver.run();

        for (Pair result : results) {
            Text value = (Text) result.getSecond();
            System.out.println(value.toString());
        }
    }

}