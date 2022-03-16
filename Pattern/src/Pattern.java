public class Pattern {
    public static void main(String[] args) {
         int i,j,k;
        for ( i = 1; i <= 10; i++) {
            for (j = i; j <=9; j++) {
                System.out.print("");
            }
            for (k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
            for (i = 9; i >0; i--) {
                for ( j = i; j <= 9; j++) {
                    System.out.print("");
                }
                for (k = 1; k <= i; k++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }

