public class Animals {
    private int noOfLegs;
    private boolean nonVeg;
    private String eyeColor;

    public Animals(int noOfLegs,boolean nonVeg, String eyeColor){
        this.noOfLegs = 4;
        this.nonVeg = true;
        this.eyeColor ="blue";
    }
    public int getnoOfLegs(){
        return noOfLegs;
    }
    public boolean getnonVeg(){
        return nonVeg;
    }
    public String geteyeColor(){
        return eyeColor;
    }
}
