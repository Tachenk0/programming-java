public class Main {

    public static void main(String[] args) {

        my_time t1 = new my_time();
        my_time t2 = new my_time(555550000);
        my_time t3 = new my_time(5, 23, 55);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

    }

}