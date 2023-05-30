public class Condicionales {
    public static void main(String[] args) {
        //hagamos un condicional facil
        /*
         * < menor q
         * > mayor q
         * != no igual a
         * == igual a
         * <= menor o igual que
         * >= mayor o igual que
         */
        int age = 24;
        if (age >= 18) {
            System.out.println("Bienvenido");
        }

        int numero = 8;
        if (numero == 8) {
            System.out.println("Bingo");
            
        }

        //Declaracion else esto es para cuando la condicion no c cumple
        int ages = 30;

        if (ages < 16) {
            System.out.println("Eres muy joven");   
        } else {
            System.out.println("Bienvenido tienes la edad correcta");
        }

        //Declaracion anidadas if es para cuando necesitamos que se cumplan dos condiciones
        int edad = 25;
        if (edad > 0) {
            if (edad > 16) {
                System.out.println("Bienvenido una vez mas");
            } else {
                System.out.println("eres muy joven");
            }
        } else {
            System.out.println("Error");
        }
        
        //declaraciones else if en ves de anidar muchos ifs podemor usar el else if
        int años = 25;
        if (años <= 0) {
            System.out.println("Error");
        } else if (años <= 16) {
            System.out.println("Eres joven");
        } else if (años < 100) {
            System.out.print("bienvenido else if");
        } else {
            System.out.println("Enserio!?");
        }


    }
}
