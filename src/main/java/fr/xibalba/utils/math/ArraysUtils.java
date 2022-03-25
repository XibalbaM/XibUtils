package fr.xibalba.utils.math;

import java.util.Arrays;

public class ArraysUtils {

    public static Float[][] dot2D(Float[][] x, Float[][] y) {

        Float[][] output = new Float[x.length][y[0].length];

        for (int i = 0; i < x.length; i++) {

            Float[] outC = new Float[y[0].length];
            Arrays.fill(outC, 0F);

            for (int k = 0; k < y.length; k++) {

                Float input = x[i][k];

                for (int l = 0; l < y[k].length; l++) {

                    outC[l] += input * y[k][l];
                }
            }
            output[i] = outC;
        }

        return output;
    }

    public static <T> String arrayToString(T[][] array) {

        StringBuilder sb = new StringBuilder("[\n");

        for (int i = 0; i < array.length; i++) {

            sb.append("  ").append(arrayToString(array[i]));

            if (i != array.length - 1) {

                sb.append(",");
            }

            sb.append("\n");
        }

        sb.append("]");

        return sb.toString();
    }

    public static <T> String arrayToString(T[] array) {

        StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i < array.length; i++) {

            sb.append(array[i].toString());

            if (i != array.length - 1) {

                sb.append(", ");
            }
        }

        sb.append("]");

        return sb.toString();
    }
}
