import java.util.Comparator;

public class EbresztoOraComperator implements Comparator<EbresztoOra> {
    @Override
    public int compare(EbresztoOra o1, EbresztoOra o2) {
        //((EbresztoOra)o1).gethatravanInPerc() castolás
        return o1.gethatravanInPerc() - o2.gethatravanInPerc();
    } //Comparator így írd le maki
}
