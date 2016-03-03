import java.util.Objects;


public class TestNegativeFinder {
    
    public static int numtests = 0;
    public static int numpass = 0;
    
    public static void testHasNegative() {
        
        XList L = new AList();
        L.insertBack(100);
        L.insertBack(55);
        boolean nonegEq = Objects.equals(false,NegativeFinder.hasNegative(L));
        System.out.println("NoNegative TestPass: " + nonegEq);
        L.insertBack(-5);
        boolean negEq = Objects.equals(true,NegativeFinder.hasNegative(L));
        System.out.println("Negative TestPass: " + negEq);        
        
        
        if(nonegEq == false|| negEq == false){
            System.out.println("Failed hasNegative Test");
            numpass = numpass - 1;
        }
        numtests = numtests + 1;
        numpass = numpass + 1;
    }
    
    public static void main(String[] args) {
        testHasNegative();
        
        
        System.out.println("Tests run: " + numtests + "   Tests Passed: " + numpass);
    }
    
    
    
}