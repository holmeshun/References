public class KozosOsOsztaly implements Comparable<KozosOsOsztaly> {
    private int ora;
    private int perc;
    private int masodperc;

    public KozosOsOsztaly(int ora, int perc, int masodperc) {
        this.ora = ora;
        this.perc = perc;
        this.masodperc = masodperc;
    }

    public int getOra() {
        return ora;
    }

    public void setOra(int ora) {
        this.ora = ora;
    }

    public int getPerc() {
        return perc;
    }

    public void setPerc(int perc) {
        this.perc = perc;
    }

    public int getMasodperc() {
        return masodperc;
    }

    public void setMasodperc(int masodperc) {
        this.masodperc = masodperc;
    }

    @Override
    public int compareTo(KozosOsOsztaly o) {
        return this.ora * 60 * 60 + this.perc * 60 + this.masodperc - o.getOra() * 60 * 60 + o.getPerc() * 60 + o.getMasodperc();
    }
}
