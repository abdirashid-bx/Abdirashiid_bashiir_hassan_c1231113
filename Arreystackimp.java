import java.util.EmptyStackException;

public class Arreystackimp<T> {
    private static final int START_SIZE = 3;
    private T[] elements;
    private int position;

    public Arreystackimp() {
        this(START_SIZE);
    }

    public Arreystackimp(int size) {
        elements = (T[]) new Object[size];
        position = -1;
    }

    public void add(T value) {
        if (position == elements.length - 1) {
            increaseSize();
        }
        position++;
        elements[position] = value;
    }

    public T remove() {
        if (checkEmpty()) {
            throw new EmptyStackException();
        }
        T temp = elements[position];
        elements[position] = null;
        position--;
        return temp;
    }

    public T top() {
        if (checkEmpty()) {
            throw new EmptyStackException();
        }
        return elements[position];
    }

    public boolean checkEmpty() {
        return position == -1;
    }

    public int count() {
        return position + 1;
    }

    public void show() {
        if (checkEmpty()) {
            throw new EmptyStackException();
        }
        System.out.println("the data of stack:");
        for (int i = 0; i <= position; i++) {
            System.out.println(elements[i]);
        }
    }

    private void increaseSize() {
        T[] newArray = (T[]) new Object[elements.length * 2];
        for (int i = 0; i < elements.length; i++) {
            newArray[i] = elements[i];
        }
        elements = newArray;
    }
}
