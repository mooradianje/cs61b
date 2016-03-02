import java.util.Objects;
class TestMaxSList {
    public static int numtests = 0;
    public static int numpass = 0;
        
    public static void testSize() {
        
        MaxSList L = new MaxSList(5);
        L.insertFront(99);
        boolean sizeEq = Objects.equals(2,L.size());
        System.out.println("Size Equal: " + sizeEq);
        if(sizeEq == false){
            System.out.println("Expected 2, got " + L.size());
            numpass = numpass - 1;
        }
        numtests = numtests + 1;
        numpass = numpass + 1;
    }

    
    public static void testEmptySize() {
        MaxSList L = new MaxSList();
        boolean nullEq = Objects.deepEquals(0,L.size());
        System.out.println("Empty MaxSList: " + nullEq);
        if(nullEq == false){
            System.out.println("Expected 0, got " + L);
            numpass = numpass - 1;
        }
        numtests = numtests + 1;
        numpass = numpass + 1;
    }
    
    public static void testOperationsOnEmptyList() {
        MaxSList L = new MaxSList();
        L.insertBack(85);
        System.out.println("InsertBack Success. L=" + L.getBack());
        L= new MaxSList();
        L.insertFront(99);
        System.out.println("InsertFront Success. L=" + L.getFront());
        boolean nullEq = Objects.deepEquals(1,L.size());
        System.out.println("Size Equals: " + nullEq);        
        if(nullEq == false){
            System.out.println("Expected 1, got " + L);
            numpass = numpass - 1;
        }
        numtests = numtests + 1;
        numpass = numpass + 1;
    } 
    
    public static void testGets() {
        MaxSList L = new MaxSList(5);
        L.insertFront(99);
        L.insertBack(100);
        boolean frontEq = Objects.deepEquals(99,L.getFront());
        System.out.println("Front Equals: " + frontEq);  
        boolean backEq = Objects.deepEquals(100,L.getBack());
        System.out.println("Back Equals: " + backEq);
        
        if(frontEq == false || backEq == false) numpass = numpass - 1;
        numtests = numtests + 1;
        numpass = numpass + 1;
    }
    
    public static void testMax() {
        MaxSList L = new MaxSList();
        int fail = 0;
        L.insertBack(50);
        if( Objects.deepEquals(50,L.max()) == false) {
            System.out.println("Simple Max Failed.");
            fail=1;
        }
        L.insertFront(300);
        L.insertBack(-9);
        L.insertFront(20);
        
        if(Objects.deepEquals(300,L.max())==false) {
            System.out.println("Multi-value Max Failed");
            fail=1;
        }
        numtests=numtests + 1;
        numpass = numpass + 1 - fail;
    }

    public static void main(String[] args) {
        testSize();
        //testEmptyList();
        testEmptySize();
        testOperationsOnEmptyList();
        testGets();
        testMax();
        
        System.out.println("Tests run: " + numtests + "   Tests Passed: " + numpass);
    }
}