public class Q4Profit_ProfitPercentage {
    public static void main(String[] args) {
        double CP = 129;
        double SP = 191;

        double Profit = SP - CP;
        double Profit_Per = (Profit / CP) * 100;
        System.out.printf("The Cost Price is INR " + CP + " and Selling Price in INR " + SP);
        System.out.printf("\nProfit is INR " + Profit + " and the Profit Percentage is " + Profit_Per);
    }
}