public class mynewstack {

    public static void main(String[] args) {
        System.out.println("Numbers");
        MyStack intStack = new MyStack();
        intStack.push(1 );
        intStack.push(9 );
        intStack.push(6 );
        intStack.push(4 );
        intStack.push(10);
        intStack.push(5 );

        System.out.println("Given: " + intStack);
        intStack.sort();
        System.out.println("Sorted: " + intStack);

        System.out.println("\nStrings");
        MyStack strStack = new MyStack();
        strStack.push("Cylinder");
        strStack.push("Pyramid" );
        strStack.push("Square"  );
        strStack.push("Circle"  );
        strStack.push("Triangle");
        strStack.push("Cube"    );

        System.out.println("Given: " + strStack);
        strStack.sort();
        System.out.println("Sorted: " + strStack);

        System.out.println("\nClasses");
        MyStack clsStack = new MyStack();
        clsStack.push(new testnewstack(1660, 746 ));
        clsStack.push(new testnewstack(1099, 689 ));
        clsStack.push(new testnewstack(1321, 978 ));
        clsStack.push(new testnewstack(1623, 1120));
        clsStack.push(new testnewstack(1746, 721 ));

        System.out.println("Given: " + clsStack);
        clsStack.sort();
        System.out.println("Sorted: " + clsStack);
    }
}