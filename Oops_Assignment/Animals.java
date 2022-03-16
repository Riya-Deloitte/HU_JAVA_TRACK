public class Animals {
    private int noOfLegs;
    private boolean nonVeg;
    private String eyeColor;

    public void input(){
        noOfLegs = 4;
        nonVeg = true;
        eyeColor ="blue";
    }
    public void showStatement(){
        input();
        System.out.println("no of legs = "+noOfLegs );
        System.out.println("non Vegetarian = "+nonVeg );
        System.out.println("eye color = "+eyeColor );

    }

    public static void main(String[] args){
        Animals an = new Animals();
        an.showStatement();

    }
}
