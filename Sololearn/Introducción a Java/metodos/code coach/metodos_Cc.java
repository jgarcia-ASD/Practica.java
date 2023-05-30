/*
 * BOT
 * haga un programa de respuesta automatica
 * las respuestas son 
 * usuario 1 = order confirmed
 * usuario 2 = info@sololearns.com
 * para cualquier otro mensaje try again
 * 
 * el codigo dado llama a un metodo llamado bot(), define el metodo q debe tomas una entrada string del usuario
 */
import java.util.Scanner;

public class metodos_Cc {
    
    public static void bot(int m) {
        if (m == 1) {
            System.out.println("Order confirmed");
        } else if (m == 2) {
            System.out.println("info@sololearn.com");
        } else {
            System.out.println("Try again");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        bot(m);
    }

}
