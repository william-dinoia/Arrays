package edu.marywood.util;

import java.util.HashSet;
import java.util.Set;

/**
 * Defines {@link Arrays}.
 *
 * @author William DiNoia
 */
public final class Arrays {
    private static final int PRIME = 31;

    private Arrays() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    /**
     * Gets the deep hash code of an {@link Object}{@code []}.
     *
     * @param objectArray {@link Object}{@code []}
     * @return {@code int}
     */
    public static int deepHashCode(Object[] objectArray) {
        return Arrays.deepHashCode(objectArray, new HashSet<Object[]>());
    }

    private static int deepHashCode(Object[] objectArray, Set<Object[]> objectArraySet) {
        if (objectArray == null) {
            return 0;
        } else {
            objectArraySet.add(objectArray);
            int hashCode = 1;
            for (Object element : objectArray) {
                if (element == null) {
                    hashCode = PRIME * hashCode;
                } else {
                    hashCode = PRIME * hashCode + Arrays.deepHashCode(element, objectArraySet);
                }
            }
            return hashCode;
        }
    }

    private static int deepHashCode(Object object, Set<Object[]> objectArraySet)
            throws IllegalArgumentException {
        return switch (object) {
            case Object[] objectArray -> {
                if (objectArraySet.contains(objectArray)) {
                    throw new IllegalArgumentException();
                } else {
                    yield Arrays.deepHashCode(objectArray, objectArraySet);
                }
            }
            case boolean[] booleanArray -> Arrays.hashCode(booleanArray);
            case byte[] byteArray -> Arrays.hashCode(byteArray);
            case char[] charArray -> Arrays.hashCode(charArray);
            case double[] doubleArray -> Arrays.hashCode(doubleArray);
            case float[] floatArray -> Arrays.hashCode(floatArray);
            case int[] intArray -> Arrays.hashCode(intArray);
            case long[] longArray -> Arrays.hashCode(longArray);
            case null -> 0;
            case short[] shortArray -> Arrays.hashCode(shortArray);
            default -> object.hashCode();
        };
    }

    /**
     * Converts an {@link Object}{@code []} to a deep {@link String} representation.
     *
     * @param objectArray {@link Object}{@code []}
     * @return {@link String}
     */
    public static String deepToString(Object[] objectArray) {
        return Arrays.deepToString(objectArray, new HashSet<Object[]>());
    }

    private static String deepToString(Object[] objectArray, Set<Object[]> objectArraySet) {
        if (objectArray == null) {
            return "null";
        } else if (objectArray.length == 0) {
            return "[]";
        } else {
            objectArraySet.add(objectArray);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append('[');
            stringBuilder.append(Arrays.deepToString(objectArray[0], objectArraySet));
            for (int index = 1; index < objectArray.length; index += 1) {
                stringBuilder.append(", ");
                stringBuilder.append(Arrays.deepToString(objectArray[index], objectArraySet));
            }
            stringBuilder.append(']');
            return stringBuilder.toString();
        }
    }

    private static String deepToString(Object object, Set<Object[]> objectArraySet) {
        return switch (object) {
            case Object[] objectArray -> {
                if (objectArraySet.contains(objectArray)) {
                    yield "[...]";
                } else {
                    yield Arrays.deepToString(objectArray, objectArraySet);
                }
            }
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

    /**
     * Tests the equality of two {@code boolean[]}.
     *
     * @param booleanArrayA {@code boolean[]}
     * @param booleanArrayB {@code boolean[]}
     * @return {@code boolean}
     */
    public static boolean equals(boolean[] booleanArrayA, boolean[] booleanArrayB) {
        if (booleanArrayA == booleanArrayB) {
            return true;
        } else if (booleanArrayA == null || booleanArrayB == null) {
            return false;
        } else if (booleanArrayA.length == booleanArrayB.length) {
            for (int index = 0; index < booleanArrayA.length; index += 1) {
                if (booleanArrayA[index] != booleanArrayB[index]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    /**
     * Tests the equality of two {@code byte[]}.
     *
     * @param byteArrayA {@code byte[]}
     * @param byteArrayB {@code byte[]}
     * @return {@code boolean}
     */
    public static boolean equals(byte[] byteArrayA, byte[] byteArrayB) {
        if (byteArrayA == byteArrayB) {
            return true;
        } else if (byteArrayA == null || byteArrayB == null) {
            return false;
        } else if (byteArrayA.length == byteArrayB.length) {
            for (int index = 0; index < byteArrayA.length; index += 1) {
                if (byteArrayA[index] != byteArrayB[index]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    /**
     * Gets the hash code of an {@code Object[]}.
     *
     * @param objectArray {@code Object[]}
     * @return {@code int}
     */
    public static int hashCode(Object[] objectArray) {
        if (objectArray == null) {
            return 0;
        } else {
            int hashCode = 1;
            for (Object element : objectArray) {
                if (element == null) {
                    hashCode = PRIME * hashCode;
                } else {
                    hashCode = PRIME * hashCode + element.hashCode();
                }
            }
            return hashCode;
        }
    }

    /**
     * Gets the hash code of a {@code boolean[]}.
     *
     * @param booleanArray {@code boolean[]}
     * @return {@code int}
     */
    public static int hashCode(boolean[] booleanArray) {
        if (booleanArray == null) {
            return 0;
        } else {
            int hashCode = 1;
            for (boolean element : booleanArray) {
                hashCode = PRIME * hashCode + Boolean.hashCode(element);
            }
            return hashCode;
        }
    }

    /**
     * Gets the hash code of a {@code byte[]}.
     *
     * @param byteArray {@code byte[]}
     * @return {@code int}
     */
    public static int hashCode(byte[] byteArray) {
        if (byteArray == null) {
            return 0;
        } else {
            int hashCode = 1;
            for (byte element : byteArray) {
                hashCode = PRIME * hashCode + Byte.hashCode(element);
            }
            return hashCode;
        }
    }

    /**
     * Gets the hash code of a {@code char[]}.
     *
     * @param charArray {@code char[]}
     * @return {@code int}
     */
    public static int hashCode(char[] charArray) {
        if (charArray == null) {
            return 0;
        } else {
            int hashCode = 1;
            for (char element : charArray) {
                hashCode = PRIME * hashCode + Character.hashCode(element);
            }
            return hashCode;
        }
    }

    /**
     * Gets the hash code of a {@code double[]}.
     *
     * @param doubleArray {@code double[]}
     * @return {@code int}
     */
    public static int hashCode(double[] doubleArray) {
        if (doubleArray == null) {
            return 0;
        } else {
            int hashCode = 1;
            for (double element : doubleArray) {
                hashCode = PRIME * hashCode + Double.hashCode(element);
            }
            return hashCode;
        }
    }

    /**
     * Gets the hash code of a {@code float[]}.
     *
     * @param floatArray {@code float[]}
     * @return {@code int}
     */
    public static int hashCode(float[] floatArray) {
        if (floatArray == null) {
            return 0;
        } else {
            int hashCode = 1;
            for (float element : floatArray) {
                hashCode = PRIME * hashCode + Float.hashCode(element);
            }
            return hashCode;
        }
    }

    /**
     * Gets the hash code of a {@code int[]}.
     *
     * @param intArray {@code int[]}
     * @return {@code int}
     */
    public static int hashCode(int[] intArray) {
        if (intArray == null) {
            return 0;
        } else {
            int hashCode = 1;
            for (int element : intArray) {
                hashCode = PRIME * hashCode + Integer.hashCode(element);
            }
            return hashCode;
        }
    }

    /**
     * Gets the hash code of a {@code long[]}.
     *
     * @param longArray {@code long[]}
     * @return {@code int}
     */
    public static int hashCode(long[] longArray) {
        if (longArray == null) {
            return 0;
        } else {
            int hashCode = 1;
            for (long element : longArray) {
                hashCode = PRIME * hashCode + Long.hashCode(element);
            }
            return hashCode;
        }
    }

    /**
     * Gets the hash code of a {@code short[]}.
     *
     * @param shortArray {@code short[]}
     * @return {@code int}
     */
    public static int hashCode(short[] shortArray) {
        if (shortArray == null) {
            return 0;
        } else {
            int hashCode = 1;
            for (short element : shortArray) {
                hashCode = PRIME * hashCode + Short.hashCode(element);
            }
            return hashCode;
        }
    }

    /**
     * Converts an {@link Object}{@code []} to a {@link String} representation.
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
     * Converts a {@code boolean[]} to a {@link String} representation.
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
     * Converts a {@code byte[]} to a {@link String} representation.
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
     * Converts a {@code char[]} to a {@link String} representation.
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
     * Converts a {@code double[]} to a {@link String} representation.
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
     * Converts a {@code float[]} to a {@link String} representation.
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
     * Converts a {@code int[]} to a {@link String} representation.
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
     * Converts a {@code long[]} to a {@link String} representation.
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
     * Converts a {@code short[]} to a {@link String} representation.
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
