/*
 * Tipos de referencia
 * Un tipo de referencia almacena una referencia (o dirección) a la ubicación de la memoria donde se almacenan los datos correspondientes.
 * 
 * Cuando crea un objeto usando el constructor, crea una variable de referencia.
 * Por ejemplo, considere tener una clase Person definida:
 * El método celebrarCumpleaños toma un objeto Persona como su parámetro e incrementa su atributo.
 * Debido a que j es un tipo de referencia, el método afecta al objeto mismo y puede cambiar el valor real de su atributo.
 * 
 */

class MyClass {
    public static void main(String[ ] args) {
        Person j;
        j = new Person("John");
        j.setAge(20);
        celebrateBirthday(j);
        System.out.println(j.getAge());
  }
    
    static void celebrateBirthday(Person p) {
        p.setAge(p.getAge() + 1);
    }
}
class Person {
    private String name;
    private int age;
    
    Person (String n) {
        this.name = n;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int a) {
        this.age = a;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String b) {
        this.name = b;
    }
}
