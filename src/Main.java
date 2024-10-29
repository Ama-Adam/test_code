public class Main {
    public static void main(String[] args) {
        Cars mycar = new Cars();
        System.out.println(mycar.model);
        System.out.println(mycar.make);

        mycar.drive();
        mycar.brake();
    }
}