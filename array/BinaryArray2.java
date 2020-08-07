public class BinaryArray2 {
  public static void main(String[] args) {
    int[][] arrs = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };

    for (int i = 0; i < arrs.length; i++) {
      for (int j = 0; j < arrs[i].length; j++) {
        System.out.print(arrs[i][j] + " ");
      }
      System.out.println("");
    }
  }
}