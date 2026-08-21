package annotations;

class Animal {

    @Deprecated
    void sound() {
        System.out.println("Animal Sound");
    }
}

public class AnnotationDemo {

    public static void main(String[] args) {

        Animal a = new Animal();
        a.sound();
    }
}