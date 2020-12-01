package exercises;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class HashmapPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String,Integer> studentID = new HashMap<>();
        String newStudent;

        do{
            System.out.println("Student Name: ");
            newStudent = input.nextLine();

            if(!newStudent.equals("")) {
                System.out.println(newStudent + "'s ID number: ");
                Integer newStudentId = input.nextInt();
                studentID.put(newStudent,newStudentId);
                input.nextLine();
            }
        } while (!newStudent.equals(""));

        for(Map.Entry<String, Integer> student:studentID.entrySet()) {
            System.out.println(student.getKey() + ":" + student.getValue());
        }
    }
}
