/*Tipos de accesos
 * 
 * Las siguientes opciones están disponibles para atributos y métodos:
 * predeterminado: una variable o método declarado sin modificador de control de acceso está disponible para cualquier otra clase en el mismo paquete.
 * public: Accesible desde cualquier otra clase.
 * protected: proporciona el mismo acceso que el modificador de acceso predeterminado, con la adición de que las subclases pueden acceder a métodos y variables protegidos de la superclase (las subclases y las superclases se tratan en las próximas lecciones).
 * -privado: Accesible solo dentro de la propia clase declarada.
 */

class vehicle {
    private int maxSpeed;
    private int wheels;
    private String color;
    private double fuelCapacity;
  
    public void horn() {
      System.out.println("Beep!");
    }
}


public class ejemplo {
    
}
