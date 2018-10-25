package etf.unsa.ba;
import java.util.Scanner;


public class Program {

    public static void main(String[] args) {
        // write your code here
        etf.unsa.ba.Predmet p=new etf.unsa.ba.Predmet(20, "lag", 1);
        etf.unsa.ba.Student s=new etf.unsa.ba.Student("mujo", "mujic", 2000);
        p.upisi(s);
        etf.unsa.ba.Student s1=new etf.unsa.ba.Student("suljo", "suljic", 2001);
        etf.unsa.ba.Student s2=new etf.unsa.ba.Student("haso", "hasic", 2002);
        p.upisi(s1);
        p.upisi(s2);
        p.ispisNiza();
        p.ispisi(s2);
        p.ispisNiza();
    }
}