package arraylisttask;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList(Object[] elements) {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        this.elements = new Object[capacity];
    }

    // Làm 1 hàm cho nó đảm bảo
    public void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    // Lệnh add theo index
    public void add(int index, E e) {
        if (size == elements.length) {
            ensureCapacity();
        }
        Object[] newElements = new Object[elements.length];
        int c = 0;
        for (int i = 0; i < elements.length; i++) {
            if (i != index) {
                newElements[i] = elements[c];
                c++;
            } else {
                newElements[i] = e;
            }
        }
        size++;
        elements = newElements;
    }


    public void remove(int index) {
        int c = 0;
        Object[] newElements = new Object[elements.length];

        for (int i = 0; i < elements.length; i++) {
            if (i != index) {
                newElements[c] = elements[i];
                c++;
            }
        }
        size--;
        elements = newElements;
    }

    public int size(){
        return size;
    }
//
//    public E[] clone(){
//
//    }
//
    public boolean contains(E e){
        boolean check = false;
        for (int i = 0; i < elements.length; i++) {
            if(elements[i] == e){
                check = true;
            }
        }
        return check;
    }
//
//    public int indexOf(E e){
//
//    }
//
//    public boolean add(E e){
//
//    }
//
//    public E get(int index){
//
//    }
//
//    public void clear(){
//
//    }
//

    public void display() {
        for (Object e : elements) {
            if (e != null){
                System.out.print(e + " ");
            }
        }
    }


}
