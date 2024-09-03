import java.util.Scanner;

public class SammysRentalPrice {

    public static void main(String[] args) {
        final String MOTTOONE = "SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS";
        final String MOTTO = "S Sammy's make it fun in the sun. S";
        final String MOTTOTWO = "SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS";
        
        final double HOURLY_RATE = 40.0;
        final double MINUTE_RATE = 1.0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of minutes rented: ");
        int totalMinutes = scanner.nextInt();
        
        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;
        
      
        double totalPrice = (hours * HOURLY_RATE) + (minutes * MINUTE_RATE);
        
        System.out.println(MOTTOONE);
        System.out.println(MOTTO);
        System.out.println(MOTTOTWO);
        
        System.out.println("Hours rented: " + hours);
        System.out.println("Minutes rented: " + minutes);
        System.out.println("Total price: $" + totalPrice);
        
        
        scanner.close();
    }
}
