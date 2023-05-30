public class Haciendo_matematicas {
    public static void main(String[] args) {
        //hacemos una suma
        int x = 6;
        int y = 3;
        //podemos hacer la operacion en el propio println
        System.out.print("Suma dentro de println: ");
        //toca separar este codig ya que si lo juntamos nos agarra los numeros como String
        System.out.println(x+y);

        //el resultado de otra suma se le puede asignar a otra variable
        int suma = x + y;
        System.out.println("suma en una variable: "+suma);

        //hacemos una resta
        int salary = 90000;
        int tax    = 15000;
        //almacenamos la operacion en una variable
        int resultr = salary - tax;
        System.out.println("Resultado de la resta: "+resultr);

        //hacemos una multiplicacion
        int precio   = 1200;
        int cantidad =    2;
        //almacenamos la operacion en una variable
        int resultm  = precio * cantidad;
        System.out.println("Resultado de la multiplicacion: "+resultm);

        //hacemos una division
        int amount = 9000;
        int price  =   49;
        //almacenamos la operacion en una variable
        int resultD  = amount / price;
        System.out.println("Resultado de la Division: "+resultD);

        //hallamos el modulo
        int items = 23;
        int res   =  5;
        //almacenamos la operacion en una variable
        int resultMo  = items % res;
        System.out.println("Restante de la division: "+resultMo);

        //hacemos una concatenacion
        String name  = "Juan";
        String sname = "Garcia";
        //juntamos este texto en un avariable
        String fullName = name+" "+sname;
        System.out.println("El nombre completo es: "+fullName);

        /* Code coach
         * Resultado del torneo de ajedrez
         * es un programa para un torneo deajedrez que necesita calcular los puntos ganados opr un jugador. una victoria vale 1 punto mientras que en un empate vale 0,5 puntos
            public class Program {
                public static void main(String[] args) {
                    int wins = 54;
                    int ties = 31;

                    System.out.println(wins+0.5*ties);
                }
            }
         */

    }
}
