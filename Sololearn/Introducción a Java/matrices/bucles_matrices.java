public class bucles_matrices {
    public static void main(String[] args) {
        //podemos usar .lenght para saber cuantos elementos tiene un array
        int[] ages = {18, 33, 24, 64, 45};
        //y ahora .length nos deberia decir 5
        System.out.println("el total de indices es "+ages.length);
         
        //si quieres mostrar todos los datos de una matriz puedes usar un for
        for (int i = 0; i < ages.length; i++) {
            System.out.println("indice "+i+" es "+ages[i]);
        }

        //sumar todos los valores de una matriz
        int sum = 0;
        for (int i = 0; i < ages.length; i++) {
            sum += ages[i];
        }
        System.out.println("la suma de todos los valores es "+sum);

        //for-each
        //este bucle facilita el leerlo despues para entender que esta realizando
        int[] nums = {2, 3, 5, 7,};

        for (int i : nums) {
            //este valor asigna autamaticamente a i el valor deñ indice 0 hasta el final
            System.out.println("valor de array nums "+i);
        }

        
        //usemos for each para hacer una suma
        int sum1 = 0;
        for (int i : ages) {
            sum1 += i;
        }
        System.out.println("Sua con for each "+sum1);

    }
}
