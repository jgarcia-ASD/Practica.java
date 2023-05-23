public class bucles_for {
    public static void main(String[] args) {
        //otro tipo de bucle es el for

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        System.out.println("------------------------------------");
        //control de bucle
        int x = 1;

        while (x < 10) {
            System.out.println(x);
            if (x == 4) {
                break;
            }
            x++;
        }

        System.out.println("------------------------------------");

        for (int i = 1; i <= 10; i++) {
            System.out.println(x);
            if (i == 4) {
                break;
            }
        }

        System.out.println("------------------------------------");

        //Continue hace que salte la interracion actual y salte al siguiente codigo
        int con = 1;
        for (int i = 10; i <= 40; i+=10) {
            if (i == 30) {
                con ++;
                continue;
            }
            System.out.println(i+ " y "+con);
        }
    }
}
