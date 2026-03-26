import java.util.*;

public class fraction implements Comparable<fraction> {
    private final int numerator;
    private final int denominator;

    public fraction(int numerator, int denominator) {
        if(denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не должен быть равен 0.");
        }

        int gcd = findGCD(Math.abs(numerator), Math.abs(denominator));
        if(denominator < 0) {
            this.numerator = -numerator / gcd;
            this.denominator = -denominator / gcd;
        } else {
            this.numerator = numerator / gcd;
            this.denominator = denominator / gcd;
        }
    }

    private int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public double doubleValue() {
        return (double) numerator / denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public double getAbsoluteValue() {
        return Math.abs(doubleValue());
    }

    @Override
    public int compareTo(fraction other) {
        long left = (long) this.numerator * other.denominator;
        long right = (long) other.numerator * this.denominator;
        return Long.compare(left, right);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator + " (" + doubleValue()  + ")";
    }
}