public class Hewan {
    protected String nama1;
    protected String nama2;
    public Hewan (String hewan1, String hewan2)
    {
        super();
        nama1=hewan1;
        nama2=hewan2;
    }
    protected void hello()
    {
        System.out.println("Saya suka hewan");
    }
}
class mamalia extends Hewan{
    private String kodeMamalia;
    public mamalia (String hewan1, String hewan2)
    {
        super(hewan1,hewan2);
    }
    void setKodeMamalia(String kode1)
    {
        kodeMamalia=kode1;
    }
    void dataMamalia()
    {
        System.out.println("nama hewan 1 : "+nama1);
        System.out.println("nama hewan 2 : "+nama2);
        System.out.println("nama hewan : "+kodeMamalia);
    }
    class reptil extends Hewan{
         private String kodeReptil;
         public reptil(String hewan1, String hewan2)
    }
         super(hewan1, hewan2);
    }
    void setKodeReptil(String kode1)
    {
         kodeReptil=kode2;
    }
    void dataReptil()
   {
        System.out.println("nama hewan 1 : "+nama1);
        System.out.println("nama hewan 2 : "+nama2);
        System.out.println("nama hewan : "+kodeReptil);
   }
}


