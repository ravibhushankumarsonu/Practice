import java.util.ArrayList;

public class Name {
    
    public static void main(String[] args) {
        Pipeline pipeline =  new MRPipeline(Name.class, jobName, conf);
        List<Path> inputPathList = new ArrayList<>(); // Add your InputPaths here
        PCollection<String> source = From.sequenceFile(inputPathList, Text.class);
    }
}