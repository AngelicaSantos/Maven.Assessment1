package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        str.toLowerCase();
        str = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
        return str;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String opposite = "";
        for (int i = str.length() - 1; i >= 0; i--) {

            opposite += str.charAt(i);

        }
        return opposite;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {

        String opposite = "";
        for (int i = str.length() - 1; i >= 0; i--) {

            opposite += str.charAt(i);

            opposite.toLowerCase();
            opposite = opposite.substring(0, 1).toUpperCase() + opposite.substring(1).toLowerCase();


        }
        return opposite;


    }

    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {

        return str.substring(1, str.length() - 1);
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        String cas = "";

        //get the char array from String
        char[] charArray = str.toCharArray();

        //process chars one by one
        for (int i = 0; i < charArray.length; i++) {

            //if char is uppercase, make it lower case
            if (Character.isUpperCase(charArray[i])) {

                charArray[i] = Character.toLowerCase(charArray[i]);

            } else if (Character.isLowerCase(charArray[i])) {

                charArray[i] = Character.toUpperCase(charArray[i]);

            }
        }
        // now you need to convert the new  char into string
        str = new String(charArray);
        System.out.println(str);
        return str;
    }

}
