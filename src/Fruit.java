public abstract class Fruit {


    private int weight = 100;

    private String name = "Fruit";

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public void sayNameAndWeight(){
        System.out.println("My name " + name + " and my weight is " + weight);
    }

    public abstract void cookFruit();
}
