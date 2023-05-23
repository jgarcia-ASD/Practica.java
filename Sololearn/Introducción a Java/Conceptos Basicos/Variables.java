public class Variables {
    public static void main(String[] args) {
        //un texto se diferencia por sus comillas ej: "Esto es un String"
        //ahora creemos un avariable tipo string
        String name;
        //demole un dato a esta variable
        name = "Hola";
        //ahora mostramos dicha variable en pantalla
        System.out.print(name);

        //ahora ahorremos lineas de codigo
        String sname = "Mundo";
        //podemos convinar texto con las variables
        System.out.print(" "+sname);

        System.out.println(" ");

        //una variable púede cambiar de valor a lo largo del programa
        sname = "Universo";
        System.out.print(name+" "+sname);

        /* me dan una variable y tengpo que asignarle todas las letras del alfabeto en ingles y mostrar dichas letras
            public class Program {
                public static void main(String[] args) {
                    String alphabet = "abcdefghijklmnopqrstuvwxyz";
                    System.out.println(alphabet);
                }
            }
         
         */
    }
}
