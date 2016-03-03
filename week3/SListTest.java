/* From lecture 6b*/
import java.util.Objects;

public class SListTest {
    public static int numtests = 0;
    public static int numpass = 0;
    
    public static void testSize() {
        
        SList L = new SList(5);
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
    
 /*   public static void testEmptyList() {
        SList L = new SList();
        boolean nullEq = Objects.deepEquals(null,L.front);
        System.out.println("Null SList: " + nullEq);
        if(nullEq == false){
            System.out.println("Expected null, got " + L);
            numpass = numpass - 1;    
        }
        numtests = numtests + 1;
        numpass = numpass + 1;
    }*/
    
    
    public static void testEmptySize() {
        SList L = new SList();
        boolean nullEq = Objects.deepEquals(0,L.size());
        System.out.println("Empty SList: " + nullEq);
        if(nullEq == false){
            System.out.println("Expected 0, got " + L);
            numpass = numpass - 1;
        }
        numtests = numtests + 1;
        numpass = numpass + 1;
    }
    
    public static void testOperationsOnEmptyList() {
        SList L = new SList();
        L.insertBack(85);
        System.out.println("InsertBack Success. L=" + L.getBack());
        L= new SList();
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
        SList L = new SList(5);
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
    
    public static void testGeti() {
        SList L = new SList(5);
        L.insertFront(99);
        L.insertBack(100);
        L.insertBack(300);
        L.insertBack(3);
        L.insertBack(25);
        //99,5,100,30,3,25
        boolean getEq = Objects.deepEquals(100,L.get(2));
        System.out.println("MidGet: " + getEq);  
        boolean getEq2 = Objects.deepEquals(25,L.get(5));
        System.out.println("EndGet: " + getEq2);  
        boolean getEq3 = Objects.deepEquals(0,L.get(6));
        System.out.println("NonValue Equals: " + getEq3);          
        if(getEq == false || getEq2 == false || getEq3 == false) numpass = numpass - 1;
        numtests = numtests + 1;
        numpass = numpass + 1;
    }    
    

    public static void main(String[] args) {
        testSize();
        //testEmptyList();
        testEmptySize();
        testOperationsOnEmptyList();
        testGets();
        testGeti();
        
        System.out.println("Tests run: " + numtests + "   Tests Passed: " + numpass);
    }
    
}