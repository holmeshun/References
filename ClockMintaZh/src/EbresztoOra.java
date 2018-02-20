import java.sql.Time;

public class EbresztoOra extends KozosOsOsztaly {
    private static Time maki = new Time(6, 30, 0);

    public EbresztoOra(int ora, int perc, int masodperc) {
        super(ora, perc, masodperc);
    }


    public int gethatravanInPerc() {
        /*int aktmasodperc = this.getOra()*60*60 + this.getPerc()*60 +getMasodperc();
        return (24*60*60 - aktmasodperc + 6*60*60+30*60)/60;*/
        int aktmasodperc = this.getOra() * 60 * 60 + this.getPerc() * 60 + getMasodperc();
        return (24 * 60 * 60 - aktmasodperc + maki.getHours() * 60 * 60 + maki.getMinutes() * 60 + maki.getSeconds()) / 60;
    }

    @Override
    public String toString() {
        return "EbresztoOra{" +
                "ora=" + getOra() +
                ", perc=" + getPerc() +
                ", masodperc=" + getMasodperc() +
                ", Hatravan: " + gethatravanInPerc() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false; //üres a referenciaváltozó vagy ugyanabban a classban vannak e

        EbresztoOra that = (EbresztoOra) o;

        if (getOra() != that.getOra()) return false;
        if (getPerc() != that.getPerc()) return false;
        return getMasodperc() == that.getMasodperc();

    }

    @Override
    public int hashCode() {
        return 1;
    }
}
