
public class Maximizer {
    public static Comparable max(Comparable[] items) {
        int maxDex = 0;
        for (int i=0; i<items.length; i+=1) {
            int cmp = items[i].compareTo(items[maxDex]);
            
            if (cmp > 0) {
                maxDex = i;
            }
        }
        return items[maxDex];
    }


    public static void main(String[] args) {
        Dog[] dogs = {new Dog("Elyse",3), new Dog("Sture",9), new Dog("Artie",15)};
        Dog maxDog = (Dog) max(dogs);
        maxDog.bark();
        System.out.println(dogs[1].name);
        Dog testDog = new Dog("poobrain",200);
        
    }



}