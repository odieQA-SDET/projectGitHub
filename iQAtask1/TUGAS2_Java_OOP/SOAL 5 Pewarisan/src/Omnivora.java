public class Omnivora extends Animals {
  public void tampilkan() {
        String namaanimal="AYAM";
        String jenismakanan="SEMUA";
        String gigibinatang="TAJAM AND TUMPUL THEETH";

        Animals a = new Animals();
        a.inputData("AYAM", "SEMUA","TAJAM AND TUMPUL THEETH");
        a.tampilkandata();

        System.out.println("Hello I'm OMNIVORA, My Name is " +namaanimal+ " My Food " +jenismakanan+ " I Have " +gigibinatang+"");

        //    Jenis makanan binatang tersebut harus semua
        //     Jenis gigi binatang tersebut harus tajam dan tumpul

    }

  }

