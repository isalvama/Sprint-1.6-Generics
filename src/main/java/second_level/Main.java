package second_level;

import first_level.Person;

public class Main {
    public static void main (String[] args){
        Person person1 = new Person("Joe", "Wright", 30);
        Person person2 = new Person("Laura", "McDougal", 35);
        Person person3 = new Person("Daniela", "Gonzalez", 45);
        SecondLevelGenericMethods<String, Person, String, Integer> slgm1 = new SecondLevelGenericMethods<>("Hi", person1, "How are you", 1);
        System.out.println("These are the values assigned for the attributes of slgm1 instance: ");
        slgm1.printAttributes();
        slgm1.printAll("These are the elements passed as varargs arguments when calling the printAll() method: ", person3, person1, person2);
    }
}
