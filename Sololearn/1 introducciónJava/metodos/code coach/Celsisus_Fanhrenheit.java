/*Celsisus a harenheit
 * estas haciendo un conversor de celsisus a fahrenheit
 * escribe un metodo que tome el calor celsius como argumento y devuelva el valor fahrenheit correspondiente
 * 
 * ejemplo entrada 36
 * ejemplo de salida 96.8
 * 
 * el codigo toma el alor celsius como entrada y lo pasa a un metodo fahr(), que necesitas crear
 * 
 * para calcular el valor fahrenheit se utiliza la siguiente ecuacion: 1.8 * celsius + 32
 */
import java.util.Scanner;

public class Celsisus_Fanhrenheit {
    
    static double fahr(double c) {
        
        double f = 1.8 * c+32;

        return f;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();

        System.out.println(fahr(c));
    }
}
