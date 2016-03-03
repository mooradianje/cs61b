/* similar to what we see in Head first Java, 
we will often create a test drive class */
/* from lecture 2*/
public class Dog implements Comparable<Dog> {
    public int size; /* says that dogs have a certain size*/
    public String name;
    
    /** compares - assumes obj is a dog  - will be fixed later **/
    public int compareTo(Dog obj) {
        return this.size - obj.size;
    }
    /* this is a constructor - it explains how to construct dogs
    in this case each dog must be created with an integer (size)
    same as python'
    s def __init__(self, startSize):
    */
    public Dog (String startname, int startSize) {
        size = startSize;
        name = startname;
    }
    /*why did static go away? - be patient*/
    /* this is a NON-STATIC METHOD
    it is invoked by an instance of a class
    Rule of thumb: if you use instance variables, 
    the method should be non-static*/
    public void bark() {
        if (size < 10) {
            System.out.println(name + " emits horrific yapping");
        } else if (size < 30) {
            System.out.println(name + " says: Bark!");
        } else {
            System.out.println(name + " says: woof woof");
        }
        
    }
    /* returns larger dog*/
    /* static - no dog is judging*/
    public static Dog maxDog(Dog d1,Dog d2) {
        if (d1.size > d2.size) {
            return d1;
        }
        return d2;
    }

}