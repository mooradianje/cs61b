/*array based list*/

// extends XList added in lecture 10
//changed to implement near end of lecture - INTERFACE
// end of lec10 EXTENDS ABSTRACT XLIST
public class AList extends AbstractXList{
    /* INVARIANTS:
        1:  The next item to be inserted goes to position [size]
        2:  The last item in the list is in position [size-1]
        3:  There are size items in the list
        4:  The ith item is in position i (....)
        5:  
        
        */
    private int[] items;
    private int size;
    /*empty alist*/
    public AList() {
        items = new int[100];
        size = 0;
    }
    
    /**resize items to be capacity C and 
    does the copy for you
    private bcos we dont want people to have to do this
    manually.**/
    private void resize(int c) {
        int[] newItems = new int[c];
        for (int i=0; i<items.length; i += 1) {
            newItems[i] = items[i];
        }
        items = newItems;
    }
    @Override
    public void insertBack(int x) {
        if(size == items.length) 
            //can be any factor - multiplicative is much better than additive
            resize(items.length * 2);
        items[size] = x;
        size = size + 1;
    }
    
    // removed as of end of lecture 10
    // getback redundancy with get(i) - from abstract class AbstractXList
    /*
    @Override
    public int getBack() {
        return items[size-1];
    }*/
    
    @Override
    public int get(int i){
        if (i>size)
            throw new IllegalArgumentException("i is too big");
        return items[i];
    }
    
    /* deletion just means reduce the size in this context
    we don't forget about the last item*/
    public int deleteBack() {
         int oldBack = getBack();
         size = size-1;

         return oldBack;

    }
    @Override
    public int size() {
        return size;
    }
}