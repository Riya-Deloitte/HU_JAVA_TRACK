public class Test1 {
    public static void main(String[] args){
        try{
            int n1=10,n2=0;
            int output=n1/n2;
            System.out.println("Result = " +output);
        }
        catch(ArithmeticException e){
            System.out.println("something went wrong");
        }
        finally {
            System.out.println("thank you");
        }
    }
}
