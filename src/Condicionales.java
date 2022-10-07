import java.util.Scanner;

public class Condicionales {

    public static void main(String[] args) {

        int opcion;
        Scanner scan = new Scanner(System.in);

        System.out.println("\n" +
                "1.- Condicional If \n" +
                "2.- Ciclo While \n" +
                "3.- Ciclo Do While \n" +
                "4.- Ciclo For \n" +
                "5.- Condicional Switch \n" +
                "0.- Salir");

        System.out.println("Ingresa el tipo de condicional: \n");
        opcion = scan.nextInt();


        switch (opcion) {

            case 1:
                System.out.println("If \n");
                int numeroif = -10;
                if (numeroif < 0) {
                    System.out.println("la variable numeroif es negativa = " + numeroif);
                }
                if (numeroif > 0) {
                    System.out.println("La variable numeroif es positiva= " + numeroif);
                }
                if (numeroif == 0) {
                    System.out.println("La variable es igual a " + numeroif);
                }
                break;


            case 2:
                System.out.println(" Ejercicio de While\n");
                //ejercicio While
                int numeroWhile = 0;
                while (numeroWhile < 3) {
                    numeroWhile++;
                    System.out.println("Incrementa la variable numeroWhile: " + numeroWhile);
                }
                break;


            case 3:
                System.out.println("Ejercicio de Do While\n");
                int numeroDoWhile = 3;

                do {
                    System.out.println("numeroDoWhile = " + numeroDoWhile);
                    numeroDoWhile++;
                    System.out.println("Incrementa la variable numeroDoWhile: " + numeroDoWhile);

                } while (numeroDoWhile < 3);
                break;


            case 4:
                System.out.println("Ejercicio Ciclo For \n");
                int numeroFor=0;

                for (int i = 0; numeroFor <= 3; i++) {
                    System.out.println("Iteracion = " + i);
                    System.out.println("La variable numeroFor a incrementado = " + numeroFor);
                    numeroFor++;
                }
                break;


            case 5:
                System.out.println("Ejercicio Switch \n");
                String estacion = "invierno";

                switch (estacion) {

                    case "primavera":
                        System.out.println("Estacion priavera, preparate para ver las flores.");
                        break;
                    case "verano":
                        System.out.println("Estacion verano, prepara tu vikini");
                        break;
                    case "otoño":
                        System.out.println("Estacion Otoño, prearate para ver las flore caer");
                        break;
                    case "invierno":
                        System.out.println("Estacion Invierno, prepara tu sueter para el frio");
                        break;
                    default:
                        System.out.println("Opcion por default");
                }
                break;

            case 0:
                break;

        }

    }

}
