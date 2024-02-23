// creamos una clase con sus respectivos atributos
class auto {
    int maxSpeed;
    int wheels;
    String color;
    double fuelCapacity;  
  
    void horn() {
      System.out.println("Beep!");
    }  
}

public class vehicle {
    public static void main(String[ ] args) {
        auto v1 = new auto();
        auto v2 = new auto();
        v1.color = "red";
        v2.horn();
        
    }
}