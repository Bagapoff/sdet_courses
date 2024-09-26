public class Banana extends Fruit implements IWashable, IPeelable {

    int countInBunch;

    public Banana(){
        super();
        countInBunch = 5;
        setWeight(500);
        setName("Banana");
    }

    @Override
    public void cookFruit() {
        wash();
        peelAndEat();
    }

    @Override
    public void peelAndEat() {
        countInBunch --;
        setWeight(getWeight() - 100);
    }

    @Override
    public void wash() {
        setWeight(getWeight()-10);
    }
}
