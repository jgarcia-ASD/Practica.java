import java.util.Scanner;

class main {
   public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       int num1 = read.nextInt();
       int num2 = read.nextInt();

       //tu codigo va aqui
       double r = Math.pow(num1, num2);

       System.out.println(r);
       
   }
}
