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
        gm1.printElements();
        GenericMethods<String, String, Integer> gm2 = new GenericMethods<>("Hello", "World", 10);
        gm2.printElements();
        GenericMethods<GenericMethods, Person, Person> gm3 = new GenericMethods<>(gm2, person1, person2);
        gm3.printElements();
    }
}
