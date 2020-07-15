package com.github.perscholas.java_fundamentals;

/**
 * Created by Leon Hunter on 6/14/17.
 */
public class StringUtilities {
    /**
     * @return `Hello World` as a string
     */
    public static String getHelloWorld() {
        String result = "Hello World";
        return result;
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of two strings, `firstSegment`, and `secondSegment`
     */
    public static String concatenation(String firstSegment, String secondSegment){
      String result = firstSegment + secondSegment;
        return result;
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
     */
    public static String concatenation(int firstSegment, String secondSegment){
        String result = String.valueOf(firstSegment) + secondSegment;
        return result;
    }

    /**
     * @param input a string to be manipulated
     * @return the first 3 characters of `input`
     */
    public static String getPrefix(String input){
        String result= input.substring(0,3);
        return result;
    }

    /**
     * @param input a string to be manipulated
     * @return the last 3 characters of `input`
     */
    public static String getSuffix(String input){
        String result= input.substring(input.length()-3);
        return result;
    }

    /**
     * @param inputValue the value to be compared
     * @param comparableValue the value to be compared against
     * @return the equivalence of two strings, `inputValue` and `comparableValue`
     */
    public static Boolean compareTwoStrings(String inputValue, String comparableValue){
        Boolean result = inputValue.equals(comparableValue);
        return result;
    }

    /**
     * @param inputValue the value input from user
     * @return the middle character of `inputValue`
     */
    public static Character getMiddleCharacter(String inputValue){
        int stringLength =inputValue.length() -1;

        int middle = stringLength/2 ;

        char result = inputValue.charAt(middle);
        return result;
    }

    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public static String getFirstWord(String spaceDelimitedString){
        String[] result = spaceDelimitedString.split(" ");
        return result[0];
    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public static String getSecondWord(String spaceDelimitedString){
        String[] result = spaceDelimitedString.split(" ");
        return result[1];
    }

    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public static String reverse(String stringToReverse) {
        // convert String to character array // by using toCharArray
        String result = "";
        for(int i= stringToReverse.length(); i>0; i--){
            Character lastChar= stringToReverse.charAt(i-1);
            result +=  lastChar;
        }
        return result;
    }


}
