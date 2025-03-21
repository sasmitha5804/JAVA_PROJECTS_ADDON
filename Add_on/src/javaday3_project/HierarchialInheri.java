package javaday3_project;

class Bird {
    void sound() {
        System.out.println("Bird make sounds");
    }
}

class sparrow extends Bird {
    void bark() {
        System.out.println("sparrow sings song");
    }
}

class Cat extends Bird {
    void meow() {
        System.out.println("Cat meows");
    }
}

public class HierarchialInheri {
    public static void main(String[] args) {
        sparrow d1 = new sparrow();
        Cat c1 = new Cat();
        
        d1.sound();
        d1.bark();
        c1.meow();
    }
}
