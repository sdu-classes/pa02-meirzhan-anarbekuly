public class Animal {
    private String name;


    Animal() {

    }

    public Animal(String name) {
        this.name = name;
    }

    public String toString() {
        return "Animal[name=\"" + name + "\"]";
    }


    public static class Mammal extends Animal {

        public Mammal(String name) {
            super(name);
        }

        Mammal() {

        }

        public String toString() {
            return String.format("Mammal[" + super.toString() + "]");
        }
    }

    public static class Cat extends Mammal {
        public Cat(String name) {
            super(name);
        }

        public void greets() {
            System.out.println("Meow");
        }

        @Override
        public String toString() {
            return String.format("Cat[%s]", super.toString());
        }
    }

    public static class Dog extends Mammal {

        public Dog(String name) {
            super(name);
        }

        public void greets() {
            System.out.println("Woof");
        }

        public void greets(Dog another) {
            System.out.println("Wooooof");
        }

        public String toString() {
            return String.format("Dog[%s]", super.toString());
        }
    }
}
