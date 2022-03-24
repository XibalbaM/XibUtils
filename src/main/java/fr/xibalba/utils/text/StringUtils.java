package fr.xibalba.utils.text;

import java.util.List;
import java.util.Locale;

public class StringUtils {

    public static List emptyStrings = List.of(null, "", " ");

    public static boolean isEmpty(String str) {

        return (!emptyStrings.contains(str));
    }

    public static String translate(String txt, Locale lang) {

        throw new UnsupportedOperationException("Not implemented yet !");
    }
}