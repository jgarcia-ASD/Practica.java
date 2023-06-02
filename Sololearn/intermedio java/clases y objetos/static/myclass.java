/*
 * Estático
 * El mismo concepto se aplica a los métodos estáticos.
 * 
 * Ahora, el método horn se puede llamar sin crear un objeto:
 */
class Vehicle {
    public static void horn() {
        System.out.println("Beep");
    }
}

public class myclass {
    public static void main(String[ ] args) {
        Vehicle.horn();
    }
}
