package etf.unsa.ba;
import java.util.Scanner;
public class Predmet {

    public String naziv;
    public int sifra;
    public int kapacitet=1000;
    public int velicina;
    private etf.unsa.ba.Student[] niz=new etf.unsa.ba.Student[kapacitet];
    public String getNaziv() {
        return naziv;
    }
    public int getSifra() {
        return sifra;
    }
    public int getKapacitet() {
        return kapacitet;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public Predmet(int kapacitet, String naziv, int sifra) {
        this.kapacitet=kapacitet;
        this.sifra=sifra;
        this.naziv=naziv;
        this.velicina=0;
        this.niz=new etf.unsa.ba.Student[kapacitet];
    }

    public void ispisi(etf.unsa.ba.Student s){
        for(int i=0;i<velicina;i++)
            if(niz[i]==s)
                niz[i]=null;
        velicina--;
    }
    public void upisi(etf.unsa.ba.Student s)throws ArithmeticException{
        if(velicina>=kapacitet)throw new ArithmeticException("nema prostora");
        niz[velicina++]=s;
    }
    public void ispisNiza(){
        for(int i=0;i<velicina;i++){
            System.out.println(i+1+". "+ niz[i].prezime+" " +niz[i].ime+" " +niz[i].indeks);
        }
    }


}
