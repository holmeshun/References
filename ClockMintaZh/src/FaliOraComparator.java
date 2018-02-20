import java.util.Comparator;

public class FaliOraComparator implements Comparator<FaliOra> {
    @Override
    public int compare(FaliOra o1, FaliOra o2) {
        return o1.gethanypercmulvaKakukkol() - o2.gethanypercmulvaKakukkol();
    }
}
