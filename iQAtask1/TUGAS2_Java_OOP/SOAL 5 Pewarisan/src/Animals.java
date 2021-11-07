public class Animals {
    private String namaanimal;
    private String jenismakanan;
    private String gigibinatang;

    public String getNamaanimal() {
        return namaanimal;
    }
    public void setNamaanimal(String namaanimal) {
        this.namaanimal = namaanimal;
    }
    public String getJenismakanan() {
        return jenismakanan;
    }
    public void setJenismakanan(String jenismakanan) {
        this.jenismakanan = jenismakanan;
    }
    public String getGigibinatang() {
        return gigibinatang;
    }
    public void setGigibinatang(String gigibinatang) {
        this.gigibinatang = gigibinatang;
    }
    public void tampilkandata() {
        System.out.println("Nama Animal :" +getNamaanimal());
        System.out.println("Jenis Makanan :" +getJenismakanan());
        System.out.println("Gigi Binatang :" +getGigibinatang());
   }
   public void inputData(String n, String j, String g) {
       setNamaanimal(n);
       setJenismakanan(j);
       setGigibinatang(g);
   }
}
