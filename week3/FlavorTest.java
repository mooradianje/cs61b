/* from lecture 9
demonstrates the concept of HIDING*/

public class FlavorTest {
    public static void main(String[] args){
        MaxSList msl = new MaxSList(100);
        SList msl2 = msl;
        System.out.println(msl.flavor);
        System.out.println(msl2.flavor);
        msl.printFlavor();
        msl2.printFlavor();
        msl.printSuperFlavor();
        //msl2.printSuperFlavor();
    }
}