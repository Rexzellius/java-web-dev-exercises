package exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String [] args){
        int[] arrayOfNums = {1, 1, 2, 3, 5, 8};

        for (int i : arrayOfNums) {
            if(i%2 == 1) {
                System.out.println(i);
            }
        }
        String sentences = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] word = sentences.split("\\.");

        System.out.println(Arrays.toString(word));
    }
}
