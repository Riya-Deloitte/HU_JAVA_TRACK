public class Pattern_1 {
    public static void main(String[] args){
        int i,j,k,l=10;
        for (i = 1 ; i <= l; i++ )
        {
            for (j = 1 ; j <= l - i; j++ )
            {
                System.out.print(" ");
            }
            for (k = 1 ; k <= i; k++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for (i = l - 1 ; i > 0; i-- )
        {
            for (j = 1 ; j <= l - i; j++ )
            {
                System.out.print(" ");
            }
            for (k = 1 ; k <= i; k++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
