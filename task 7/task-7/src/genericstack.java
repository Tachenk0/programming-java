import java.util.Arrays;
import java.util.EmptyStackException;

public class genericstack<E> {
    private int top;
    private static final int DEFAULT_CAPACITY = 10;
    private E[] arr;

    public genericstack() {
        this(DEFAULT_CAPACITY);
    }

    public genericstack(int capacity) {
        @SuppressWarnings("unchecked")
        E[] temp = (E[]) new Object[capacity];
        arr = temp;
        top = -1;
    }

    public void push(E item) {
        if(isFull()) {
            resize(2 * arr.length);// х2 size
        }

        arr[++top] = item;
    }

    public E pop() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }

        E item = arr[top];
        arr[top--] = null;

        if(top > -1 && top == arr.length / 4) {
            resize(arr.length / 2);
        }

        return item;
    }

    public E peek() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }

        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return (top + 1) == arr.length;
    }

    public int size() {
        return top + 1;
    }

    private void resize(int capacity) {
        @SuppressWarnings("unchecked")

        E[] temp = (E[]) new Object[capacity];
        for(int i = 0; i <= top; i++) {
            temp[i] = arr[i]; // copy arr
        }

        arr = temp; // set oldarr on newarr
    }

    @Override
    public String toString() {
        Object[] elements = Arrays.copyOf(arr, top + 1);
        return "Массив: " + Arrays.toString(elements) + " [" + (isEmpty() ? "пуст" : "не пуст") + ", " + (isFull() ? "полный" : "не полный") + ", " + size() + ", " + arr.length + "]";
    }
}