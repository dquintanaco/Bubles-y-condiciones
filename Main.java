import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        int numeroWhile = 0;
        String estacion;

        //PEDIDA DE NUMERO POR SCANNER
        System.out.println("Introduzca un numero y le indicamos si es positivo, negativo o 0");
        Scanner read = new Scanner(System.in);
        num = read.nextInt();


        //IF
        if (num > 0) {
            System.out.println("Positivo");
        } else if (num < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("0");
        }

        //WHILE
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        //DO WHILE
        do {
            numeroWhile++;
            System.out.println(numeroWhile);
        } while (numeroWhile < 3);

        //FOR
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        //PEDIDA DE ESTACION POR SCANNER
        System.out.println("Introduzca una estacion y le indicamos si tiene un error");
        estacion = read.next();
        read.close();

        //SWITCH
        switch (estacion.toLowerCase()) {
            case "otoño":
            case "invierno":
            case "primavera":
            case "verano":
                System.out.println("Correcto, has dicho: " + estacion.toLowerCase());
                break;
            default:
                System.out.println("Error, has indicado mal la estacion.");
        }
    }
}
