public class Herbivora extends Animals {
    public void tampilkan() {
        String namaanimal="KAMBING";
        String jenismakanan="TUMBUHAN";
        String gigibinatang="TUMPUL THEET";

        Animals a = new Animals();
        a.inputData("KAMBING", "TUMBUHAN", "TUMPUL THEET");
        a.tampilkandata();

        System.out.println("HELLO I'M HERBIVORA, MY NAME IS " +namaanimal+ " My Food " +jenismakanan+ " I Have " +gigibinatang+ "");

            //    Jenis makanan binatang tersebut harus tumbuhan
            //     Jenis gigi binatang tersebut harus tumpul

        }
}
