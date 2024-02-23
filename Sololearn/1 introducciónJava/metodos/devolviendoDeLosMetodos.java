public class devolviendoDeLosMetodos {
    //el tipo de retorno ejemplo tomamos este codigo
    public static void percv(double num, int porcentaje) {
        double res = num*porcentaje/100;
        System.out.println(res);
    }
    //la palabra clave void no sdice que el metodo no devuelve ningun valor

    //aahora hacemos uno q devuelva un valor double
    static double perc(double num, int porcentaje) {
        double res = num*porcentaje/100;
        //este comando return nos dice quye cuando se ejecute este return se sale del metodo automitacamente ignorand si hubiera codigo despues
        return res;
    }

    //ahora hagamos uno con un boolean
    static boolean check(int grade) {
        if (grade >= 70) {
            return true;
        } else {
            return false;
        }
    }

    //imprimamos
    public static void main(String[] args) {
        double x1 = perc(530, 23);
        System.out.println("El resultado es: "+x1);

        int x = 89;
        if (check(x) == true) {
            System.out.println("Congrats!");
        }
    }

}
