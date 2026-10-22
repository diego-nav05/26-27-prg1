package evaluaciones.retos.garciaDiego.reto002;

import java.util.Scanner;

class DevolverCambio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Concrete el precio total de los artículos:");
        final int PRECIO_TOTAL = scanner.nextInt();
        System.out.println("La compra supone un total de " + PRECIO_TOTAL + "€");
        System.out.println("El cliente ha de abonar una cantidad igual o superior. Introduzca la cantidad abonada:");
        final int CANTIDAD_ABONADA = scanner.nextInt();
        int cantidadADevolver = CANTIDAD_ABONADA - PRECIO_TOTAL;
        final int VALOR_BILLETE_100 = 100;
        final int VALOR_BILLETE_50 = 50;
        final int VALOR_BILLETE_20 = 20;
        final int VALOR_BILLETE_10 = 10;
        final int VALOR_BILLETE_5 = 5;
        final int VALOR_MONEDA_2 = 2;
        final int VALOR_MONEDA_1 = 1;
        int numeroDeBilletesDe100 = cantidadADevolver / VALOR_BILLETE_100;
        System.out.println(numeroDeBilletesDe100);
        
        scanner.close();
    }

}
