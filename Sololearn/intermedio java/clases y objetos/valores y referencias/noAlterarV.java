/*
 * Tipos de valores
 * Los tipos de valor son los tipos básicos e incluyen byte, short, int, long, float, double, boolean y char.
 * 
 * Estos tipos de datos almacenan los valores que se les asignan en las ubicaciones de memoria correspondientes.
 * 
 * Entonces, cuando los pasa a un método, básicamente opera en el valor de la variable, en lugar de en la variable misma.
 * 
 */

class MyClass {
    public static void main(String[ ] args) {
        int x = 5;
        addOneTo(x);
        System.out.println(x);       
    }

    static void addOneTo(int num) {
        num = num + 1;
    }
}
