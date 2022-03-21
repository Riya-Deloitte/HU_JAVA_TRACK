import java.util.*;
class valid
{
    public static boolean isInterleaving(String X, String Y, String S)
    {
        if (X.length() == 0 && Y.length() == 0 && S.length() == 0) {
            return true;
        }
        if (S.length() == 0) {
            return false;
        }
        if (X.length() != 0 && S.charAt(0) == X.charAt(0)) {
            return isInterleaving(X.substring(1), Y, S.substring(1));
        }
        if (Y.length() != 0 && S.charAt(0) == Y.charAt(0)) {
            return isInterleaving(X, Y.substring(1), S.substring(1));
        }

        return false;
    }

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter three string: ");
        String str1= sc.nextLine();
        String str2= sc.nextLine();
        String str3= sc.nextLine();


        if (isInterleaving(str1, str2, str3)) {
            System.out.print("Valid");
        }
        else {
            System.out.print("Invalid");
        }
    }
}