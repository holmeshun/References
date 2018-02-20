import java.util.Comparator;

public class TeruletComperator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        /*terulet szerint növekvő, kerület szerint csökkenő
        return (int)(((Triangle)o1).getTerulet() - ((Triangle)o2).getTerulet());
        ha pozitív akkor az o1 bekerül hátulra alulra alá, nevezd ahogy akarod
        növekvő sorrend lesz
                              5                               3*/
        if(((Triangle)o1).getTerulet() == ((Triangle)o2).getTerulet())
        {
            return (int) (((Triangle)o2).getKerulet() - ((Triangle)o1).getKerulet());
        }else
            return (int) (((Triangle)o1).getTerulet() - ((Triangle)o2).getTerulet());
    }
}
