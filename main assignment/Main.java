import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

            System.out.println("WELCOME TO USER DATABASE");
            System.out.println("1. LOGIN");
            System.out.println("2. REGISTERATION");

        Login lg = new Login();
        registeration rg = new registeration();
        int Number = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Select Option");
            Number = sc.nextInt();
            switch (Number) {
                case 1:
                    Login.myLoginPage();
                    break;
                case 2:
                    registeration.myRegisteraionPage();
                    break;
                default:
                    System.out.println("Wrong Input");
                    break;
            }
        }
}

