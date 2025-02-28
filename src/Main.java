public class Main {
    public static void main(String[] args) {
        Zumbi zumbi1 = new Zumbi();
        Zumbi zumbi2 = new Zumbi();
        zumbi1.vida = 100;
        zumbi2.vida = 100;

        System.out.println("Zumbi1 vida: " + zumbi1.vida);
        System.out.println("Zumbi2 vida: " + zumbi2.vida);

        zumbi1 = zumbi2;
        System.out.println("Zumbi1 vida: " + zumbi1.vida);
        System.out.println("Zumbi2 vida: " + zumbi2.vida);


    }
}