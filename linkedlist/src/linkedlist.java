public class linkedlist
{
    node head;

    public void insert(int data){
        node node = new node();
        node.data = data;
        node.next = null;

        if(head == null){
            head = node;
        }
        else{
            node n = head;
            while(n.next != null){
                n = n.next;
            }
            n.next = node;
        }
    }

    public void insertAtStart(int data){
        node node = new node();
        node.data = data;
        node.next = null;

        node.next = head;
        head = node;
    }

    public void insertAtAnyLocation(int index, int data){
        node node = new node();
        node.data = data;
        node.next = null;

        if(index == 0){
            insertAtStart(data);
        }
        else {
            node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    public void delete(int index){
        if(index == 0){
            head = head.next;
        }
        else{
            node n = head;
            node n1 = null;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
            System.out.println("deleting n1 = " +n1.data);

            n1 = null; //it will delete from garbage collection
        }

    }
    public void show(){
        node n = head;
        while(n.next != null){
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);
    }
}
