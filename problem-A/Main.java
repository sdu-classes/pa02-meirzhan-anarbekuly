public class Main {
        public static void main(String[] args) {
            Animal a=new Animal("Java");
            Animal.Cat c= new Animal.Cat("Felix");
            Animal.Dog d=new Animal.Dog("John");
            Animal.Dog d2=new Animal.Dog("rock");
            c.greets();
            System.out.println(c);
            d.greets();
            d2.greets(d);
            System.out.println(d2);
        }
    }
