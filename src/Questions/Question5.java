package Questions;

public class Question5 {
    public static void main(String[] args) {
        Base b = new Sub();
    }
}

class Base {
    static {
        System.out.println("Static");
    }

    public Base(String s) {
        System.out.println("Base " + s);
    }
}

class Sub extends Base {
    private final static String str = "Constructor";

    public Sub() {
        super(str);
        System.out.println("Sub " + str);
    }
}


