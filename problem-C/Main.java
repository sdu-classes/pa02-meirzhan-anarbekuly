public class Main {
    public static void main(String[] args) {
        Person.Student p = new Person.Student("Michael", "Wall street 41", "Engineering", 3, 285.3);
        System.out.println(p);
        Person.Staff s = new Person.Staff("Jimmy", "Washington", "31 high school", 0);
        System.out.println(s);
    }
}
