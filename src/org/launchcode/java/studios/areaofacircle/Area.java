package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;
// double is a primitive data type, while Double is an object. the same but functionalities used differently.
public class Area {

    public static void main(String[] args) {
        Scanner firstUserInput = new Scanner(System.in);
        double radius = -1;
        while(radius < 0) {
            System.out.println("Enter a radius: ");
            radius = firstUserInput.nextDouble();
            firstUserInput.skip("\n");
        }
        double areaOfCircle = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + areaOfCircle);
        firstUserInput.close();
    }
}

// Do-while loop example
//
//import java.util.Scanner;
//// double is a primitive data type, while Double is an object. the same but functionalities used differently.
//public class Area {
//
//    public static void main(String[] args) {
//        Scanner firstUserInput = new Scanner(System.in);
//        double radius;
//        do {
//            System.out.println("Enter a radius: ");
//            radius = firstUserInput.nextDouble();
//            firstUserInput.skip("\n");
//        } while(radius < 0);
//        double areaOfCircle = Circle.getArea(radius);
//        System.out.println("The area of a circle of radius " + radius + " is: " + areaOfCircle);
//        firstUserInput.close();
//    }
//}

/* Bonus !!! */

//public class Area {
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a radius: ");
//        try {
//            double radius = input.nextDouble();
//            while (radius <= 0) {
//                System.out.println("Must be a positive number greater than 0.");
//                radius = input.nextDouble();
//            }
//            Double areaOfCircle = Circle.getArea(radius);
//            System.out.println("The area of a circle of radius " + radius + " is: " + areaOfCircle);
//        } catch(Exception e) {
//            System.out.println("Error! Invalid input.");
//        }
//        input.close();
//
//    }
//}