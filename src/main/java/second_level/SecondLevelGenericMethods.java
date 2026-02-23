package second_level;

public class SecondLevelGenericMethods<String, T, U, V> {
    private String stringVariable;
    private T element1;
    private U element2;
    private V element3;

    public SecondLevelGenericMethods(String stringVariable, T element1, U element2, V element3){
        this.stringVariable = stringVariable;
        this.element1 = element1;
        this.element2 = element2;
        this.element3 = element3;
    }

    public void printAttributes(){
        System.out.println("stringVariable = " + stringVariable + ", element1 = " + element1 + ", element2 = " + element2 + ", element3 = " + element3);
    }

    @SafeVarargs
    public final void printAll(String message, T... objects){
        System.out.println(message);
        for (T element : objects){
            System.out.println(element);
        }
    }
}
