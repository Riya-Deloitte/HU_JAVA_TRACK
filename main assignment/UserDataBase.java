import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class UserDataBase {
    public static void info(){
        System.out.println("******WELCOME TO USER DATA BASE********");
        System.out.println("1. Add User Data");
        System.out.println("2. List User Data");
        System.out.println("3. Update User Data");
        System.out.println("4. Delete User Data");
        System.out.println("5. Exit");
        int input=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your options");
        input = sc.nextInt();
        switch(input) {
            case 1:
                try{
                    AddData.AddUserInfo();
                }  catch(IOException e){
                    System.out.println("File not found");
                }
                break;
            case 2:
                ListData.ListUserData();
                break;
            case 3:
                UpdateData.UpdateUserData();
            break;
            case 4:
                DeleteData.DeleteUserData();
                break;
            case 5:
                Exit.ExitPage();
                break;
            default:
                System.out.println("Wrong input");
                break;
        }
    }
}
