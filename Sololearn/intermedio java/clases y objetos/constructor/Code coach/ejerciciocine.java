/*
 * Constructores
 * Tu amigo es cajero en un cine. Él sabe que usted es un desarrollador de Java increíble, por lo que le pidió que lo ayudara y creara un programa que obtenga el título de la película, la fila y la información del asiento e imprima un nuevo boleto.
 * Complete el código existente agregando un constructor a la clase Ticket para que pueda inicializarse correctamente.
 * 
 * Entrada de muestra
 * Mandíbulas
 * 5
 * 1
 * 
 * Salida de muestra
 *  Película: Tiburón
 * Fila: 5
 * Asiento: 1
 * 
 * Puede averiguar los parámetros del constructor observando los tipos de datos que se ingresan.
 * 
 */


import java.util.Scanner;

class Main {
   public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       String movie = read.nextLine();
       int row = read.nextInt();
       int seat = read.nextInt();
       Ticket ticket = new Ticket(movie, row, seat);
       System.out.println("Movie: " + ticket.getMovie());
       System.out.println("Row: " + ticket.getRow());
       System.out.println("Seat: " + ticket.getSeat());
   }
}

class Ticket {
    private String movie;
    private int row;
    private int seat;
 
    //complete the constructor
     public Ticket(String m, int r, int s) {
         this.setMovie(m);
         this.setRow(r);
         this.setSeat(s);
     }
 
     public void setMovie(String m) {
         this.movie = m;
     }
 
     public String getMovie() {
         return movie;
     }
 
     public void setRow(int r) {
         this.row= r;
     }
     
     public int getRow() {
         return row;
     }
 
     public void setSeat(int s) {
         this.seat = s;
     }
 
     public int getSeat() {
         return seat;
     }
 }