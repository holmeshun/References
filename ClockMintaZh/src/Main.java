import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EbresztoOra o1 = new EbresztoOra(8, 30, 0);
        FaliOra o2 = new FaliOra(8, 30, 0);
        System.out.println("6.30 ig percben megadva: " + o1.toString());
        //System.out.println(o2.equals(o1));
        ArrayList<EbresztoOra> ebreszto = new ArrayList<>();
        ArrayList<FaliOra> falicucc = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String beolvas;
        while (true) {
            beolvas = sc.next();
            if (beolvas.compareTo("E") != 0 && beolvas.compareTo("F") != 0) {
                break;
            }
            if (beolvas.compareTo("E") == 0) {
                ebreszto.add(o1 = new EbresztoOra(sc.nextInt(), sc.nextInt(), sc.nextInt()));
            } else {
                falicucc.add(o2 = new FaliOra(sc.nextInt(), sc.nextInt(), sc.nextInt()));
            }
        }
        Collections.sort(ebreszto, new EbresztoOraComperator());
        for (Object maki : ebreszto) {
            System.out.println(maki);
        }
        Collections.sort(falicucc, new FaliOraComparator());
        for (Object maki : falicucc) {
            System.out.println(maki);
        }
    }
}
