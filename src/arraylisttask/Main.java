package arraylisttask;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(8);
        list.add(6);
        list.add(4);
        list.remove(2);
        list.add(2,9);


        System.out.println(list.size());
        System.out.println(list);
    }
}
