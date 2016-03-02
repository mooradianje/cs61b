/** from lecture 9**/

// extension of SList - it has max() functionality
// extends means 'is-a'
// NOTE: does not include constructors
public class MaxSList extends SList {
    //initialize max with lowest integer value possible
    //tests hiding - overrides the SList varialbe
    public String flavor = "MaxSList Flavored";
    private int max = -Integer.MIN_VALUE;
    
    @Override
    public void printFlavor() {
        // the static type of 'this' is MaxSList
        //therefore we use the flavor value associated with MaxSList!
        System.out.println("MaxSLists's Flavor is " + flavor);
    }    
    
    public void printSuperFlavor() {
        super.printFlavor();
    }
    /*every constrcutor must START with a call to a superclass constructor*/
    
    /* if there are NO constructors at all, than the no-arument constructor
    will by default call the super class's no argument constructor*/
    
    //have to explicitly call the default no-argument constructor
    public MaxSList() {
        //COMMANDS HERE WOULD NOT WORK
        super();
        //COMMANDS HERE WOULD WORK
    }
    public MaxSList(int x){
        //makes a call to the super class's constructor
        //that takes an int 
        
        //Since MaxSList is-an SList, SList is the 'super' class of MaxSList
        super(x);
        max=x;
    }
    
    public int max() {
        return max;
    }
    
    // @Override will OVERRIDE the super class's method
    //Inserts into front (using super) and updates max if necessary
    @Override
    public void insertFront(int x) {
        System.out.println("maxSList's insertFront was called");
        super.insertFront(x);
        if (x > max) {
            max = x;
        }
    }
    
    // inserts into back (using super) and updates max if necessary
    @Override
    public void insertBack(int x) {
        System.out.println("maxSList's insertBack was called");      
        super.insertBack(x);
        if (x > max) {
            max = x;
        }
    }    
}

