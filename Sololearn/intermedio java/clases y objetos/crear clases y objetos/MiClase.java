
class Animal {
    //Declaramos un método ladre() en nuestra clase Animal
    void ladre() {
        System.out.println("Woof-Woof");
    }
}

public class MiClase {
    public static void main(String[ ] args) {
        Animal dog = new Animal();
        dog.ladre();
    }
}
