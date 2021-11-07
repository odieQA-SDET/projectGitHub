import java.util.Scanner;
    public class Bekasi extends Ongkir
    {
        public void bekasi() {
            double Volume,Panjang,Lebar,Tinggi,Biayakg,beratPerkg,Bayar;

            Scanner PP = new Scanner(System.in);
            System.out.println("TUJUAN KOTA BEKASI");
            System.out.println("===============================================");
            System.out.println("Silahkan Masukan Volume Barang dan Harga Per Kg");
            System.out.println("Input Panjang: ");
            Panjang = PP.nextDouble();
            System.out.println("Input Lebar:   ");
            Lebar = PP.nextDouble();
            System.out.println("Input Tinggi: ");
            Tinggi = PP.nextDouble();
            System.out.println("Input Berat Barang: ");
            beratPerkg = PP.nextDouble();

            Volume = Panjang*Lebar*Tinggi;
            System.out.println("Volumetrik Barang adalah : "+Volume+" m3");

            if (Volume <= 50) {
                Volume =1;
                Biayakg=6500;
                Bayar = (Volume*beratPerkg*Biayakg)+1500;
                System.out.println("Ongkir adalah Rp: "+Bayar+"");
            }
            PP.close();

        }
}


