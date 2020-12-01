package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListPractice {
    public static Integer addAllEvenNums(List<Integer> myList){
        Integer summedEvenNums = 0;
        for(Integer i: myList){
            if(i%2==0){
                summedEvenNums+=i;
            }
        }
        return summedEvenNums;
    }
    public static boolean onlySoManyLetters(Integer num, List<String> list){
        for(String word: list){
            if(word.length() == num){
                System.out.println(word);
            }
        }
        return true;
    }
    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        numbers.add(8);
        numbers.add(5);
        numbers.add(6);
        numbers.add(8);
        numbers.add(5);
        numbers.add(6);
        numbers.add(8);

        System.out.println(addAllEvenNums(numbers));

        List<String> myWordList = new ArrayList<String>();
        myWordList.add("homes");
        myWordList.add("dog");
        myWordList.add("summer");
        myWordList.add("fives");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length of words you want returned:");
        Integer lengthOfWord = input.nextInt();
        input.close();
        onlySoManyLetters(lengthOfWord, myWordList);
    }
}