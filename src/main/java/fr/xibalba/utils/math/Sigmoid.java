package fr.xibalba.utils.math;

public class Sigmoid {

    /**
     *
     * @param x the number to sigmoid
     * @return the sigmoid of the number
     */
    public static double simple(double x) {

        return 1 / (1 + Math.exp(-x));
    }

    /**
     *
     * @param x the number to sigmoid
     * @return the sigmoid of the number, with lower precision that the {@link #simple(double)}
     */
    public static double speediest(double x) {

        if( x < -10 )
            return 0;
        else if( x > 10 )
            return 0;
        else
            return simple(x);
    }
}
