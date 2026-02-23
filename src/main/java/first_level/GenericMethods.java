package first_level;

public class GenericMethods  <T, U, V> {
    private T element1;
    private U element2;
    private V element3;

    public GenericMethods(T element1, U element2, V element3){
        this.element1 = element1;
        this.element2 = element2;
        this.element3 = element3;
    }

    public void printElements(){
        System.out.println("element1 = " + element1 + "\n element2 = " + element2 + "\n element3 = " + element3);
    }

    @Override
    public String toString() {
        return "GenericMethods{" +
                "element1=" + element1 +
                ", element2=" + element2 +
                ", element3=" + element3 +
                '}';
    }
}
