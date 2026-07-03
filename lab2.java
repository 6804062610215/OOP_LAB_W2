package lc1;
import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        System.out.println("Enter the monthly saving amount: ");
        Scanner input = new Scanner(System.in);
        double balance = 0;
        double deposit = input.nextDouble();
        double monthlyInterestRate = 0.05 / 12;
        int m = 6;
        for (int i = 0; i < m; i++){
            balance = (deposit + balance) * (1 + monthlyInterestRate);
        }
        System.out.println("After the sixth month, the account value is $" + String.format("%.2f", balance));
    }
    
}
