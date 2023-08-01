public class Main {
    public static void main(String[] args) {

        linkedlist l1 = new linkedlist();

        l1.insert(10);
        l1.insert(33);
        l1.insert(40);

        l1.insertAtStart(1);

        l1.insertAtAnyLocation(0, 55);
        l1.insertAtAnyLocation(3,20);

        l1.delete(2);

        l1.show();
    }
}