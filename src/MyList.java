import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    // Tạo mảng elements
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    // Đảm bảo capacity luôn lớn hơn length
    public void ensuCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    // Thêm phần tử vào cuối danh sách
    public void add(E e) {
        if (size == elements.length){
            ensuCapa();
        }
        elements[size++] = e;
    }

    // Trả về phần tử thứ i trong mảng
    public E get(int i){
        if (i >= size || i < 0){
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }

}
