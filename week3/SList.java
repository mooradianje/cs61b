// from lecture 6a

/* much more user friendly & reasonable class
representing a list of numbers*/


public class SList {
    
    public IntNode front;
    
    
    public SList(int x) {
        front = new IntNode(x,null);
        
    }
    public void insertBack(int x) {
        IntNode p = front;
        
        // step p along until p.next = null
        // because this means that p is the last item
        while (p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(x,null);
    }
    
    public void insertFront(int x) {
        front = new IntNode(x,front);
    }
    
    public int getFront() {
        return front.item;
    }
}