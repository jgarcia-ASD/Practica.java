import java.util.Scanner;

class Customer {
    //agregue todos los atributos necesarios aquí
    String firstName;
    String secondName;
    int age;
    int roomNumber;
   
    public void saveCustomerInfo() {
        System.out.println("First name: " + firstName);
        System.out.println("Second name: " + secondName);
        System.out.println("Age: " + age);
        System.out.println("Room number: " + roomNumber);
    }
 }

public class main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String firstName = read.nextLine();
        String secondName = read.nextLine();
        int age = read.nextInt();
        int roomNumber = read.nextInt();
        Customer customer = new Customer();
        //configurar los datos del cliente para objetar aquí
        customer.firstName = firstName;
        customer.secondName = secondName;
        customer.age = age;
        customer.roomNumber = roomNumber;
      
        customer.saveCustomerInfo();
   }
}
