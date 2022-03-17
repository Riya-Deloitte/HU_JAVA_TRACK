import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class reverseOrder {
    public static void main(String[] args) {
        ArrayList<String> word = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string please ");
        word.add(sc.next());
        word.add(sc.next());
        word.add(sc.next());
        word.add(sc.next());

        ArrayList<String> reverse = reverseList(word);
        System.out.println(reverse);
    }

        public static ArrayList reverseList(ArrayList list)
        {
            ArrayList reverse = new ArrayList<>(list.size());
            for (int i = list.size() - 1; i >= 0; i--) {
                reverse.add(list.get(i));
            }
            return reverse;
        }

    }








