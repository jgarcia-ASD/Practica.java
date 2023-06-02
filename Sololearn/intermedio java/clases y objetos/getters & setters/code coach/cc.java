import java.util.Scanner;

class Student {

    public String name;
    private int age;
    
    public int getAge() {
        //complete Getter
        return age;
    }
    public void setAge(int age) {
        //complete Setter
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
            this.age = 0;
        }
        
    }
}

public class cc {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String name = read.nextLine();
        int age = read.nextInt();
        Student student = new Student();
        student.name = name;
        
        //establecer la edad a través de Setter
        student.setAge(age);
        
        
        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.getAge());
    }
}