package com.zipcodewilmington;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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
        return Arrays.equals(reverse(array), array);
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String combined = String.join("", array).toLowerCase();
        for (char c : alphabet.toCharArray()) {
            if (!combined.contains(String.valueOf(c))) {
                return false;
            }
        }
        return true;
    }



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
        return Arrays.stream(array).filter(e -> !e.equals(valueToRemove)).toArray(String[]::new);
    }
    //

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
            return IntStream.range(0, array.length)
                    .filter(i -> i == 0 || !array[i].equals(array[i - 1]))
                    .mapToObj(i -> array[i])
                    .toArray(String[]::new);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        List<String> fix = new ArrayList<>(List.of(array));
        for (int i = 0; i < fix.size() - 1; i++) {
            while (fix.get(i).contains(fix.get(i + 1))) {
                fix.set(i, fix.get(i) + fix.get(i + 1));
                fix.remove(i + 1);
                if (i == fix.size() - 1) {
                    break;
                }
            }
        }
        return fix.toArray(new String[0]);
    }

}
