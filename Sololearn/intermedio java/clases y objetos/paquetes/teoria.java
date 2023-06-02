public class teoria {
    
}

/*
 * Paquetes
 * Los paquetes se utilizan para evitar conflictos de nombres y para controlar el acceso a las clases
 * 
 * Un paquete se puede definir como un grupo formado por tipos similares de clases, junto con subpaquetes
 * 
 * Crear un paquete en Java es bastante fácil. Simplemente haga clic con el botón derecho en su directorio src y haga clic en Nuevo->Paquete. Asigne un nombre a su paquete y haga clic en Finalizar
 * Notará que el nuevo paquete aparece en el directorio del proyecto. Ahora puede mover y crear clases dentro de ese paquete. Hemos trasladado nuestras clases de vehículos, contadores y animales a las muestras de paquetes
 * ej:
 * package samples;
 * 
 * Esto indica el paquete al que pertenece la clase
 * Ahora, necesitamos importar las clases que están dentro de un paquete en nuestro principal para poder usarlas
 * 
 * El siguiente ejemplo muestra cómo usar la clase Vehicle del paquete de ejemplos
 * import samples.Vehicle;
 * class MyClass {
 *  public static void main(String[ ] args) {
 *      Vehicle v1 = new Vehicle();
 *      v1.horn();
 *  }
 * }
 * 
 * Dos resultados principales ocurren cuando una clase se coloca en un paquete. Primero, el nombre del paquete se convierte en parte del nombre de la clase. En segundo lugar, el nombre del paquete debe coincidir con la estructura de directorios donde reside el archivo de clase correspondiente
 * 
 * 
 */