/*array based list*/

public class AList {
    /* INVARIANTS:
        1:  The next item to be inserted goes to position [size]
        2:  The last item in the list is in position [size-1]
        3:  There are size items in the list
        4:  The ith item is in position i (....)
        5:  
        
        */
    int[] items;
    int size;
    /*empty alist*/
    public AList() {
        items = new int[100];
        size = 0;
    }
    
    public void insertBack(int x) {
        items[size] = x;
        size = size + 1;
    }
    
    public int getBack() {
        return items[size-1];
    }
    
    public int get(int i){
        return items[i];
    }
    
    /* deletion just means reduce the size in this context
    we don't forget about the last item*/
    public int deleteBack() {
         int oldBack = getBack();
         size = size-1;

         return oldBack;

    }
    
    public int size() {
        return size;
    }
}