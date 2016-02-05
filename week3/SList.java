// from lecture 6a

/* much more user friendly & reasonable class
representing a list of numbers*/


public class SList {
    
    public IntNode front;
    public int size;
    
    public SList() {
        size = 0;
        /* fix for issues with the null case*/
        front = new IntNode(89724,null);
        //front  = null;
    }
    
    public SList(int x) {
        front = new IntNode(x,null);
        size = 1;
    }
    public void insertBack(int x) {
        IntNode p = front;
        
        // step p along until p.next = null
        // because this means that p is the last item
        if(front != null) {
            while (p.next != null) {
                p = p.next;
            }
            p.next = new IntNode(x,null);
            size = size + 1;
        }
        else {
            front = new IntNode(x,null);
            size = size+1;
        }
    }
    
    public void insertFront(int x) {
        front = new IntNode(x,front);
        size = size + 1;
    }
    
    /*returns number of items in this SList*/
    public int size() {
       return size;
       //return sizeHelper(front);
    }
 
 /* this is if we don't autocapture the size*/   
    private int sizeHelper(IntNode p) {
        /* returns the size of teh list of integers stored
        starting from intnode*/
        if (p==null)
            return 0;
        return 1 + sizeHelper(p.next);
    }
    /* returns front of list*/
    public int getFront() {
        return front.item;
    }
    /* returns back of list*/
    public int getBack() {
        if (size == 0) {
            System.out.println("Null SList");
            return 0;
        }
        IntNode p = front;
        while (p.next != null) {
                p = p.next;
            }
        return p.item;
    }
}