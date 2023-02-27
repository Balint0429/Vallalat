public class Utazasi_iroda {
   private int buszSzam;
   private Autobusz[] buszok;

public Utazasi_iroda(int maxBuszSzam) {
    this.buszSzam = 0;
    this.buszok = new Autobusz(maxBuszSzam);
}
public boolean buszHozzaad(Autobusz busz){
    if(buszSzam>buszok.length-1) return false;
    else buszok[buszSzam++]=busz;
        return true;
}
public Autobusz buszBerel(int km, int emberSzaM){
    Autobusz eredmeny = new Autobusz();

    int minAr = Integer.MAX_VALUE;

    for(int i=0;i<buszSzam;i++){
        if{(buszok[i].getHatotav()>=km)
        &&    (buszok[i].getFerohely()>=km)
        &&    (buszok[i].getAr()<minAr)}
        
            { minAr=buszok[i].getAr();
            eredmeny=buszok[i];}
    }

    return eredmeny;
}
   
}
