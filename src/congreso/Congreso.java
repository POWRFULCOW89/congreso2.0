package congreso;

import java.util.Scanner;

public class Congreso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*Arreglo IA = new Arreglo();
        Arreglo Redes = new Arreglo();
        Arreglo Desarrollo_Software = new Arreglo();
        Arreglo Tendencia_TICS = new Arreglo();
         */
        int op = 0;
        do {
            System.out.println("CONFERENCIAS QUE OFRECE LA UAT");
            System.out.println("Que evento deseas presenciar");
            System.out.println("1.-IA");
            System.out.println("2.-Redes");
            System.out.println("3.-Desarrollo de Software");
            System.out.println("4.-Tendencia TICS");
            System.out.println("5.- Ver detalles generales");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    //IA.menu_operaciones();
                    break;
                case 2:
                    //Redes.menu_operaciones();
                    break;
                case 3:
                    //Desarrollo_Software.menu_operaciones();
                    break;
                case 4:
                    //Tendencia_TICS.menu_operaciones();
                    break;
            }

        } while (op > 5);
    }

}
