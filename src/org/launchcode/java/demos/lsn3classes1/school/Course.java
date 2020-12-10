package org.launchcode.java.demos.lsn3classes1.school;
import java.util.HashMap;
import java.util.Objects;

public class Course {
    private HashMap<String, Character> gradeBook = new HashMap<>();
    private String className;
    private String instructor;
    private int credits;


    public String getCassName() {
        return className;
    }

    protected void setClassName(String aClassName){
        className = aClassName;
    }

    public String getInstructor(){
        return instructor;
    }
    protected void setInstructor(String aInstructor){
        instructor = aInstructor;
    }

    public HashMap getGradeBook(){
        return gradeBook;
    }

    public int getCredits(){
        return credits;
    }

    protected void setCredits(int aCredits){
        credits = aCredits;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return className.equals(course.className) &&
                instructor.equals(course.instructor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(className, instructor);
    }

    @Override
    public String toString() {
        return "Course{" +
                "gradeBook=" + gradeBook +
                '}';
    }
}