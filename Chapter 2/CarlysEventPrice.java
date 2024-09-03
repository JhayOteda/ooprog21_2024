import java.util.Scanner;

public class CarlysEventPrice {

    public static void main(String[] args) {
        
        final String MOTTO = "Carly's makes the food that makes it a party.";
        
        final double PRICE_PER_GUEST = 35.0;
        
        Scanner scanner = new Scanner(System.in);
      
        System.out.print("Enter the number of guests: ");
        int numberOfGuests = scanner.nextInt();
       
        double totalPrice = numberOfGuests * PRICE_PER_GUEST;
        
        boolean isLargeEvent = numberOfGuests >= 50;
        
        System.out.println(MOTTO);
        
        System.out.println("Number of guests: " + numberOfGuests);
        System.out.println("Price per guest: $" + PRICE_PER_GUEST);
        System.out.println("Total price: $" + totalPrice);
        System.out.println("Is this a large event? " + isLargeEvent);
        
        scanner.close();
    }
}
