package com.jeevocorp;
import com.jeevocorp.StringFormatter;

public class Main {

    public static void main(String[] args) {
        String myString = "How can mirrors be real if our eyes aren't real";

        StringFormatter stringFormatter = new StringFormatter();

        System.out.println(stringFormatter.capitalizeFirstLetterOfWords(myString));
    }
}
