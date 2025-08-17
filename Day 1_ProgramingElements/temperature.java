import java.util.Scanner;
public class temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float celsius = scanner.nextFloat();
        float fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println (fahrenheit);
        scanner.close();
    }
}