/*
 * Estático
 * Cuando declara una variable o un método como estático, pertenece a la clase, en lugar de a una instancia específica. Esto significa que solo existe una instancia de un miembro estático, incluso si crea varios objetos de la clase o si no crea ninguno. Será compartido por todos los objetos.
 * 
 */

class Contar {
    public static int COUNT=0;
    Contar() {
        COUNT++;
    }
}


public class counter {
    public static void main(String[ ] args) {
        Contar c1 = new Contar();
        Contar c2 = new Contar();
        System.out.println(Contar.COUNT);
    }
}
