package edu.marywood.util;

/**
 * Defines {@link Arrays}.
 *
 * @author William DiNoia
 */
public class Arrays {

    /**
     * Converts an {@link Object}{@code []} to a {@link String}.
     *
     * @param objectArray {@link Object}{@code []}
     * @return {@link String}
     */
    public static String deepToString(Object[] objectArray) {
        if (objectArray == null) {
            return "null";
        } else if (objectArray.length == 0) {
            return "[]";
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append('[');
            stringBuilder.append(Arrays.deepToString(objectArray[0]));
            for (int index = 1; index < objectArray.length; index += 1) {
                stringBuilder.append(", ");
                stringBuilder.append(Arrays.deepToString(objectArray[index]));
            }
            stringBuilder.append(']');
            return stringBuilder.toString();
        }
    }

    /**
     * Converts an {@link Object}{@code []} to a {@link String}.
     *
     * @param objectArray {@link Object}{@code []}
     * @return {@link String}
     */
    public static String toString(Object[] objectArray) {
        if (objectArray == null) {
            return "null";
        } else if (objectArray.length == 0) {
            return "[]";
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append('[');
            stringBuilder.append(objectArray[0]);
            for (int index = 1; index < objectArray.length; index += 1) {
                stringBuilder.append(", ");
                stringBuilder.append(objectArray[index]);
            }
            stringBuilder.append(']');
            return stringBuilder.toString();
        }
    }

    /**
     * Converts a {@code boolean[]} to a {@link String}.
     *
     * @param booleanArray {@code boolean[]}
     * @return {@link String}
     */
    public static String toString(boolean[] booleanArray) {
        if (booleanArray == null) {
            return "null";
        } else if (booleanArray.length == 0) {
            return "[]";
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.ensureCapacity(6 * booleanArray.length);
            stringBuilder.append('[');
            stringBuilder.append(booleanArray[0]);
            for (int index = 1; index < booleanArray.length; index += 1) {
                stringBuilder.append(", ");
                stringBuilder.append(booleanArray[index]);
            }
            stringBuilder.append(']');
            return stringBuilder.toString();
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
            return "null";
        } else if (byteArray.length == 0) {
            return "[]";
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.ensureCapacity(3 * byteArray.length);
            stringBuilder.append('[');
            stringBuilder.append(byteArray[0]);
            for (int index = 1; index < byteArray.length; index += 1) {
                stringBuilder.append(", ");
                stringBuilder.append(byteArray[index]);
            }
            stringBuilder.append(']');
            return stringBuilder.toString();
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
            return "null";
        } else if (charArray.length == 0) {
            return "[]";
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.ensureCapacity(3 * charArray.length);
            stringBuilder.append('[');
            stringBuilder.append(charArray[0]);
            for (int index = 1; index < charArray.length; index += 1) {
                stringBuilder.append(", ");
                stringBuilder.append(charArray[index]);
            }
            stringBuilder.append(']');
            return stringBuilder.toString();
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
            return "null";
        } else if (doubleArray.length == 0) {
            return "[]";
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.ensureCapacity(5 * doubleArray.length);
            stringBuilder.append('[');
            stringBuilder.append(doubleArray[0]);
            for (int index = 1; index < doubleArray.length; index += 1) {
                stringBuilder.append(", ");
                stringBuilder.append(doubleArray[index]);
            }
            stringBuilder.append(']');
            return stringBuilder.toString();
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
            return "null";
        } else if (floatArray.length == 0) {
            return "[]";
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.ensureCapacity(5 * floatArray.length);
            stringBuilder.append('[');
            stringBuilder.append(floatArray[0]);
            for (int index = 1; index < floatArray.length; index += 1) {
                stringBuilder.append(", ");
                stringBuilder.append(floatArray[index]);
            }
            stringBuilder.append(']');
            return stringBuilder.toString();
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
            return "null";
        } else if (intArray.length == 0) {
            return "[]";
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.ensureCapacity(3 * intArray.length);
            stringBuilder.append('[');
            stringBuilder.append(intArray[0]);
            for (int index = 1; index < intArray.length; index += 1) {
                stringBuilder.append(", ");
                stringBuilder.append(intArray[index]);
            }
            stringBuilder.append(']');
            return stringBuilder.toString();
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
            return "null";
        } else if (longArray.length == 0) {
            return "[]";
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.ensureCapacity(3 * longArray.length);
            stringBuilder.append('[');
            stringBuilder.append(longArray[0]);
            for (int index = 1; index < longArray.length; index += 1) {
                stringBuilder.append(", ");
                stringBuilder.append(longArray[index]);
            }
            stringBuilder.append(']');
            return stringBuilder.toString();
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
            return "null";
        } else if (shortArray.length == 0) {
            return "[]";
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.ensureCapacity(3 * shortArray.length);
            stringBuilder.append('[');
            stringBuilder.append(shortArray[0]);
            for (int index = 1; index < shortArray.length; index += 1) {
                stringBuilder.append(", ");
                stringBuilder.append(shortArray[index]);
            }
            stringBuilder.append(']');
            return stringBuilder.toString();
        }
    }

    /**
     * Converts an {@link Object} to a {@link String}.
     *
     * @param object {@link Object}
     * @return {@link String}
     */
    private static String deepToString(Object object) {
        return switch (object) {
            case Object[] objectArray -> Arrays.deepToString(objectArray);
            case boolean[] booleanArray -> Arrays.toString(booleanArray);
            case byte[] byteArray -> Arrays.toString(byteArray);
            case char[] charArray -> Arrays.toString(charArray);
            case double[] doubleArray -> Arrays.toString(doubleArray);
            case float[] floatArray -> Arrays.toString(floatArray);
            case int[] intArray -> Arrays.toString(intArray);
            case long[] longArray -> Arrays.toString(longArray);
            case null -> "null";
            case short[] shortArray -> Arrays.toString(shortArray);
            default -> object.toString();
        };
    }
}
