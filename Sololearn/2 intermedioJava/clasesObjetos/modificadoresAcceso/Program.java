/*
 * Modificadores de acceso
Eres un tour manager y necesitas tener una lista de países junto con sus capitales.

Tiene un programa que crea un objeto País y debe generar el nombre y la capital, pero algo sale mal.

Tarea

Cambie los modificadores de acceso de los campos de clase de país para realizar la salida requerida.
 */


public class Program
{
	public static void main(String[] args) {
	    Country c = new Country();
	    c.name = "France";
	    c.capital = "Paris";
	    System.out.println("Country:  " + c.name);
	    System.out.println("Capital:  " + c.capital);
}
	
	
}
class Country{
    //change the code below
    public String name;
    public String capital;
}