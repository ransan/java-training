package IPK.linkedlist;

public class DLNode {
    private DLNode next;
    private DLNode previous;
    private int value;

    public DLNode(int value) {
        this.value = value;
        this.next = null;
        this.previous = null;
    }

    public DLNode getNext() {
        return next;
    }

    public void setNext(DLNode next) {
        this.next = next;
    }

    public DLNode getPrevious() {
        return previous;
    }

    public void setPrevious(DLNode previous) {
        this.previous = previous;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
