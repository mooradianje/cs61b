/* intlist v2*/
/* this helps to generate blank intlists*/
public class IntNode {
    public int item;
    public IntList next;
    
    public IntList(int i, IntList n) {
        item = i;
        next = n;
    }
}