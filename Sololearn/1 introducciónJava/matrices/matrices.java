
public class matrices {
    public static void main(String[] args) {
        //creemos una matriz de numeros 
        int[] ages;
        //ahora digamole la cantidad de datos que tiene esa matriz
        ages = new int[5];

        //podemos hacer esto mismo en una linea de codigo
        int[] años = new int[5];

        //ahora tengamos acceso a dicha matriz
        ages[2] = 25;

        //las matrices empiezan desde el indice 0
        ages[0] = 18;

        //para imprimir un dato especifico de una matriz es
        System.out.println("Esta matriz en ages indice 0: "+ages[0]);
        //si queremos imprimir todos los datos de un arrayt hacemos un for
        int c = 0;
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] > 0) {
                System.out.println("Esta matriz en ages pero dentro del for y indice "+i+" es: "+ages[i]);   
            } else {
                c++;
            }    
        }
        System.out.println("Esta matriz es ages tiene "+c+" indices vacios");
        //.lenght lo explicamos en bucles sobre matrices
        System.out.println("Este es un array vacio pero tiene "+años.length+" indices");

        //ya que sabemos todo esto rellenemos un array en una linea
        String[] names = {"A", "B", "C", "D"};
        //imprimamos C
        System.out.println(names[2]);  


    }
}
