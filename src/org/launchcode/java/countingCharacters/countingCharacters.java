package org.launchcode.java.countingCharacters;

import java.util.Map;
import java.util.HashMap;

public class countingCharacters {
    public static void main(String[] args){
        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms " +
                "over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, " +
                "it’s pretty straightforward from there.";
        char[] stringCount = quote.toCharArray();

        Map<Character, Integer> numOfEachCharacter = new HashMap<>();

        for(char character:stringCount) {
            if(!numOfEachCharacter.containsKey(character)){
                numOfEachCharacter.put(character, 1);
            } else {
                Integer numOfCharacter = numOfEachCharacter.get(character)+1;
                numOfEachCharacter.put(character,numOfCharacter);
            }
        }
        String displayCharacter="";
        for(Map.Entry<Character, Integer> characterAndValue : numOfEachCharacter.entrySet()) {
            displayCharacter += characterAndValue.getKey()+": " + characterAndValue.getValue()+"\n";
        }

        System.out.println(displayCharacter);
    }
}
// case insensitivity = char[] stringCount = quote.toLowerCase().toCharArray();
// or use equalsIgnoreCase() ??

