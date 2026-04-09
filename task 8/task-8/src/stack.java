import java.util.Arrays;
import java.util.*;

public class stack {
    private int top;
    private static final int size = 10;
    private int[] arr;

    public stack() {
        this(size);
    }

    public stack(int capacity) {
        int[] temp = (int[]) new int[capacity];
        arr = temp;
        top = -1;
    }

    public void push(int item) throws STException {
        if(isFull()) {
            throw new STException("Full");
        }

        arr[++top] = item;
    }

    public void remove(int item) throws STException {
        if(isEmpty()) {
            throw new STException("Empty");
        }

        boolean found = false;
        for(int i = 0; i <= top; i++) {
            if(arr[i] == item) {
                found = true;
                break;
            }
        }

        if(!found) {
            throw new STException("Element "+ item +" not found");
        }

        for(int i = 0; i <= top; i++) {
            if(arr[i] == item) {
                for(int j = i; j < top; j++) {
                    arr[j] = arr[j + 1];
                }
                top--;
                break;
            }
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return (top + 1) == arr.length;
    }

    public void sort() throws STException {
        if(isEmpty()) {
            throw new STException("Empty");
        }

        boolean allEqual = true;
        for(int i = 0; i <= top; i++) {
            if(arr[i] != arr[0]) allEqual = false;
        }

        if(allEqual) {
            throw new STException("Elements are equal");
        }

        Arrays.sort(arr, 0, top + 1);
    }

    @Override
    public String toString() {
        return "Array: " + Arrays.toString(Arrays.copyOf(arr, top + 1));
    }
}