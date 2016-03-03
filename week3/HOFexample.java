//example of higher ordre function using java interfaces 
//probably won't compile

/* Same as the python:
def tenX(x):
    return 10*x
def do_twice(f,x):
    return f(f(x))
print(do_twice(tenX,2))
*/
class HOFexample {
    interface IntUnaryFunction {
        int apply(int x);
    }
    
    public class TenX implements IntUnaryFunction {
        public int apply(int X) {
            return 10 * x;
        }
    }
    
    public class HoFDemo {
        public static int do_twice(IntUnaryFunction f, int x) {
            return f.apply(f.apply(x));
        }
    }
    
    public static void main(String[] args) {
        System.out.println(do_twice(new TenX(),5));
    }
}