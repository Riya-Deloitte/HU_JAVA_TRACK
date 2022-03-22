import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Login {
    public static void myLoginPage(){
       System.out.println("Login page");
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter User name");
       String userName = sc.nextLine();
       System.out.println("Enter Password");
       String password = sc.nextLine();
        UserDataBase usb=new UserDataBase();
        UserDataBase.info();
        try {
            BufferedReader b = new BufferedReader(new FileReader("RESULT.txt"));
            String data;
            while ((data = b.readLine()) != null) {

                StringTokenizer st = new StringTokenizer(data, ",");
               // System.out.println("login :" + st.nextToken() + " password :" + st.nextToken());
            }
            b.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}


