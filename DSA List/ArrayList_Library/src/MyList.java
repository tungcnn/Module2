import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        this.elements = new Object[capacity];
    }

    public void add(int i, E e) {
        if (i >= size || i < 0) throw new IndexOutOfBoundsException("Illegal index. Out of bound");
        if (this.size == elements.length) {
            ensureCapacity(size*2);
        }
        for (int j = this.size - 1; j >= i; j--)
            elements[j + 1] = elements[j];
        elements[i] = e;
        size++;
    }

    public E remove(int i) {
        if (i >= size || i < 0) throw new IndexOutOfBoundsException("Illegal index. Out of bound");
        E temp = (E) elements[i];
        for (int j = i; j < this.size; j++) {
            elements[j] = elements[j++];
        }
        elements[size - 1] = null;
        size--;
        return temp;
    }

    public int size() {
        return this.size;
    }

    public Object clone() {
        MyList<E> cloneList = new MyList<>();
        for (int i = 0; i < this.size; i++) {
            cloneList.add((E)elements[i]);
        }
        return cloneList;
    }
    public boolean contains (E o) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (elements[i] == o) found = true;
        }
        return found;
    }
    public int indexOf(E o) {
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (elements[i] == o)  index = i;
        }
        return index;
    }
    public boolean add(E e) {
        if (this.size == elements.length) ensureCapacity(size*2);
        elements[size++] = e;
        return true;
    }

    private void ensureCapacity(int minCapacity) {
        elements = Arrays.copyOf(elements, minCapacity);
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index " + i + ", Size " + size);
        }
        return (E) elements[i];
    }

    public void clear() {
        this.elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void printArrayList() {
        for (int i = 0; i < size; i++) {
            System.out.println(this.elements[i]);
        }
    }
}
