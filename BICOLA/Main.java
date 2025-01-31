public class Main {
    public static void main(String[] args) {
        Deque<Integer> deque = new Deque<>();
        deque.insertFront(10);
        deque.insertFront(20);
        deque.insertRear(30);
        deque.insertRear(40);
        deque.display(); 
        deque.deleteFront();
        deque.display(); 
        deque.deleteRear();
        deque.display(); 
    }
}
