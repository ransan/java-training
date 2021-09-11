package IPK.linkedlist;

public class SLNode {
    private SLNode next;
    private int value;

    public SLNode(int value) {
        this.value = value;
        this.next = null;
    }

    public SLNode getNext() {
        return next;
    }

    public void setNext(SLNode next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
