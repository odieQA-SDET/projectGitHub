public class Problem4_CetakTabelPerkalian {
  public static void main(String[] args) {
      int hasil;
      for (int x = 0; x <=9; x++){
          for (int y = 0; y <=9; y++) {
              hasil = x * y;
              System.out.print(hasil + " ");
          }
          System.out.println();
          }
      }
}