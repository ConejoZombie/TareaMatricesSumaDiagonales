/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareamatricessumadiagonales;

/**
 *
 * @author branj
 */
public class TareaMatricesSumaDiagonales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        sumamatrices(IniciarMatriz());
    }

    public static int[][] IniciarMatriz() {
        int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = (int) (Math.random() * 1000 + 1);
            }
        }

        return matriz;
    }

    public static void sumamatrices(int[][] matriz) {
        int sumatoriaDiagonalPrincipal = 0;
        int sumatoriaDiagonalInverza = 0;

        for (int i = 0; i < 3; i++) {  // fila
            for (int j = 0; j < 3; j++) {  // columna

                if (i == j) {
                    sumatoriaDiagonalPrincipal += matriz[i][j];
                }
                if ( (i + j) == matriz.length - 1) {
                    sumatoriaDiagonalInverza += matriz[i][j];
                }
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println("");
        }
        System.out.println("La sumatoria de la diagonal Principal es: " + sumatoriaDiagonalPrincipal);
        System.out.println("La sumatoria de la diagonal inverza es: " + sumatoriaDiagonalInverza);

    }

}
