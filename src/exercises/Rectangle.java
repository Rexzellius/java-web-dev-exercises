package exercises;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of a rectangle:");
        Float length = input.nextFloat();
        System.out.println("Enter width of the rectangle:");
        Float width = input.nextFloat();
        input.close();
        Float area = length * width;
        System.out.println("The area of your rectangle is: " + area);
    }
}