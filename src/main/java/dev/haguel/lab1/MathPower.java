package dev.haguel.lab1;

public class MathPower {
    public static double power(double base, int exponent) {
        double result = 1.0;

        // if exponent is negative, we will calculate the power for the positive exponent and then take the reciprocal
        int absExponent = Math.abs(exponent);

        for (int i = 0; i < absExponent; i++) {
            result *= base;
        }

        // if the exponent is negative, return the reciprocal of the result
        return (exponent < 0) ? 1.0 / result : result;
    }

    private void mergeMethod() {
        System.out.println("Unexpected changes");
    }
}
