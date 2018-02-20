public class FaliOra extends KozosOsOsztaly {
    public FaliOra(int ora, int perc, int masodperc) {
        super(ora, perc, masodperc);
    }

    public int gethanypercmulvaKakukkol() {
        int aktmasodperc = getOra() * 60 * 60 + getPerc() * 60 + getMasodperc();
        return (24 * 60 * 60 - aktmasodperc + 6 * 60 * 60 + 30 * 60) / 60;
    }


    @Override
    public String toString() {
        return "FaliOra{" +
                "ora=" + getOra() +
                ", perc=" + getPerc() +
                ", masodperc=" + getMasodperc() +
                ", Kakukkol: " + gethanypercmulvaKakukkol() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false; //üres a referenciaváltozó vagy ugyanabban a classban vannak e

        FaliOra that = (FaliOra) o;
        //((FaliOra) o).getMasodperc();

        if (getOra() != that.getOra()) return false;
        if (getPerc() != that.getPerc()) return false;
        return getMasodperc() == that.getMasodperc();

    }

    @Override
    public int hashCode() {
        return 1;
    }
}
