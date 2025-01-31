class Deque<T> {
    private Node<T> front, rear;


    public Deque() {
        front = rear = null;
    }


    public void insertFront(T data) {
        Node<T> newNode = new Node<>(data);
        if (front == null) {
            front = rear = newNode;
        } else {
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }
    }


    public void insertRear(T data) {
        Node<T> newNode = new Node<>(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            newNode.prev = rear;
            rear = newNode;
        }
    }


    public void deleteFront() {
        if (front == null) {
            System.out.println("Bicola vacía");
            return;
        }
        front = front.next;
        if (front == null) rear = null;
        else front.prev = null;
    }


    public void deleteRear() {
        if (rear == null) {
            System.out.println("Bicola vacía");
            return;
        }
        rear = rear.prev;
        if (rear == null) front = null;
        else rear.next = null;
    }


    public void display() {
        Node<T> temp = front;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}
