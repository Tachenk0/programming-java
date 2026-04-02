public class newclass {

    public static void main(String[] args) {

        genericstack<String> arrStr = new genericstack<>(5);

        System.out.println(arrStr); // empty

        arrStr.push("Hi");
        arrStr.push("Egor");

        System.out.println(arrStr); // array with 2 of 5

        arrStr.push("17");
        arrStr.push("3");
        arrStr.push("19");

        System.out.println(arrStr); // max size

        arrStr.push("5");
        arrStr.push("10");

        System.out.println(arrStr);// х2 size 7 of 10

        arrStr.push("12");
        arrStr.push("15");
        arrStr.push("20");

        System.out.println(arrStr); // max size

        for(int i = 0; i < 5; i++) arrStr.pop();

        System.out.println(arrStr);

    }

}