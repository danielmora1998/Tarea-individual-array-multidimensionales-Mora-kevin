package AtributosMetodos;

// Mora Gonzalez Kevin Daniel

/**
 *
 * @author danielmora
 */
public class Matriz {

    int matriz1[][];
    int matriz2[][];

    public Matriz(int[][] matriz1, int[][] matriz2) {
        this.matriz1 = matriz1;
        this.matriz2 = matriz2;
    }

    public void mostrarPrimera(int fil, int col) {

        for (int i = 0; i < fil; i++) {

            for (int j = 0; j < col; j++) {

                //System.out.println("Primera matriz");
                System.out.print(matriz1[i][j]);

            }
            System.out.println("");
        }

        System.out.println("-------------------------");

    }

    public void mostrarSegunda(int fil, int col) {

        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {

                //System.out.println("Segunda matriz");
                System.out.print(matriz2[i][j]);
            }
            System.out.println("");
        }
        System.out.println("-------------------------");
    }

    public void sumar(int fil, int col) {
        int suma;
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {

                suma = matriz1[i][j] + matriz2[i][j];

                System.out.print(suma + "----");

            }
            System.out.println("");
        }

    }

}
