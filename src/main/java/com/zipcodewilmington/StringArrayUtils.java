package com.zipcodewilmington;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (String element : array) {
            if (element.equals(value)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        //ArrayList<String> rev = new ArrayList<>();
        String[] rev = new String[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            rev[j] = array[i];
            j++;
        }
        return rev;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        if (Arrays.equals(reverse(array), array)) {
            return true;
        }
        return false;
    }




    // Function to check if ch is a letter


    // Function to check if a string
    // contains all the letters from
    // a to z
    static boolean allLetter(String str,
                             int len)
    {
        // Convert the given string
        // into lowercase
        str = str.toLowerCase();
        int size = 26;

        // Create a frequency array to
        // mark the present letters
        boolean[] present = new boolean[size];

        // Traverse for each character
        // of the string
        for (int i = 0; i < len; i++) {
                // Mark current letter as present
                int letter = str.charAt(i) - 'a';
                present[letter] = true;

        }

        // Traverse for every letter
        // from a to z
        for (int i = 0; i < size; i++) {

            // If the current character
            // is not present in string
            // then return false,
            // otherwise return true
            if (!present[i])
                return false;
        }
        return true;
    }

    // Driver Code


    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String alphabetArray = "abcdefghijklmnopqrstuvwxyz";
        //String convArr = Arrays.toString(array).replaceAll(" ","").toLowerCase();
        String convArr = Arrays.toString(array).toLowerCase();
        for(int i = 0; i < alphabetArray.length(); i++){
            if(!convArr.contains(String.valueOf(alphabetArray.charAt(i)))){
                return false;
            }
        }
        return true;
    }
        /*
        // Given string str
        String str = String.join(" ", array).replaceAll(" ", "");
        int len = str.length();
        int man = 'a' - 'b';

        // Function Call
        if (allLetter(str, len))
            return true;
        else
            return false;
    } */

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int numOcc = 0;
        for (String element : array) {
            if (element.equals(value)) {
                numOcc++;
            }
        }
        return numOcc;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int toRemove = getNumberOfOccurrences(array, valueToRemove); // find number of occ
        String[] rem = new String[array.length - toRemove];
        int count = 0;
        for (String element : array) {
            if (!element.equals(valueToRemove)) {
                rem[count] = element;
                count++;
            }
        }
        return rem;

    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        int count = 0;
        List<String> fix = new ArrayList<>();
        for(int i = 0; i < array.length; i++){
            if( i < array.length - 1 && array[i] != array[i + 1]){
                fix.add(array[i]);
            }
        }
        //if(!array[array.length - 1].equals(array[array.length - 2])){
            //fix.add(array[array.length -1]);}
        fix.add(array[array.length - 1]);
        System.out.println(fix);
        String[] last = fix.toArray(new String[0]);
        return last;
    }


    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;

        }



}
