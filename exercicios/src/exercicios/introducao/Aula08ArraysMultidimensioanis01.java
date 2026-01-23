package exercicios.introducao;

public class Aula08ArraysMultidimensioanis01 {
    public static void main(String[] args) {
        int[][] dias = new int [3][3];
        dias[0][1] = 1;
        dias[0][2] = 2;
        dias[0][3] = 3;
        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j <= dias[0].length; j++) {
                System.out.print(dias[i][j]);
            }
        }
    }
}
