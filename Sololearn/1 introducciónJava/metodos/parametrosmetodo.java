public class parametrosmetodo {
    //asi ingresamos datos en una variable
    public static void Bienvenido(String name) {
        System.out.println("Mucho gusto " + name);
    }

    //esta es una variable que pide3 dos datos
    public static void welcome(String name, int age) {
        System.out.print("Bienvenido "+name);
        System.out.println(" tu edad es "+age);
    }

    //parametros de metodo
    public static void perc(double num, int porcentaje) {
        double res = num*porcentaje/100;
        System.out.println(res);
    }

    public static void main(String[] args) {
        Bienvenido("Juanma");
        Bienvenido("Leidy");

        welcome("Juan", 18);

        perc(530, 23);
    }



}
