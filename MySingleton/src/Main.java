public class Main {
    public static void main(String[] args) {
        MySingleton mySingleton = MySingleton.getInstance();
        System.out.println("First object creation reference "+Integer.toHexString(System.identityHashCode(mySingleton)));
        MySingleton mySingleton1 = MySingleton.getInstance();
        System.out.println("Second object creation reference "+Integer.toHexString(System.identityHashCode(mySingleton1)));
    }
}