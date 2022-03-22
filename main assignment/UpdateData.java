import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class UpdateData {
    public static void UpdateUserData() {
        HashMap<String,Integer> map=new HashMap<String,Integer>();
        map.put("name",1);
        map.put("age",2);
        map.put("company name",3);
        map.put("designation",4);
        map.put("salary",5);
        map.put("address",6);
        map.put("phone number",7);

        Scanner sc = new Scanner(System.in);
        System.out.println("Edit detials :\n" + "1).name\n" + "2).age\n" + "3).company name\n" + "4).designation\n" + "5).salary\n" + "6).address\n" + "7).phone number");
        System.out.println("ENTER OPTION: ");
        String option  = sc.nextLine();
        System.out.println("ENTER ID");
        String id = sc.nextLine();
        System.out.println("enter a new value");
        String variable = sc.nextLine();



        String fileToParse = "RESULT.txt";
        BufferedReader fileReader = null;
        String DELIMITER = ",";
        String newFileData = "";
        try {
            String line = "";
            BufferedReader br = new BufferedReader(new FileReader("RESULT.txt"));
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(DELIMITER);
                if(tokens[0].equals(id)){
                   int index = map.get(option) ;
                    tokens[index] = variable;
                    String newLine="";
                    for(int i=0;i< tokens.length-1;i++){
                        newLine+=tokens[i]+',';
                    }
                    newLine+=tokens[tokens.length-1];
                    newFileData+=newLine+ "\n";
                }else{
                    newFileData+=line  + "\n";
                }
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter("RESULT.txt"));
            bw.write(newFileData);
            bw.flush();
            bw.newLine();
            bw.close();
            BufferedReader br1 = new BufferedReader(new FileReader("RESULT.txt"));
            while ((line = br1.readLine()) != null) {
                String[] tokens = line.split(DELIMITER);
                if(tokens[0].equals(id)){
                    System.out.println(line);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
