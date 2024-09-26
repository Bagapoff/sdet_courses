package Questions;

public class Question1
{
    public static void main(String[] args){
        A a = new B();
        a.test(5);
    }
    // Что выведет код?
}

class A {
    public void test(Object obj){
        System.out.println("Object");
    }
}

class B extends A{
    public void test(Integer obj){
        System.out.println("Integer");
    }
}


