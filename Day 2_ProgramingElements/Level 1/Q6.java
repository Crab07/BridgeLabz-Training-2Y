public class Q6UniversityFeeDiscount {
    public static void main(String[] args) {
        double fees = 125000;              
        double discount_per = 10;      

        // Calculate discount amount
        double discount = (fees * discount_per) / 100;

        // Calculate final fee after discount
        double Fee = fees - discount;

        System.out.println("The discount amount is INR " + discount +
                           " and final discounted fee is INR " + Fee);
    }
}