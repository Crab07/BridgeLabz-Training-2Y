public class Q5PenDistribution {
    public static void main(String[] args) {
        int Pens = 14;
        int Students = 3;

        // Division to find pens per student
        int PensPerStudent = Pens / Students;

        // Modulus to find remaining pens
        int RemainingPens = Pens % Students;

        System.out.println("The Pen Per Student is " + PensPerStudent +
                           " and the remaining pen not distributed is " + RemainingPens);
    }
}