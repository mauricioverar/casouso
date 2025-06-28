import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception { // metodo estático main de arranque
        // throws Exception para manejar excepciones

        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario

        double total; // 0.0

        System.out.println("Ventas diarias");// metodo estatico println de la clase System para imprimir en consola

        double[] ventasSemana = new double[7]; // la longitud del array es 7, para los 7 dias de la semana

        System.out.println("Registro de ventas semanales de la panaderia: ");

        for (int i = 0; i < ventasSemana.length; i++) {
            System.out.print("Ingrese las ventas del dia " + (i + 1) + ": "); // 100-700
            ventasSemana[i] = scanner.nextDouble();
        }
        mostrarResumen(ventasSemana);

        scanner.close();
    }


    public static void mostrarResumen(double[] ventas) {
        double total = 0;
        System.out.println("Ventas diarias: ");
        for (int i = 0; i < ventas.length; i++) {
            System.out.println("Dia " + (i + 1) + ": " + ventas[i]);
            // total = total + ventas[i]; // acumulando el total de las ventas
            total += ventas[i]; // acumulando el total de las ventas
        }
        System.out.println("total de ventas: " + total); // 2800
        Double promedio = total / ventas.length; // promedio de las ventas
        System.out.println("Promedio de ventas: " + promedio); // 400.0
    }
}


