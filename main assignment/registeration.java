import java.io.*;
import java.util.Scanner;

public class registeration {
    public static void myRegisteraionPage() {
        System.out.println("Welcome to Registeration page");
        Scanner sc = new Scanner(System.in);
        System.out.println(" User Id");
        String UserName = sc.nextLine();
        String password = "";
        do {
            System.out.println("Enter Password");
            password = sc.next();
            if(pass(password)){
                break;
            }
            else{
                System.out.println("Password entered was not strong");
                continue;
            }
        } while (true);

        do {
            System.out.println("Re-Enter Password");
            String password_2 = sc.next();
            if (password.equals(password_2)) {
                System.out.println("Successfully Registered");
                break;
            } else {
                System.out.println("Re-enter password did not match the password");
                continue;
            }
        } while (true);
        Main.main(null);
    }

    public static boolean pass(String password) {
        if (!((password.length() >= 5) && (password.length() <= 10))) {
            return false;
        }
        boolean upperCheck = false;
        boolean lowerCheck = false;
        boolean digitCheck = false;
        boolean special_character = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            int c = (int) ch;
            if (Character.isUpperCase(c)) {
                upperCheck = true;
            }

            if (Character.isLowerCase(c)) {
                lowerCheck = true;
            }
            if (Character.isDigit(c)) {
                digitCheck = true;
            }
            if (ch >= 33 && ch <= 38 || ch == 64) {
                special_character = true;
            }
        }

        if (!upperCheck) {
            System.out.println("there must be an uppercase");
            return false;
        }
        if (!lowerCheck) {
            System.out.println("there must be an lower case");
            return false;
        }
        if (!digitCheck) {
            System.out.println("there must be a digit");
            return false;
        }
        if (!special_character) {
            System.out.println("there must be a special character");
            return false;
        }
        return true;
    }

}








