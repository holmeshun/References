import java.util.Scanner;

public class NyersAnyagCsere {
    private double fa;
    private double agyag;
    private double vasérc;
    private double búza;

    @Override
    public String toString() {
        return "NyersAnyagCsere{" +
                "fa=" + fa +
                ", agyag=" + agyag +
                ", vasérc=" + vasérc +
                ", búza=" + búza +
                '}';
    }

    public double getFa() {
        return fa;
    }

    public void setFa(double fa) {
        this.fa = fa;
    }

    public double getAgyag() {
        return agyag;
    }

    public void setAgyag(double agyag) {
        this.agyag = agyag;
    }

    public double getVasérc() {
        return vasérc;
    }

    public void setVasérc(double vasérc) {
        this.vasérc = vasérc;
    }

    public double getBúza() {
        return búza;
    }

    public void setBúza(double búza) {
        this.búza = búza;
    }

    public NyersAnyagCsere(double fa, double agyag, double vasérc, double búza) {

        this.fa = fa;
        this.agyag = agyag;
        this.vasérc = vasérc;
        this.búza = búza;
    }

    public void nyersanyagCsere2targyEseten()
    {
        NyersAnyagCsere temp = new NyersAnyagCsere(0,0,0,0);
        Scanner sc = new Scanner(System.in);
        System.out.println("Mennyi nyersanyag kell az elso epulethez? ");
        NyersAnyagCsere elsoepulet = new NyersAnyagCsere(sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        System.out.println("Mennyi nyersanyag kell az masodik epulethez? ");
        NyersAnyagCsere masodikepulet = new NyersAnyagCsere(sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        System.out.println("Mennyi nyersanyagod van? ");
        NyersAnyagCsere mennyinyersanyagVan = new NyersAnyagCsere(sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());

        int counter= 0;
        double osszesFelhasznalando=elsoepulet.fa+elsoepulet.agyag+elsoepulet.vasérc+elsoepulet.búza;
        double osszesNyersanyag =mennyinyersanyagVan.fa+mennyinyersanyagVan.agyag+mennyinyersanyagVan.vasérc+mennyinyersanyagVan.búza;
        double maradek = osszesNyersanyag-osszesFelhasznalando;

        System.out.println("Ennyi a maradék nyersanyag: "+ maradek+" Ennyi fába kerül az 1 épület: " + elsoepulet.fa +" Ennyi agyagba kerül: " + elsoepulet.agyag +" Ennyi vasércba kerül: " +elsoepulet.vasérc
                +" Ennyi búzaba kerül: " + elsoepulet.búza);

        while(maradek >= 0)
        {
            temp.fa += masodikepulet.fa;
            temp.agyag += masodikepulet.agyag;
            temp.vasérc += masodikepulet.vasérc;
            temp.búza += masodikepulet.búza;
            maradek -= (masodikepulet.fa + masodikepulet.agyag + masodikepulet.vasérc + masodikepulet.búza);
            counter++;
        }

        this.fa = elsoepulet.fa+temp.fa;
        this.agyag = elsoepulet.agyag+temp.agyag;
        this.vasérc = elsoepulet.vasérc+temp.vasérc;
        this.búza = elsoepulet.búza+temp.búza;

        System.out.println("Ennyi épület / egység jön ki: " + counter +" Ennyi fába kerül: " + this.fa +" Ennyi agyagba kerül: " + this.agyag +" Ennyi vasércba kerül: " + this.vasérc
                +" Ennyi búzaba kerül: " + this.búza);
    }

}
