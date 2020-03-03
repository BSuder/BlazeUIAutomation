
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Helper {

    void readMainPageURL(){


        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader("TestData.json"))
        {
            Object obj = jsonParser.parse(reader);
            JSONObject obect = (JSONObject) obj;
            System.out.println(obj);
            System.out.println(obect);

//            return "";

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (org.json.simple.parser.ParseException e) {
            e.printStackTrace();
        }
    }

}
