// FROM LECTURE 10

public interface XList {

    public void insertBack(int x) ;

    /*returns number of items in this SList*/
    public int size();

    /* returns back of list*/
    public int getBack();
    
        /* returns item in position i of list*/
    public int get(int i);
}