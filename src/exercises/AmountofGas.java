package exercises;

import java.util.Scanner;

public class AmountofGas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the number of gallons you used?");
        double gallons = input.nextDouble();
        System.out.println("What is the number of miles you traveled?");
        double miles = input.nextDouble();
        double mpg = miles/gallons;
        System.out.println("your mpg is " + mpg);
    }
}
