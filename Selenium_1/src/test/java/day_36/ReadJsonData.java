package day_36;
import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ReadJsonData {
    public static void main(String[] args) throws Exception {

        JSONParser parser = new JSONParser();

        JSONArray jsonArray =
                (JSONArray) parser.parse(
                        new FileReader("src/test/resources/data.json"));

        for (Object obj : jsonArray) {
            JSONObject user = (JSONObject) obj;

            System.out.println("Username: "
                    + user.get("username"));

            System.out.println("Password: "
                    + user.get("password"));
        }
    }
}