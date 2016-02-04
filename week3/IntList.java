/* from lecture 3*/
public class IntList {
    
    public int head;
    public IntList tail;
    
    public IntList(int h, IntList t){
        head = h;
        tail = t;
    }
    
    /* Returns the size of the IntList - reCURSIVELY*/
   public int size() {
       if (this.tail == null)
            return 1;
        int frontsize = this.tail.size();
        return frontsize + 1;
   }
   

   /**iterative methods are often uglier on recursive structures*/
   public int iterativeSize() {
       /*create a pointer var*/
       IntList p = this;
       int size = 0;
       while (p != null) {
           size = size + 1;
           p = p.tail;
       }
       return size;
   }
   
   /* method called get - returns ith item in list*/
   public int get(int i) {
        int item = 0;
        int p = this.head;
        while (item < i){
            p = this.tail.head;
            item = item + 1;
        }
        return p;
   }
    
    /*get from the lecture*/
    public int getrec(int i) {
        if (i==0) {
            return this.head;
        }
        return this.tail.get(i-1);
    }

    public String toString() {
        if(this.tail == null) return Integer.toString(this.head);
        return Integer.toString(head) + " " + this.tail.toString();
    }
    public static void main(String[] args) {
        IntList L = new IntList(10,null);
        L.tail = new IntList(15,null);
        System.out.println(L.head);
        System.out.println(L.tail.head);
        System.out.println(L.size());
        System.out.println(L.iterativeSize());
        System.out.println(L.get(1));
        System.out.println(L.getrec(1));
    }
}