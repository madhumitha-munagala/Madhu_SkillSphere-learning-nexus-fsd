package designpattern;

public class SingletonDemo {

    private static SingletonDemo obj = new SingletonDemo();

    private SingletonDemo() {
    }

    public static SingletonDemo getInstance() {
        return obj;
    }

    public static void main(String[] args) {

        SingletonDemo s1 = SingletonDemo.getInstance();
        SingletonDemo s2 = SingletonDemo.getInstance();

        if (s1 == s2) {
            System.out.println("Only One Object Created");
        }
    }
}