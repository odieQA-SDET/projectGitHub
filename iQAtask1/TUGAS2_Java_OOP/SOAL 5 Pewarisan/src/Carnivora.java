public class Carnivora extends Animals {
    public void tampilkan() {
            String namaanimal="SINGA";
            String jenismakanan="DAGING";
            String gigibinatang="TAJAM THEETH";

            Animals a = new Animals();
            a.inputData("SINGA", "DAGING","TAJAM THEETH");
            a.tampilkandata();

            System.out.println("Hello I'm CARNIVORA, My Name is " +namaanimal+ " My Food " +jenismakanan+ " I Have " +gigibinatang+ "");

            //    Jenis makanan binatang tersebut harus daging
            //     Jenis gigi binatang tersebut harus tajam

        }

    }