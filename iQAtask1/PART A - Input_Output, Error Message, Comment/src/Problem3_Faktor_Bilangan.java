public class Problem3_Faktor_Bilangan {
    public static void main(String[] args) {
        System.out.println("INPUT 6");
        int nilai = 6;
        int tambah = 0;
        for (int a = 0; a <= nilai; a++) {
            tambah++;
            if (nilai % tambah == 0) {System.out.println(tambah);
            }}
        System.out.println("==============================");
        System.out.println("INPUT 20");
        int b = 20;
        int c = 0;
        for (int a = 0; a <= b; a++) {
            c++;
            if (b % c == 0) {
                System.out.println(c);
                           }
        }
    }
}