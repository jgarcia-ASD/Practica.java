public class declaracion_switch {
    public static void main(String[] args) {
        int day = 5;
        //en lugar de muchas declaraciones if else, utilizamos switch que comprueba la igualdad de una variable con una lista de valores
        switch (day) {
            //case es la palabra clave para caso
            //luego de esta palabra va el resultado que va a evaluar ejemplo en case 1 esta diciendo que entra ahi cuando day == 1
            case 1:
                System.out.println("lunes");
                //este se usa para que apenas entre a uno y haga lo que hallamos programado se salga
                break;
            case 2:
                System.out.println("martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            //el caso default se usa cuand oningun de los casos anteriores conside
            default:
                System.out.println("Otro dia");
        }
    }
}
