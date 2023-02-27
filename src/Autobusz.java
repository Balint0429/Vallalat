public class Autobusz {
    private int ferohely;
    private int hatotav;
    private int ar;

    private final int max_ferohely;
}
public Autobusz(int ferohely, int hatotav, int ar, int max_ferohely) {
    this.ferohely = ferohely;
    this.hatotav = hatotav;
    this.ar = ar;
    this.max_ferohely = max_ferohely;
}
public Autobusz() {
    this.hatotav
    = this.ar
    = this.ferohely
    = this.max_ferohely
    = -1;
}

public boolean utasHozzaad (int utasokszama){
    if(utasokszama<=this.ferohely)
    {
        this.ferohely=utasokszama;
    }
    return true;
}

public int getFerohely() {
    return ferohely;}

public int getHatotav() {
    return hatotav;}

public int getAr() {
    return ar;}

public int getMax_ferohely() {
    return max_ferohely;}
//set
public void setFerohely(int ferohely) {
    this.ferohely = ferohely;
}
public void setHatotav(int hatotav) {
    this.hatotav = hatotav;
}
public void setAr(int ar) {
    this.ar = ar;
}
@Override
public String toString() {
    return "Busz" +this.ferohely+"és"+this.hatotav+"km hat"+this.ar+"ár" ;
}
