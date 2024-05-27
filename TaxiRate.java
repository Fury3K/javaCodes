package ExcerciseGroup1;
import java.util.Scanner;
public class TaxiRate {
    public static void main(String[] args){
        double flagrate, distance, price, total;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your flag down rate: ");
        flagrate = in.nextDouble();
        System.out.println("Enter the total distance travelled: ");
        distance = in.nextDouble();
        System.out.print("Enter the price for each kilometer travelled: ");
        price = in.nextDouble();

        total = flagrate + (price * distance);
        System.out.println("Your total fair amount is: " +total);
    }
}
