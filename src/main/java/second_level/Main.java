package second_level;

import first_level.Person;

public class Main {
    public static void main (String[] args){
        Person person1 = new Person("Joe", "Wright", 30);
        Person person2 = new Person("Laura", "McDougal", 35);
        Person person3 = new Person("Daniela", "Gonzalez", 45);
        SecondLevelGenericMethods<String, Person, String, Integer> slgm1 = new SecondLevelGenericMethods<>("Hi", person1, "How are you", 1);
        System.out.println("These are the objects introduced as varargs arguments: ");
        slgm1.printElements();
        slgm1.printAllElements("The varargs generic method is being printed", person3, person1, person2);
    }
}
