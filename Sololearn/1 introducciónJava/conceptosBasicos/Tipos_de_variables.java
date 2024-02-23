public class Tipos_de_variables {
    public static void main(String[] args) {
        //existen mas tipos de variables

        //int para los numeros enteros
        int age = 42;
        System.out.println(age);
        
        //double para decimales
        double weight = 12.5;
        System.out.println(weight);

        //float para decimales
        float height = 1.94f;
        System.out.print(height);

        /*
         * Diferencias entre float vs double 
         * por defecto, los valores decimales son del tipo double. float utiliza menos almacenamiento en la memoria, pero no es ta preciso como el tipo double por lo que se recomienda solo usar douuble cuando el uso de memoria es critica
         */

        //char para un solpo caracter
        char letter = 'B';
        System.out.println(letter);

        //boolean para valores true o false
        boolean isOpen = false;
        System.out.print(isOpen);


        /* Ejercicio de code coach
         * Visualisacion el saldo de la cuenta
         * el codigo debe declarar una variable label y balance, les debe asignar valores
            public class Program {
                public static void main(String[] args) {
                    String label = "Balance";
                    double balance = 599.84;

                    System.out.println(label);
                    System.out.println(balance);
                }
            }
         */
    }
}
