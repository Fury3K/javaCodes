package ExcerciseGroup1;

import java.util.Scanner;

public class circles {
    public static void main(String[] args){
        double radius, perimeter, area;
        Scanner in = new Scanner (System.in);
        System.out.println("Enter your circle's radius: ");
        radius = in.nextDouble();
        perimeter = 2 * Math.PI * radius;
        area = Math.PI * Math.pow (radius,2);
        System.out.println("The circle's perimeter is: " +perimeter);
        System.out.println("The circle's area is: " +area);
    }
}
