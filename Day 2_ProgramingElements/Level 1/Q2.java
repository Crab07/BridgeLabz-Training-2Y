public class Q2SamAverageMarks {
     public static void main(String[] args) {
        int Maths_Marks = 94;
        int Physics_Marks = 95;
        int Chemistry_Marks = 96;

        // Total marks out of 300
        int Total_Marks = Maths_Marks + Physics_Marks + Chemistry_Marks;

        // Average percentage
        double Average_Percent = (Total_Marks / 3.0);

        System.out.println("Sam's average marks in PCM is " + Average_Percent + "%");
    }
}