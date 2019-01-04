package Practice;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.commons.httpclient.HttpStatus;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.Properties;

/**
 * created by ravibhushan.k on 11/12/18
 */
public class configService {

    public static void main(String[] args) throws Exception {
        String surl = "http://10.47.0.101:80/v1/buckets/fk-mnm-arjuna-crm-reporting-job-properties";
        URL url = new URL(surl);
        JsonObject keysObject = null;
        boolean isConnected = false;
        Properties props = new Properties();
        int tryCount = 0;

        while (tryCount <= 5 && !isConnected) {
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();
            JsonParser jsonParser = new JsonParser();
            JsonElement rootElement = jsonParser.parse(new InputStreamReader((InputStream) request.getContent()));
            JsonObject rootObj = rootElement.getAsJsonObject();
            keysObject = rootObj.get("keys").getAsJsonObject();

            int responseCode = request.getResponseCode();
            request.disconnect();

            if (responseCode == HttpStatus.SC_OK) {
                break;
            }
            tryCount++;
        }

        for (Map.Entry<String, JsonElement> entry : keysObject.entrySet()) {
            final JsonElement value = entry.getValue();
            final String key = entry.getKey();
            if (value.isJsonArray()) {
                props.put(key, value);
            } else {
                if (props.getProperty(key) == null) {
                    //System.out.println(key + "-->" + value);
                    props.put(key, value.getAsString());
                }
            }
        }
        System.out.println(props);
    }
}
