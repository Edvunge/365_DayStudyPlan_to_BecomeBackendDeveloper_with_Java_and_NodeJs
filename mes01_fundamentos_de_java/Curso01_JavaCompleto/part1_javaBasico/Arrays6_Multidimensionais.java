package mes01_fundamentos_de_java.Curso01_JavaCompleto.part1_javaBasico;

public class Arrays6_Multidimensionais {
    public static void main(String[] args) {
        int[] arrInt = {1, 2, 3};
        int[] arrInt2 = new int[3];
        int[] arrInt3 = new int[] {1, 2, 3};

  //      int[][] dias = new int[3][];
  //      dias[0] = new int[2];
  //      dias[1] = new int[]{1, 2, 3};
  //      dias[2] = new int[4];

        int[][] dias = {{0,0}, {1,2,3}, {0, 0, 0, 0}};
        for(int[] arr : dias) {
            for(int num : arr) {
                System.out.println(num);
            }
        }
    }
}
