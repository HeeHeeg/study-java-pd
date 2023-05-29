package Day3.car;

public class Main {
    public static void main(String[] args) {
        Electric tesla = new Electric(200);

        Oil sonata = new Oil(300);

        System.out.println(tesla.toString());
        System.out.println(sonata.toString());
    }
}
