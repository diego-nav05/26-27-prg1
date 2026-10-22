package evaluaciones.retos.garciaDiego.reto002;

import java.util.Scanner;

class DevolverCambio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Concrete el precio total de los artículos:");
        final int PRECIO_TOTAL = (int) scanner.nextInt();
        System.out.println("La compra supone un total de " + PRECIO_TOTAL + "€");
        System.out.println("El cliente ha de abonar una cantidad igual o superior. Introduzca la cantidad abonada:");
        final int CANTIDAD_ABONADA = (int) scanner.nextInt();

        scanner.close();
    }

}
