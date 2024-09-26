

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Apple apple1 = new Apple();
        Banana banana = new Banana();

        apple.color = "Green";

        Apple.printColor();

        System.out.println(apple.color);
        System.out.println(apple1.color);



    }
}