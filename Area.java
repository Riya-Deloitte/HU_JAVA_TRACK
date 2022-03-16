import java.util.Scanner;
import java.lang.Math.*;

public class Area {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius");

        int radius = sc.nextInt();
        System.out.println("Enter length");

        int length = sc.nextInt();
        System.out.println("Enter breadth");
        int breadth = sc.nextInt();
        System.out.println("Enter height");
        int height = sc.nextInt();
        System.out.println("Enter base");

        int base = sc.nextInt();
        double areaOfCircle,areaOfSquare,areaOfRectangle,areaOfTriangle;

        areaOfCircle=Math.PI*radius*radius;
        areaOfSquare=length*length;
        areaOfRectangle= length*breadth;
        areaOfTriangle = 0.5*base*height;
        System.out.println("area of circle = " +areaOfCircle);
        System.out.println("area of square = " +areaOfSquare);
        System.out.println("area of rectangle = "+ areaOfRectangle);
        System.out.println("area of triangle = "+ areaOfTriangle);


    }
}
