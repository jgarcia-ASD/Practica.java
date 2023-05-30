//aqui importamos una biblioteca de java
import java.util.Scanner;

class Tomando_entradas {
    public static void main(String[] args) {
        System.out.println("Por favor ingrese su Nombre: ");
        //aquidefinimos en que variable queremos que se nos almacene lo que ingresamos por teclado
        Scanner sc = new Scanner(System.in);
        //aqui guardamos lo que ingresamos op teclado en una variable
        String name = sc.nextLine();
        System.out.println("Mucho gusto "+name);


        //ahora le pedimos que ingrese un numero 
        System.out.println("Por favor ingrese su edad: ");
        //para pedir otro dato no es necesario repetir la funcion Scanner sc = new Scanner(System.in);
        String age = sc.nextLine();
        System.out.println("Su edad es: "+age);

        /* Code coach
         * Calcular propinas
         * siempre das un apropina del 15% del importe de la factura para facilitar el calculo,decides escribir un programa que lo haga por ti
            public class Program {
                public static void main(String[] args) {
                    Scanner s = new Scanner(System.in);
                    double propina =s.nextDouble();
                    System.out.println(propina * 0.15);
                }
            }
         */
    }
}
