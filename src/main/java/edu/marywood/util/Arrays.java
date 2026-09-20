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
        } else {
            String[] stringArray = new String[objectArray.length];
            for (int index = 0; index < objectArray.length; index += 1) {
                if (objectArray[index] == null) {
                    stringArray[index] = "null";
                } else if (objectArray[index] instanceof Object[]) {
                    stringArray[index] = Arrays.toString((Object[]) objectArray[index]);
                } else if (objectArray[index] instanceof boolean[]) {
                    stringArray[index] = Arrays.toString((boolean[]) objectArray[index]);
                } else if (objectArray[index] instanceof byte[]) {
                    stringArray[index] = Arrays.toString((byte[]) objectArray[index]);
                } else if (objectArray[index] instanceof char[]) {
                    stringArray[index] = Arrays.toString((char[]) objectArray[index]);
                } else if (objectArray[index] instanceof double[]) {
                    stringArray[index] = Arrays.toString((double[]) objectArray[index]);
                } else if (objectArray[index] instanceof float[]) {
                    stringArray[index] = Arrays.toString((float[]) objectArray[index]);
                } else if (objectArray[index] instanceof int[]) {
                    stringArray[index] = Arrays.toString((int[]) objectArray[index]);
                } else if (objectArray[index] instanceof long[]) {
                    stringArray[index] = Arrays.toString((long[]) objectArray[index]);
                } else if (objectArray[index] instanceof short[]) {
                    stringArray[index] = Arrays.toString((short[]) objectArray[index]);
                } else {
                    stringArray[index] = objectArray[index].toString();
                }
            }
            return '[' + String.join(", ", stringArray) + ']';
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
            stringBuilder.append(String.valueOf(objectArray[0]));
            for (int index = 1; index < objectArray.length; index += 1) {
                stringBuilder.append(", ");
                stringBuilder.append(String.valueOf(objectArray[index]));
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
}
