package studios.quiz;

import java.util.Arrays;
import java.util.Set;

public abstract class Question {

    private String question;
    private int pointValue;

    public Question(String question, int pointValue) {
        this.question = question;
        this.pointValue = pointValue;
    }

    public void displayQuestion() {
        System.out.println(this.question);
    }

    public void setPointValue(int x) {
        this.pointValue = x;
    }

    public int getPointValue() {
        return this.pointValue;
    }

    public abstract void displayAnswers();

    public abstract int getAnswers();

}