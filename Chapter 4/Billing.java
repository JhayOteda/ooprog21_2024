public class Billing {

    public static void computeBill(double price) {
        double tax = 0.08 * price;
        double total = price + tax;
        System.out.println("The total price for the bill is: $" + total);
    }

    public static void computeBill(double price, double quantity) {
        double subtotal = price * quantity;
        double tax = 0.08 * subtotal;
        double total = subtotal + tax;
        System.out.println("The total price for the bill is: $" + total);
    }

    public static void computeBill(double price, double quantity, double couponDiscount) {
        double subtotal = price * quantity;
        double discount = (couponDiscount / 100.0) * subtotal; 
        double discountedPrice = subtotal - discount;
        double tax = 0.08 * discountedPrice; 
        double total = discountedPrice + tax;
        System.out.println("The total price for the bill is: $" + total);
    }

    public static void main(String[] args) {

        computeBill(23.2);  
        computeBill(48.8);  
        computeBill(70.9);  
    }
}