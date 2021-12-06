package com.jeevocorp;

public class StringFormatter {

    public String capitalizeFirstLetterOfWords(String originalString){

        if (originalString == null || originalString.isEmpty()) {
            return "";
        }

        String words[] = originalString.split("\\s");
        String capitalizedString = "";

        for (String word : words){
            String firstLetter = word.substring(0, 1);
            String remainingLetters = word.substring(1);

            capitalizedString = capitalizedString + firstLetter.toUpperCase() + remainingLetters + " ";
        }

        return capitalizedString.trim();
    }
}
