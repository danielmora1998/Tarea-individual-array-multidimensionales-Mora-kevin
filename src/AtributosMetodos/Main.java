package AtributosMetodos;

import java.util.Scanner;

/**
 *
 * @author danielmora
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nfil, ncol;

        System.out.println(" Digite el  numero de filas");
        nfil = sc.nextInt();

        System.out.println("Digite el numero de Columnas");
        ncol = sc.nextInt();

        System.out.println(" llenar primera matriz");

        int matrix[][] = new int[nfil][ncol];

        for (int i = 0; i < nfil; i++) {
            for (int j = 0; j < ncol; j++) {
                System.out.println("matriz [" + i + "]" + "[" + j + "]");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println(" llenar segunda matriz");

        int matrix2[][] = new int[nfil][ncol];

        for (int i = 0; i < nfil; i++) {
            for (int j = 0; j < ncol; j++) {

                System.out.println("matriz [" + i + "]" + "[" + j + "]");
                matrix2[i][j] = sc.nextInt();
            }

        }

        Matriz op1 = new Matriz(matrix, matrix2);

        op1.mostrarPrimera(nfil, ncol);
        op1.mostrarSegunda(nfil, ncol);
        op1.sumar(nfil, ncol);

    }

}
