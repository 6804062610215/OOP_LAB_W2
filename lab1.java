package lc1;
import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fah = sc.nextDouble();
        double cel = (5.0/9.0) * (fah - 32.0);
        
        System.out.println("Fahrenheit: " + fah + "\nCelsius: " + String.format("%.2f", cel));
    }
}
