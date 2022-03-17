import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        int c=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements");

        int[] array = new int[10];
        for (int i = 0; i < 5; i++)
            array[i] = sc.nextInt();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                    if(i==j)
                        continue;
                    if(array[i]+ array[j]<0){
                        c++;
                    }
            }
        }
        System.out.println(c);
    }
}









