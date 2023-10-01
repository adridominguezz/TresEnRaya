import java.util.Scanner;

public class App {

    public static void mostrarColumna(String[][] tresRaya) {
        for (int i = 0; i < tresRaya.length; i++) {
            // Recorremos las columnas
            for (int j = 0; j < tresRaya[i].length; j++) {
                // Imprimimos el elemento actual
                System.out.print(tresRaya[i][j] + " ");
            }
            // Agregamos un salto de línea después de cada fila
            System.out.println();
        }
    }

    public static void pedirPosicion(int player, String[][] tresRaya) {
        Scanner scanner = new Scanner(System.in);
        int fila = 0;
        int columna = 0;
        int num = 0;
        boolean prueba = false;

        do {
            System.out.print("Jugador " + player + ". Elige una fila: ");
            num = scanner.nextInt();
            if (num == 1 || num == 3 || num == 5) {
                fila = num;
                prueba = true;
            }
        } while (prueba != true);
        prueba = false;
        do {
            System.out.print("Jugador " + player + ". Elige una columna: ");
            num = scanner.nextInt();
            if (num == 1 || num == 3 || num == 5) {
                columna = num;
                prueba = true;
            }
        } while (prueba != true);

        if (player == 1) {
            tresRaya[fila][columna] = "O";
        } else {
            tresRaya[fila][columna] = "X";
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hola");
        String[][] tresRaya = {
                { " ", "1", "2", "3", "4", "5" },
                { "1", " ", "|", " ", "|", " " },
                { "2", "-", "-", "-", "-", "-" },
                { "3", " ", "|", " ", "|", " " },
                { "4", "-", "-", "-", "-", "-" },
                { "5", " ", "|", " ", "|", " " },
        };

        int contador = 0;
        int player = 1;
        // Recorremos las filas
        do {
            mostrarColumna(tresRaya);
            for (int i = 1; i < 3; i++) {
                player = i;
                pedirPosicion(player, tresRaya);
                mostrarColumna(tresRaya);
            }

        } while (contador != 9);
    }
}