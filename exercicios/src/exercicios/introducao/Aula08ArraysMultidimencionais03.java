package exercicios.introducao;


public class Aula08ArraysMultidimencionais03 {
    public static void main(String[] args) {
        int[][] arrayM = new int[3][];

        arrayM[0] = new int[2];
        arrayM[1] = new int[3];
        arrayM[2] = new int[6];

        for (int[] arrayList: arrayM) {
            System.out.println("=============");
            for(int num: arrayList){
                System.out.print(num + " ");
            }
        }
    }
}
