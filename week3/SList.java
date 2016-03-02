// from lecture 6a

/* much more user friendly & reasonable class
representing a list of numbers*/


public class SList {
    //private IntNode sentinel;
    private IntNode front;
    private int size;
    public String flavor = "Vanilla";
    
    public void printFlavor() {
        System.out.println("SList's Flavor is " + flavor);
    }
    public SList() {
        size = 0;
        /* fix for issues with the null case*/
        front = new IntNode(89724,null);
        //front  = null;
        //Chatty - tells that the SList Constructor was called
        System.out.println("The 0 argument SList constructor was called");
    }
    
    //constructor for slist
    public SList(int x) {
        front = new IntNode(235635,null);
        front.next = new IntNode(x,null);
        size = 1;
    }
    public void insertBack(int x) {
        System.out.println("SList's insert back was called");
        IntNode p = front;
        
        // step p along until p.next = null
        // because this means that p is the last item
        while (p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(x,null);
        size = size + 1;
    }
    
    // start with;
    // [???] -> 53
    // want to insert 16
    // a new node is 
    public void insertFront(int x) {
        System.out.println("SList's insert front was called");
        front.next = new IntNode(x,front.next);
        size = size + 1;
        
        /* other way of expressing it*/
        //IntNode oldFrontItem = front.next;
        //IntNode newFrontItem = new IntNode(x,oldFrontItem);
        //front.next = newFrontItem;
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
        return front.next.item;
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