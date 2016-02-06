/* From lecture 6b*/
import java.util.Objects;

public class AListTest {
    public static int numtests = 0;
    public static int numpass = 0;
    
  //  public static void testSize() {
        
  //      AList L = new AList();
  //      boolean nullEq = Objects.deepEquals(0,L.size());
  //      System.out.println()
  //  }
    
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
        AList L = new AList();
        boolean nullEq = Objects.deepEquals(0,L.size());
        System.out.println("Empty SList: " + nullEq);
        if(nullEq == false){
            System.out.println("Expected 0, got " + L);
            numpass = numpass - 1;
        }
        numtests = numtests + 1;
        numpass = numpass + 1;
    }
    
    public static void testInsertAndSize() {
        AList L = new AList();
        L.insertBack(85);
        L.insertBack(99);
       // System.out.println("InsertFront Success. L=" + L.front.item);
        boolean sizeEq = Objects.deepEquals(2,L.size());
        System.out.println("Size Equals: " + sizeEq);        
        if(sizeEq == false){
            System.out.println("Expected 1, got " + L);
            numpass = numpass - 1;
        }
        numtests = numtests + 1;
        numpass = numpass + 1;
    } 
   
    public static void testInsertAndGet() {
        AList L = new AList();
        L.insertBack(99);
        L.insertBack(99);
        boolean back1Eq = Objects.deepEquals(99,L.getBack());
        System.out.println("Back1 Equals: " + back1Eq);
        L.insertBack(30);        
        boolean back2Eq = Objects.deepEquals(30,L.getBack());
        System.out.println("Back2 Equals: " + back2Eq);

        boolean getEq = Objects.deepEquals(99,L.get(1));
        System.out.println("Get Equals: " + getEq);
        
        if(back1Eq == false || back2Eq == false || getEq == false) numpass = numpass - 1;
        numtests = numtests + 1;
        numpass = numpass + 1;
    }
    
    public static void testDelete() {
        AList L = new AList();
        L.insertBack(99);
        L.insertBack(15);
        
        L.deleteBack();
        boolean backEq = Objects.deepEquals(99,L.getBack());
        System.out.println("Trimmed Back Equals: " + backEq);
        L.deleteBack();        
        boolean size0Eq = Objects.deepEquals(0,L.size());
        System.out.println("Final Size Equal: " + size0Eq);

        if(backEq == false || size0Eq == false) numpass = numpass - 1;
        numtests = numtests + 1;
        numpass = numpass + 1;
    }
    
    
    public static void main(String[] args) {
        testEmptySize();
        testInsertAndSize();
        testInsertAndGet();
        testDelete();
        //testOperationsOnEmptyList();
        //testGets();
        
        System.out.println("Tests run: " + numtests + "   Tests Passed: " + numpass);
    }
    
}