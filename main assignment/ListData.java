import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class ListData {
    public static void ListUserData() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("RESULT.txt"));
            String data="";
            while ((data = br.readLine()) != null) {
                String[] tokens = data.split(",");
                System.out.println("User id:" + tokens[0] +
                        " name:" + tokens[1] + " age:" + tokens[2] +
                        " Company name:" + tokens[3] + " Designation:" + tokens[4] +
                        " salary:" + tokens[5] + " phone no:" + tokens[6] + " Address:" + tokens[7]);
            }

            br.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}


