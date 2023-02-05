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

        // Go to last element
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

        // Go to last element
        while (currentNode != null) {
            count++;
            currentNode = currentNode.getNext();
        }

        return count;
    }

    public T get(int indexElement) {
        ListNode<T> currentNode = head;

        int index = 0;

        // Go to last element
        while (currentNode != null) {
            if (index == indexElement)
                return currentNode.getValue();

            currentNode = currentNode.getNext();
            index++;
        }

        return null;
    }

    public boolean replace(int indexOfElement, T value) {
        ListNode<T> currentNode = head;

        int index = 0;

        // Go to last element
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

    public LinkedList<Integer> sorted(LinkedList<Integer> linkedList, boolean reversed) {

        // Bubble sort realization
        for (int i = 0; i < linkedList.length(); i++) {
            for (int j = 0; j < linkedList.length() - i - 1; j++) {
                if (!(reversed)) {
                    if (linkedList.get(j) > linkedList.get(j + 1)) {
                        // Reverse values
                        int value = linkedList.get(j);  // Value buffer
                        linkedList.replace(j, linkedList.get(j + 1));
                        linkedList.replace(j + 1, value);
                    }
                } else {
                    if (linkedList.get(j) < linkedList.get(j + 1)) {
                        // Reverse values
                        int value = linkedList.get(j);  // Value buffer
                        linkedList.replace(j, linkedList.get(j + 1));
                        linkedList.replace(j + 1, value);
                    }
                }
            }
        }


        return linkedList;
    }

    public void showList() {
        ListNode<T> currentNode = head;

        String output = "";

        // If list is empty
        if (currentNode == null)
            System.out.println("List is empty");

        // Go to last element
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
