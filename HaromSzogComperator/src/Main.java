import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int counter=0;
        Triangle s;
        ArrayList<Triangle> lista= new ArrayList();
        do {
            s =new Triangle(sc.nextInt(),sc.nextInt(),sc.nextInt());
            if(!s.isItProperTriangle())
            {
                    System.out.println("That is not a proper triangle.");
            }else {
                lista.add(s);
                System.out.println("Its in the list");
                if(lista.size()!=1)
                {
                    for(Iterator<Triangle> it = lista.iterator(); it.hasNext();)
                    {
                        Triangle tri = it.next();
                        //System.out.println("index of tri "+ lista.indexOf(tri) + " lista.size()-1: " + (lista.size()-1));
                        if(lista.get(lista.size()-1).equals(lista.get(lista.indexOf(tri))))
                            counter++;
                        //System.out.println("Counter  " +counter);
                        if(counter == 2)
                        {
                            System.out.println("It has been taken out");
                            it.remove();
                            counter=0;
                        }
                    }
                    counter = 0;
                }
            }
            System.out.println("Pls write 0 if you want to terminate the process or anything else if not (numberFormat)");

        }while(sc.nextInt()!=0);
        Collections.sort(lista,new TeruletComperator());
            for (Object makkancs: lista)
            {
                System.out.println(makkancs.toString()+"\n");
            }

    }
}

