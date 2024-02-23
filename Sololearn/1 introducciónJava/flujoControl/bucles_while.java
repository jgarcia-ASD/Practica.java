public class bucles_while {
    public static void main(String[] args) {
        int x = 0;
        /* 
        //existe otro condicional llamado while 
        while (x > 0) {
            System.out.println(x);
            x = x - 1;
        }
        */
        /* 
        //podemos usar otra forma para restar
        while (x > 0) {
            System.out.println("otra forma de while "+x);
            x--;
        }
        */
        /*
        //podemos usar un increment para cerrar un while
        while (x <= 10) {
            System.out.println(x);
            x++;
        }
        */

        //podemos usar un increment para cerrar un while
        while (x <= 10) {
            System.out.println(x);
            x = x+2;
        }

        //podemos hacer operaciones dentro de los whiles
        int sum = 0;
        int num = 0;

        while (num <= 100) {
            sum += num;
            num++;
        }
        System.out.println(sum);

        //bucles do while
        int y = 1;
        do {
            System.out.println(y);
            x++;
        } while(x < 5);
        

    }
}
