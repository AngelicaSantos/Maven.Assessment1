package com.zipcodewilmington.assessment1.part2;

/**
 * Created by leon on 2/16/18.
 */
public class StringUtils {

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return an array of strings, representative of each word in the sentence
     * given a string containing words delimited by spaces, representative of a sentence, return an array of strings, each element representative of a respective word in the sentence
     */
    public static String[] getWords(String sentence) {


        return null;
    }


    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence
     * given a string containing words delimited by spaces, representative of a sentence, return the first word of the sentence
     */
    public static String getFirstWord(String sentence) {
        int i = sentence.indexOf(' ');
        String word = sentence.substring(0,i);
        String rest = sentence.substring(i);

        return word;


    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order
     */
    public static String reverseFirstWord(String sentence) {

        int b = sentence.indexOf(' ');
        String word = sentence.substring(0,b);
        String rest = sentence.substring(b);

        String opposite = "";
        for (int i= word.length()-1;i>=0;i--) {
            opposite += word.charAt(i);
        }




        return opposite;
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order and the first character capitalized
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order with the first character capitalized
     */
    public static String reverseFirstWordThenCamelCase(String sentence) {

        int b = sentence.indexOf(' ');
        String word = sentence.substring(0,b);
        String rest = sentence.substring(b);

       String opposite= "";
       for(int i=word.length()-1;i<1;i++) {
           opposite+= word.charAt(i);
       }
        opposite.toLowerCase();
        opposite = opposite.substring(0, 1).toUpperCase() + opposite.substring(1).toLowerCase();

        return opposite;
    }


    /**
     * @param str string input from client
     * @param index the index of the character to be removed from `str`
     * @return string with identical contents, excluding the character at the specified index
     * given a string and index, return an identical string excluding the character at the specified index
     */
    public static String removeCharacterAtIndex(String str, int index) {


        return null;
    }

}
