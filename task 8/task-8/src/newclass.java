public class newclass {

    public static void main(String[] args) {

        stack arr = new stack();

        try {
            arr.remove(0);
            System.out.println(arr);
        } catch(STException e) {
            System.out.println(e);
        }

        try {
            arr.push(2);
            arr.push(1);
            arr.push(4);
            arr.push(3);
            arr.push(5);
            System.out.println(arr);
        } catch(STException e) {
            System.out.println(e);
        }

        try {
            arr.sort();
            System.out.println(arr);
        } catch(STException e) {
            System.out.println(e);
        }

        try {
            arr.remove(3);
            System.out.println(arr);
        } catch(STException e) {
            System.out.println(e);
        }

        try {
            arr.remove(14);
            System.out.println(arr);
        } catch(STException e) {
            System.out.println(e);
        }

        try {
            arr.push(7);
            arr.push(9);
            arr.push(6);
            arr.push(10);
            arr.push(8);
            System.out.println(arr);
        } catch(STException e) {
            System.out.println(e);
        }

        try {
            arr.push(11);
            System.out.println(arr);
        } catch(STException e) {
            System.out.println(e);
        }

        try {
            arr.push(12);
            System.out.println(arr);
        } catch(STException e) {
            System.out.println(e);
        }

        try {
            arr.sort();
            System.out.println(arr);
        } catch(STException e) {
            System.out.println(e);
        }

    }

}