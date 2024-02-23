/* Conversor de pies a pulgadas
 * 1 pie tiene 12 pulgadas
 * metodo convert() que tome el valor foot como su argumento y de como resultado el valor de las pulgadas 
 * el resultado debe estar en double
*/
import java.util.Scanner;

public class parametrosmetodo_Cc {

    public static void convert(Double num) {
        double pulgadas = num * 12;
        System.out.println(pulgadas);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();

        convert(num);
    }

}
