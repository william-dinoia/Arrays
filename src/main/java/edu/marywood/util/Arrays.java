package edu.marywood.util;
/**
 * Defines {@link Arrays}.
 *
 * @author William DiNoia
 */
public class Arrays {
    /**
     * Converts a {@code boolean[]} to a {@link String}.
     *
     * @param booleanArray {@code boolean[]}
     * @return {@link String}
     */
    public static String toString(boolean[] booleanArray) {
        String string;
        if (booleanArray == null) {
            string = "null";
        } else {
            String[] stringArray = new String[booleanArray.length];
            for (int index = 0; index < booleanArray.length; index += 1) {
                stringArray[index] = Boolean.toString(booleanArray[index]);
            }
            string = "[" + String.join(", ", stringArray) + "]";
        }
        return string;
    }
}
