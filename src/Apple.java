public class Apple extends Fruit implements IWashable{

    public Apple(){
        super();
        setName(getName() + " Apple");
        setWeight(300);
    }

    static String color = "Red";

    @Override
    public void sayNameAndWeight(){
        System.out.println("My name " + getName() + " and my weight is " + getWeight() + " and color is " + color);
    }

    @Override
    public void cookFruit() {
        wash();
        setName("Cooked Apple");
    }

    @Override
    public void wash() {
        setWeight(getWeight()-10);
    }

    static void printColor(){
        System.out.println(color);
    }
}
