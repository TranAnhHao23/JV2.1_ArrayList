package simplelistlinked;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList list = new MyLinkedList(10);
        list.addFirst(4);
        list.addFirst(7);
        list.addFirst(9);

        list.add(4,9);
        list.add(4,9);

        list.printList();

    }
}
