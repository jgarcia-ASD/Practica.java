public class multiples_condiciones {
    public static void main(String[] args) {
        //necesitamos mas de una condicion en el if para usar estos operadores

        //&& el operador logico de and
        int age1 = 30;
        if (age1 > 18 && age1 < 50) {
            System.out.println("Bienvenido 1");
        }

        //|| el operadpr logico de or
        int age2   =  25;
        int height = 100;
        if (age2 > 18 || height < 150) {
            System.out.println("Bienvenido 2");
        }

        //! el operado logico de not
        int age3 = 25;
        if (!(age3 > 18)) {
            System.out.println("eres joven");
        } else {
            System.out.println("bienvenido 3");
        }

        //se pueden anidar muchas condiciones multiples
        String pais = "col";
        int age4 = 42;
        if ((pais == "us" || pais == "col") && (age4 > 0 && age4 < 100)) {
            System.out.println("Permitido");
        }


    }
}


