package exercicios.introducao;

public class Aula08ArraysMultidimencionais02 {
    public static void main(String[] args) {
        int[] nomes = new int[]{1, 2};
        int[][] arrayInt = new int[3][];
        arrayInt[0] = nomes;
        arrayInt[1] = new int[3];
        arrayInt[2] = new int[6];
        int[][] arrayInt2 = {{1,2},{1,2},{123}};
        for (int[] arrayBase: arrayInt2){
            System.out.println("\n------------");
            for (int num: arrayBase){
                System.out.print(num+ " ");
            }
        }

    }
}
