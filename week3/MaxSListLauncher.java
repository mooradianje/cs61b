/* from lecture 9

    for testing with the MaxSList class*/

public class MaxSListLauncher {
    
    public static void main(String[] args) {
        MaxSList msl = new MaxSList(33);
        msl.insertFront(100);
        msl.insertFront(25);
        System.out.println(msl.getFront());
        System.out.println(msl.getBack());
        //System.out.println(msl.size);
    }
    
}