import java.io.*;
import java.lang.Math;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class AddData {
    static int User_id ;
    static String name;
    static int age;
    static String companyName;
    static String Designation;
    static float Salary;
    static String address;
    static int phoneNumber;

    public static void AddUserInfo() throws IOException {
        int flag = 0;
        Random random = new Random();
        User_id = random.nextInt(1000);
        BufferedWriter bw = new BufferedWriter(new FileWriter("RESULT.txt", true));

        do {
            System.out.println("Add the Data for the Following fields ");
            System.out.println("USER ID - " + User_id);
            Scanner sc = new Scanner(System.in);
            System.out.println("ENTER NAME");
            name = sc.nextLine();
            System.out.println("NAME - " + name);
            System.out.println("ENTER AGE");
            age = sc.nextInt();
            System.out.println("AGE - " + age);
            if (age > 18 && age < 100) {
            } else {
                System.out.println("wrong input");
            }
            System.out.println("ENTER COMAPNY NAME");
            companyName = sc.next();
            System.out.println("Company Name - " + companyName);
            System.out.println("ENTER YOUR DESIGNATION");
            Designation = sc.next();
            System.out.println("DESIGNATION - " + Designation);
            System.out.println("ENTER SALARY");
            Salary = sc.nextFloat();
            System.out.println("SALARY - " + Salary);
            if (Salary < 0) {
                System.out.println("wrong salary input");
            }
            System.out.println("ADD ADDRESS");
            address = sc.next();
            System.out.println("ADDRESS - " + address);
            System.out.println("ENTER PHONE NUMBER");
            phoneNumber = sc.nextInt();
            System.out.println("PHONE NUMBER - " + phoneNumber);
            bw.write(User_id + "," + name + "," + age + "," + companyName + "," + Designation + "," + Salary + "," + address + "," + phoneNumber);
            bw.flush();
            bw.newLine();
            bw.close();


        } while (flag == 1);
        UserDataBase.info();
    }
}




