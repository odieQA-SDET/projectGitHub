public class Problem4_Faktor_BilanganII {
    public static void main(String[] args) {
        System.out.println("INPUT 6");
        int nilai = 6;
        int tambah = 6;
        for (int a = 1; a <= nilai; a++) {
            if (nilai % tambah == 0) {System.out.println(tambah);
            }
            tambah--; }
        System.out.println("==============================");
        System.out.println("INPUT 20");
        int b = 20;
        int c = 20;
        for (int a = 1; a <= b; a++) {
            if (b % c == 0) {
                System.out.println(c);
            }
            c--;
        }
    }
}