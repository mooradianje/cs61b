public class SListLauncher {
    
    public static void main(String[] args) {
        SList x = new SList(100);
        x.insertBack(5);
        
        // x: 100 -> 5
        SList y = x;
        
        // y: 100 -> 5
        
        // how do we add to the front of x?
        x = insertFront(99);
        // x: 99 -> 100 -> 5
        //y: 100 -> 5
        
        //no way to have an empty list??
        x = new SList();
        //^ this is our goal       
    }
}