public class martices_multidimensionales {
    public static void main(String[] args) {
        //asi declaramos una matriz multidimensional
        int[][] ejemplo = {{1,2,3}, {4,5,6}};

        //ahora guardemos un valor en un avariable, el primero es [numero de la matriz] y el segundo es [elemento de la matriz]
        int x = ejemplo[1][0];
        System.out.println(x);

        //si quieres para ordenar el codigo pedes guardar la variable asi:
        /*
            int[][] ejemplo = {
                {1,2,3}, 
                {4,5,6}
            };
         * 
         */

         //ahora recorramos una matriz multidimencional para esto usamos dos for
         //hacemos uno para que recorra la cantidad de arrays
        for (int i = 0; i < ejemplo.length; i++) {
            //hasemos el siguiente para que recorra el interior de los arrays
            for (int j = 0; j < ejemplo[i].length; j++) {
                System.out.println("este es un array multidimensional "+ejemplo[i][j]);
            }
        }

    }
}
