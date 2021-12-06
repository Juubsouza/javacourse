package com.jeevocorp;

import java.util.Scanner;

public class StringFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String originalString;

        do {
            System.out.println("Insert a phrase here:");
            originalString = scanner.nextLine();
        } while (originalString.isEmpty());

        String[] words = splitPhraseIntoWords(originalString);
        String capitalizedString = "";

        for (String word : words){
            String firstLetter = word.substring(0, 1);
            String remainingLetters = word.substring(1);

            capitalizedString = capitalizedString + firstLetter.toUpperCase() + remainingLetters + " ";
        }

        System.out.println(capitalizedString.trim());
    }

    public String capitalizeFirstLetterOfWords(String originalString){

        if (originalString == null || originalString.isEmpty()) {
            return "";
        }

        String[] words = splitPhraseIntoWords(originalString);
        String capitalizedString = "";

        for (String word : words){
            String firstLetter = word.substring(0, 1);
            String remainingLetters = word.substring(1);

            capitalizedString = capitalizedString + firstLetter.toUpperCase() + remainingLetters + " ";
        }

        return capitalizedString.trim();
    }

    public static String[] splitPhraseIntoWords(String originalPhrase){
        String [] words = {};
        
        if(originalPhrase == null) {
            return words;
        }

        if(!originalPhrase.isEmpty()){
            return originalPhrase.split("\\s");
        } else {
            return words;
        }
    }
}
