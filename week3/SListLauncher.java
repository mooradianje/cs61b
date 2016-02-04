// from lecture 6a

public class SListLauncher {
    
    public static void main(String[] args) {
        SList x = new SList(100);
        System.out.println(x.front.item);
        x.insertBack(5);
        
        System.out.println(x.front.next.item);
        // x: 100 -> 5
        SList y = x;
        
        // y: 100 -> 5
        System.out.println(y.front.next.item);
        // how do we add to the front of x?
        x.insertFront(99);
        // x: 99 -> 100 -> 5
        System.out.println(x.front.item);
        System.out.println(x.front.next.item);
        //System.out.println(x.front.next.next.item);
        //y: 100 -> 5
        
        //no way to have an empty list??
        //x = new SList();
        //^ this is our goal       
    }
}