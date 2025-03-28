public class TestAnimals {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        // a) calling the methods in each object
        System.out.println("Calling methods directly:");
        d.setName("Dory");
        System.out.println("Fish name: " + d.getName());
        d.play();
        d.eat();
        d.walk();

        System.out.println("Cat name: " + c.getName());
        c.play();
        c.eat();

        a.eat();
        ((Fish) a).walk();

        e.eat();
        e.walk();

        p.setName("Whiskers");
        System.out.println("Pet (Cat) name: " + p.getName());
        p.play();


        // b) casting objects
        System.out.println("\nCasting objects:");
        if (a instanceof Fish) {
            Fish castedFish = (Fish) a;
            castedFish.setName("Nemo");
            System.out.println("Casted Fish name: " + castedFish.getName());
        }

        if (p instanceof Cat) {
            Cat castedCat = (Cat) p;
            castedCat.eat();
        }


        // c) using polymorphism
        System.out.println("\nUsing polymorphism:");
        Animal[] animals = {d, c, a, e};
        for (Animal animal : animals) {
            animal.eat();
        }


        // d) using super to call super class methods
        // We can add a method in Cat to call super class Animal's walk method
        class SuperCallingCat extends Cat {
            public SuperCallingCat(String name) {
                super(name);
            }

            public void callSuperWalk() {
                super.walk();
            }
        }
        System.out.println("\nUsing super to call super class methods:");
        SuperCallingCat superCat = new SuperCallingCat("SuperFluffy");
        superCat.callSuperWalk();
    }
}