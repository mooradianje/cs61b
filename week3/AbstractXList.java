// FROM LECTURE 10
//to capture redundancy of XList in a reusable way
//between getback() and get(i) - saves author of concrete class some work
public abstract class AbstractXList implements XList {

    /* returns back of list*/
    public int getBack(){
        return get(size());
    }

}