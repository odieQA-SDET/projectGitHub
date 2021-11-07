import java.util.Scanner;
    public class JakSel extends Ongkir
    {
        public void jakSel() {
            double Volume,Panjang,Lebar,Tinggi,Biayakg,beratPerkg,Bayar;

            Scanner JJ = new Scanner(System.in);
            System.out.println("TUJUAN KOTA BEKASI");
            System.out.println("===============================================");
            System.out.println("Silahkan Masukan Volume Barang dan Harga Per Kg");
            System.out.println("Input Panjang: ");
            Panjang = JJ.nextDouble();
            System.out.println("Input Lebar:   ");
            Lebar = JJ.nextDouble();
            System.out.println("Input Tinggi: ");
            Tinggi = JJ.nextDouble();
            System.out.println("Input Berat Barang: ");
            beratPerkg = JJ.nextDouble();

            Volume = Panjang*Lebar*Tinggi;
            System.out.println("Volumetrik Barang adalah : "+Volume+" m3");

            if (Volume <= 50) {
                Volume =1;
                Biayakg=7500;
                Bayar = Volume*beratPerkg*Biayakg;
                System.out.println("Ongkir adalah Rp: "+Bayar+"");
            }
            JJ.close();

        }
          }

