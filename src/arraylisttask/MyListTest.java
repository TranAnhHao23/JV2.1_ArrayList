package arraylisttask;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>(7);
        list.add(0,1);
        list.add(1,3);
        list.add(2,5);
        list.add(3,7);

        list.add(2,9);

        list.remove(3);

        list.display();
        System.out.println(list.size());

    }
}
