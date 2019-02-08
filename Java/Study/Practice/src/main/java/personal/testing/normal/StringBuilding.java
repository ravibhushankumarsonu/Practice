package personal.testing.normal;

/**
 * created by ravibhushan.k on 01/02/19
 */
public class StringBuilding {

    public String getEventKey(String event, String baseKey) {
        StringBuilder sb = new StringBuilder();
        return sb.append(event)
                .append("_")
                .append(baseKey).toString();
    }
}
