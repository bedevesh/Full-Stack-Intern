class Dog {
    public static void Dog() {
        System.out.println("Dogs are cute ");
    }
}

class Cat extends Dog {
    public static void Cat() {
        System.out.println("Cats are mean ");
    }
}

public class Animal {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.Dog();
        cat.Cat();

    }
}
