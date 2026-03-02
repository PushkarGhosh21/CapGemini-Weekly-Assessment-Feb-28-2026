package p1;

import java.util.Arrays;

public class AoA {

    public static void main(String[] args) {

        boolean[] boolA = {true, false, false, true};
        char[] charA = {'k', 'p'};
        Object[] objectA = {12345678990321L, "string", 'l'};

        arrayPrint(boolA);
        arrayPrint(charA);
        arrayPrint(objectA);
    }

    public static void arrayPrint(Object arr) {

        if (!arr.getClass().isArray()) {
            throw new IllegalArgumentException("Input is not an array");
        }

        System.out.println(Arrays.deepToString(new Object[]{arr})
                .replaceFirst("^\\[", "")
                .replaceFirst("]$", ""));
    }
}
