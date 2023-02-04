package files.LinkedList;

public class LinkedList <T> {
    private ListNode head;

    public void append(T value) {
        ListNode<T> newNode = new ListNode<>(value);
        ListNode currentNode = head;

        // If list is empty
        if (head == null) {
            head = newNode;
        } else {

            // Search last element
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }

            // Add element in end
            currentNode.setNext(newNode);
        }
    }

    public void removeFirst() {
        head = head.getNext();
    }

    public String pop() {
        ListNode currentNode = head;

        String output;

        while (currentNode.getNext().getNext() != null) {
            currentNode = currentNode.getNext();
        }
        output = currentNode.getNext().getValue().toString();


        currentNode.setNext(null);

        return output;
    }

    public int length() {
        ListNode currentNode = head;

        int count = 0;

        while (currentNode != null) {
            count++;
            currentNode = currentNode.getNext();
        }

        return count;
    }

    public int findElement(String value) {
        ListNode currentNode = head;
        int index = 0;

        while (currentNode != null) {
            if (currentNode.getValue().equals(value))
                return index;

            currentNode = currentNode.getNext();
            index++;
        }

        return -1;
    }

    public T get(int indexElement) {
        ListNode<T> currentNode = head;

        int index = 0;

        while (currentNode != null) {
            if (index == indexElement)
                return currentNode.getValue();

            currentNode = currentNode.getNext();
            index++;
        }

        //return "Element not found!";
        return null;
    }

    public boolean replace(int indexOfElement, T value) {
        ListNode<T> currentNode = head;

        int index = 0;

        while (currentNode != null) {
            if (index == indexOfElement) {
                currentNode.setValue(value);
                return true;
            }

            currentNode = currentNode.getNext();
            index++;
        }
        return false;
    }

    public void clear() {
        head = null;
    }

    public void showList() {
        ListNode<T> currentNode = head;

        String output = "";

        if (currentNode == null)
            System.out.println("List is empty");

        while (currentNode != null) {
            output = output.concat(currentNode.getValue().toString());

            if (currentNode.getNext() != null)
                output = output.concat(" -> ");
            else
                output = output.concat(";");

            currentNode = currentNode.getNext();
        }

        System.out.println(output);
    }
}
