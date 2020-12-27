package studios.quiz;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Scanner;

public class MultipleChoiceQuestion extends Question {

    private ArrayList<String> possibleAnswer;
    private int correctAnswer;

    public MultipleChoiceQuestion(String question, int pointValue, ArrayList<String> possibleAnswer, int correctAnswer) {
        super(question, pointValue);
        this.correctAnswer = correctAnswer;
        this.possibleAnswer = possibleAnswer;
    }

    @Override
    public void displayAnswers() {
        for (String answer: possibleAnswer) {
            System.out.println(answer);
        }
    }

    public boolean isCorrectAnswer(int possibleAnswer) {
        if (possibleAnswer == this.correctAnswer) {
            return true;
        } else {
            return false;
        }
    }


    @Override
    public int getAnswers() {
        Scanner answer = new Scanner(System.in);
        System.out.println("What will your answer be? Enter the number of the option you believe is correct. For example, to select the first option, enter 1");
        int userAnswer = answer.nextInt();
        if (isCorrectAnswer(userAnswer)) {
            return 1;
        }
        else {
            return 0;
        }
    }

}
