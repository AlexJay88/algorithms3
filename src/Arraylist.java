import java.util.Arrays;

public class Arraylist {
    private int size;
    private int capacity;
    private String[] elements;

    public Arraylist() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];

    }

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    private void grow() {



        String[] array1 = new String[capacity];

        System.arraycopy(elements, 0, array1, 0, capacity);
        capacity = (int)(capacity*1.5);

        elements = new String[capacity];

        for (int i = 0; i < array1.length; i++){
            elements[i] = array1[i];
        }
    }


    @Override
    public  String toString() {
        return "ArrayList{" +
                "size=" + size +
                ", capacity=" + capacity +
                ", elements=" + Arrays.toString(elements) +
                '}';
}}
