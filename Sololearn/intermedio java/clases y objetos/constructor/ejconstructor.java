/*
 * Se puede usar un constructor para proporcionar valores iniciales para los atributos del objeto.
 * 
 * - El nombre de un constructor debe ser el mismo que su nombre de clase.
 * - Un constructor no debe tener un tipo de retorno explícito.
 * 
 * Ejemplo de un constructor:
 * public class Vehicle {
 *  private String color;
 *  Vehicle() {
 *      color = "Red";
 *  }
 * }
 * 
 * El método Vehicle() es el constructor de nuestra clase, por lo que cada vez que se crea un objeto de esa clase, el atributo de color se establecerá en "Rojo".
 * Un constructor también puede tomar parámetros para inicializar atributos.
 * public class Vehicle {
 *  private String color;
 *  Vehicle(String c) {
 *      color = c;
 *  }
 * }
 * 
 * consejo
 * Puede pensar en los constructores como métodos que configurarán su clase de forma predeterminada, por lo que no necesita repetir el mismo código cada vez.
 */

/*
 * Uso de constructores
 * Se llama al constructor cuando crea un objeto usando la nueva palabra clave.
 * 
 * Ejemplo:
 * public class MyClass {
 *  public static void main(String[ ] args) {
 *      Vehicle v = new Vehicle("Blue");
 *  }
 * }
 * 
 * 
 * Esto llamará al constructor, que establecerá el atributo de color en "Azul".
 * 
 * 
 */
class Vehicle {
    private String color;
    
    Vehicle() {
        this.setColor("Red");
    }
    Vehicle(String c) {
        this.setColor(c);
    }
    
    // Setter
    public void setColor(String c) {
        this.color = c;
    }
    
    // Getter
    public String getColor() {
        return color;
    }
}

public class ejconstructor {
    public static void main(String[] args) {        
        //color will be "Red"
        Vehicle v1 = new Vehicle();
        
        //color will be "Green"
        Vehicle v2 = new Vehicle("Green"); 
        
        System.out.println(v1.getColor());
        System.out.println(v2.getColor());
    }
}
