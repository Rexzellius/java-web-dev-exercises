//package org.launchcode.java.demos.lsn3classes1;
//
//public class SchoolPractice {
//    public static void main(String[] args) {
//        // Instantiate your Student class for part 2 here!
//        Student rex = new Student();
//        rex.setName("rex");
//        rex.setStudentId(666);
//        rex.setNumberOfCredits(1);
//        rex.setGpa(4.0);
//
//        Course java = new Course(101, "Intro to Java");
//        java.addStudent(rex);
//        System.out.println(java.getStudents());
//    }
//}
package org.launchcode.java.demos.lsn3classes1;
import org.launchcode.java.demos.lsn3classes1.school.Course;

public class SchoolPractice {
    public static void main(String[] args) {

        Student me = new Student();
        me.setName("Shaw Coney");
        me.setStudentId(7519);
        me.setNumberOfCredits(1);
        me.setGpa(4.0);

        System.out.println("Please welcome " + me.getName());

        Course java = new Course();
        System.out.println(me.toString());

    }
}