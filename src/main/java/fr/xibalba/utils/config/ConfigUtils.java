package fr.xibalba.utils.config;

import java.lang.reflect.Field;
import java.util.Locale;

public class ConfigUtils {

    public static void classInit(Object toInit) {

        try {
            for (Field declaredField : toInit.getClass().getDeclaredFields()) {

                if (!declaredField.isAccessible())
                    declaredField.setAccessible(true);

                if (declaredField.get(toInit) == null) {

                    declaredField.set(toInit, switchType(declaredField.getType(), declaredField));
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static Object switchType(Class c, Field field) {

        return switch (c.getName()) {
            case "java.util.Boolean" -> false;
            case "java.util.Locale" -> Locale.getDefault();
            case "java.lang.Integer" -> 0;
            case "java.lang.String" -> "";
            default -> switchName(field);
        };
    }

    public static Object switchName(Field field) {

        return switch (field.getName()) {
            default -> null;
        };
    }
}