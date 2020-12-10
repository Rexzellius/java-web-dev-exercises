package org.launchcode.java.demos.lsn4classes2;
import java.util.Scanner;

public class School {
    public static void main(String[] args) {
// rex & rex2 are different objects of each other
        // to compare: re-define equals method to Override
        Student rex = new Student("Rex");
        rex.setNumberOfCredits(67);
        rex.setGpa(3.8);
        System.out.println(rex);
//        rex.addGrade(3, 4.0);
//        System.out.println(rex.getGpa());
//        System.out.println(rex.getGradeLevel());

        Student rex2 = new Student("Rex");
//        Scanner input = new Scanner(System.in);
        rex2.setNumberOfCredits(67);
        rex2.setGpa(3.8);
        System.out.println(rex.equals(rex2));
    }
}
