import java.util.*;

public class newclass {

    public static void main(String[] args) {
        List<fraction> fractions = new ArrayList<>();
        //fractions.add(new fraction(6, 0));
        fractions.add(new fraction(3, 8));
        fractions.add(new fraction(-8, 7));
        fractions.add(new fraction(-4, -7));
        fractions.add(new fraction(2, -5));
        fractions.add(new fraction(4, 9));

        System.out.println("Дроби");
        for(fraction f : fractions) System.out.print(f + "\n");

        Collections.sort(fractions);
        System.out.println("\nВозрастание");
        for(fraction f : fractions) System.out.print(f + "\n");

        Collections.sort(fractions, new fractioncomparable(fractioncomparable.SortOrder.DESCENDING));
        System.out.println("\nУбывание");
        for(fraction f : fractions) System.out.print(f + "\n");

        Collections.sort(fractions, new fractioncomparable(fractioncomparable.SortOrder.ABS_ASCENDING));
        System.out.println("\nВозврастание абсолютных значений ");
        for(fraction f : fractions) System.out.print(f + "\n");

        Collections.sort(fractions, new fractioncomparable(fractioncomparable.SortOrder.ABS_DESCENDING));
        System.out.println("\nУбывание абсолютных значений");
        for(fraction f : fractions) System.out.print(f + "\n");
    }
}