import java.util.Arrays;

public class Main {

    public static Comparable[] maxAndMin(Comparable[] array) {
        if(array == null || array.length < 2) {
            throw new IllegalArgumentException("Array should have at least 2 arguments");
        }

        Comparable max = array[0];
        Comparable min = array[0];
        for(int i = 1; i < array.length; i++) {
            Comparable current = array[i];
            if(current.compareTo(max) > 0) max = current;
            if(current.compareTo(min) < 0) min = current;
        }

        return new Comparable[]{max, min};
    }


    public static void main(String[] args) {
        Integer[] arrayNum = {4, 9, 7, 1, 5};

        System.out.println("Array (Num): " + Arrays.toString(arrayNum));
        try {
            Comparable[] result = maxAndMin(arrayNum);
            System.out.println("Max: " + result[0]);
            System.out.println("Min: " + result[1]);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        String[] arrayStr = {"aaaaa", "aaa", "aa", "a", "aaaaaaa"};

        System.out.println("\nArray (Str): " + Arrays.toString(arrayStr));
        try {
            Comparable[] result = maxAndMin(arrayStr);
            System.out.println("Max: " + result[0]);
            System.out.println("Min: " + result[1]);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        Person[] arrayPrs = {
                new Person("Danil" , 28),
                new Person("Oleg"  , 15),
                new Person("Jane" , 27),
                new Person("Ann"   , 19),
                new Person("Andrey", 30)
        };

        System.out.println("\nArray (Person): " + Arrays.toString(arrayPrs));
        try {
            Comparable[] result = maxAndMin(arrayPrs);
            System.out.println("Max: " + result[0]);
            System.out.println("Min: " + result[1]);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}