package files.LinkedList;

public class ListNode <T> {
    private T value;
    private ListNode next;

    public ListNode(T value) {
        this.value = value;
    }

    // Setters
    public void setValue(T value) {
        this.value = value;
    }
    public void setNext(ListNode next) {
        this.next = next;
    }

    // Getters
    public T getValue() {
        return this.value;
    }

    public ListNode getNext() {
        return this.next;
    }
}
