package edu.marywood.util;

/**
 * Defines {@link Arrays}.
 *
 * @author William DiNoia
 */
public class Arrays {
    private static final char[] DELIMITER = {',', ' '};
    private static final char LEFT_SQUARE_BRACKET = '[';
    private static final String LEFT_SQUARE_BRACKET_RIGHT_SQUARE_BRACKET = "[]";
    private static final String NULL = "null";
    private static final char RIGHT_SQUARE_BRACKET = ']';

    /**
     * Converts a {@code boolean[]} to a {@link String}.
     *
     * @param booleanArray {@code boolean[]}
     * @return {@link String}
     */
    public static String toString(boolean[] booleanArray) {
        if (booleanArray == null) {
            return NULL;
        } else if (booleanArray.length == 0) {
            return LEFT_SQUARE_BRACKET_RIGHT_SQUARE_BRACKET;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(LEFT_SQUARE_BRACKET).append(booleanArray[0]);
            for (int index = 1; index < booleanArray.length; index += 1) {
                stringBuilder.append(DELIMITER).append(booleanArray[index]);
            }
            return stringBuilder.append(RIGHT_SQUARE_BRACKET).toString();
        }
    }

    /**
     * Converts a {@code byte[]} to a {@link String}.
     *
     * @param byteArray {@code byte[]}
     * @return {@link String}
     */
    public static String toString(byte[] byteArray) {
        if (byteArray == null) {
            return NULL;
        } else if (byteArray.length == 0) {
            return LEFT_SQUARE_BRACKET_RIGHT_SQUARE_BRACKET;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(LEFT_SQUARE_BRACKET).append(byteArray[0]);
            for (int index = 1; index < byteArray.length; index += 1) {
                stringBuilder.append(DELIMITER).append(byteArray[index]);
            }
            return stringBuilder.append(RIGHT_SQUARE_BRACKET).toString();
        }
    }

    /**
     * Converts a {@code char[]} to a {@link String}.
     *
     * @param charArray {@code char[]}
     * @return {@link String}
     */
    public static String toString(char[] charArray) {
        if (charArray == null) {
            return NULL;
        } else if (charArray.length == 0) {
            return LEFT_SQUARE_BRACKET_RIGHT_SQUARE_BRACKET;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(LEFT_SQUARE_BRACKET).append(charArray[0]);
            for (int index = 1; index < charArray.length; index += 1) {
                stringBuilder.append(DELIMITER).append(charArray[index]);
            }
            return stringBuilder.append(RIGHT_SQUARE_BRACKET).toString();
        }
    }

    /**
     * Converts a {@code double[]} to a {@link String}.
     *
     * @param doubleArray {@code double[]}
     * @return {@link String}
     */
    public static String toString(double[] doubleArray) {
        if (doubleArray == null) {
            return NULL;
        } else if (doubleArray.length == 0) {
            return LEFT_SQUARE_BRACKET_RIGHT_SQUARE_BRACKET;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(LEFT_SQUARE_BRACKET).append(doubleArray[0]);
            for (int index = 1; index < doubleArray.length; index += 1) {
                stringBuilder.append(DELIMITER).append(doubleArray[index]);
            }
            return stringBuilder.append(RIGHT_SQUARE_BRACKET).toString();
        }
    }

    /**
     * Converts a {@code float[]} to a {@link String}.
     *
     * @param floatArray {@code float[]}
     * @return {@link String}
     */
    public static String toString(float[] floatArray) {
        if (floatArray == null) {
            return NULL;
        } else if (floatArray.length == 0) {
            return LEFT_SQUARE_BRACKET_RIGHT_SQUARE_BRACKET;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(LEFT_SQUARE_BRACKET).append(floatArray[0]);
            for (int index = 1; index < floatArray.length; index += 1) {
                stringBuilder.append(DELIMITER).append(floatArray[index]);
            }
            return stringBuilder.append(RIGHT_SQUARE_BRACKET).toString();
        }
    }

    /**
     * Converts a {@code int[]} to a {@link String}.
     *
     * @param intArray {@code int[]}
     * @return {@link String}
     */
    public static String toString(int[] intArray) {
        if (intArray == null) {
            return NULL;
        } else {
            StringBuilder stringBuilder =
                    new StringBuilder(intArray.length).append(LEFT_SQUARE_BRACKET);
            switch (intArray.length) {
                case 0:
                    break;
                case 1:
                    stringBuilder.append(intArray[0]);
                    break;
                default:
                    stringBuilder.append(intArray[0]);
                    for (int index = 1; index < intArray.length; index += 1) {
                        stringBuilder.append(DELIMITER).append(intArray[index]);
                    }
                    break;
            }
            return stringBuilder.append(RIGHT_SQUARE_BRACKET).toString();
        }
    }

    /**
     * Converts a {@code long[]} to a {@link String}.
     *
     * @param longArray {@code long[]}
     * @return {@link String}
     */
    public static String toString(long[] longArray) {
        if (longArray == null) {
            return NULL;
        } else {
            StringBuilder stringBuilder =
                    new StringBuilder(longArray.length).append(LEFT_SQUARE_BRACKET);
            switch (longArray.length) {
                case 0:
                    break;
                case 1:
                    stringBuilder.append(longArray[0]);
                    break;
                default:
                    stringBuilder.append(longArray[0]);
                    for (int index = 1; index < longArray.length; index += 1) {
                        stringBuilder.append(DELIMITER).append(longArray[index]);
                    }
                    break;
            }
            return stringBuilder.append(RIGHT_SQUARE_BRACKET).toString();
        }
    }

    /**
     * Converts a {@code short[]} to a {@link String}.
     *
     * @param shortArray {@code short[]}
     * @return {@link String}
     */
    public static String toString(short[] shortArray) {
        if (shortArray == null) {
            return NULL;
        } else {
            StringBuilder stringBuilder =
                    new StringBuilder(shortArray.length).append(LEFT_SQUARE_BRACKET);
            switch (shortArray.length) {
                case 0:
                    break;
                case 1:
                    stringBuilder.append(shortArray[0]);
                    break;
                default:
                    stringBuilder.append(shortArray[0]);
                    for (int index = 1; index < shortArray.length; index += 1) {
                        stringBuilder.append(DELIMITER).append(shortArray[index]);
                    }
                    break;
            }
            return stringBuilder.append(RIGHT_SQUARE_BRACKET).toString();
        }
    }
}
