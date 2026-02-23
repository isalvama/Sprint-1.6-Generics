package first_level;

public class Main {
    static void main() {

        NoGenericMethods noGenericMethod1 = new NoGenericMethods(1, 2, 3);
        NoGenericMethods noGenericMethod2 = new NoGenericMethods(3, 1, 2);
        System.out.println(noGenericMethod1.getElement1() + noGenericMethod1.getElement2() + noGenericMethod1.getElement3());
        System.out.println(noGenericMethod2.getElement1() + noGenericMethod1.getElement2() + noGenericMethod1.getElement3());
        Person person1 = new Person("Joe", "Wright", 30);
        Person person2 = new Person("Laura", "Alvarez", 60);
        GenericMethods<String, Person, Integer> gm1 = new GenericMethods<>("Hello", person1, 10);
        System.out.println("gm1 elements:");
        gm1.printElements();
        GenericMethods<String, String, Person> gm2 = new GenericMethods<>("Hello", "World", person2);
        System.out.println("gm2 elements:");
        gm2.printElements();
        GenericMethods<Integer, String, Person> gm3 = new GenericMethods<>(35, "World", person1);
        System.out.println("gm3 elements:");
        gm3.printElements();
        GenericMethods<GenericMethods, Person, Person> gm4 = new GenericMethods<>(gm2, person1, person2);
        System.out.println("gm4 elements:");
        gm4.printElements();
    }
}
