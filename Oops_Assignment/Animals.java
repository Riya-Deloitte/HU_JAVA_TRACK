public class Animals {
    private int noOfLegs;
    private boolean nonVeg;
    private String eyeColor;

    public Animals(int noOfLegs,boolean nonVeg, String eyeColor){
        this.noOfLegs = 4;
        this.nonVeg = true;
        this.eyeColor ="blue";
    }
    public int getNoOfLegs(){
        return noOfLegs;
    }
    public boolean getnonVeg(){
        return nonVeg;
    }
    public String geteyeColor(){
        return eyeColor;
    }


    public static void main(String[] args){
        Animals an = new Animals(4,true,"blue");
        System.out.println("no. of legs = "+ an.getNoOfLegs());
        System.out.println("animal is vegetarian = "+ an.getNoOfLegs());
        System.out.println("color of eye = "+ an.getNoOfLegs());

    }
}
