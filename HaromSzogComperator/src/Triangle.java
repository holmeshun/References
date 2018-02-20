public class Triangle implements Comparable{
    private int a;
    private int b;
    private int c;
    private double terulet;
    private double kerulet;
    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.terulet = countTerulet();
        this.kerulet = countKerulet();
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double getTerulet() {
        return terulet;
    }

    public void setTerulet(double terulet) {
        this.terulet = terulet;
    }

    public double getKerulet() {
        return kerulet;
    }

    public double countKerulet() {
        this.kerulet=this.a+this.b+this.c;
        return this.kerulet;
    }
    public boolean isItProperTriangle(){
       return getA()!=0 && getB() != 0 && getC() != 0 && ((getA()+getB()) > getC()) && ((getA()+getC()) > getB()) && ((getB()+getC()) > getA());
    }

    public double countTerulet()
    {
        double s;
        s=countKerulet()/2;
        this.terulet=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return this.terulet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (a != triangle.a) return false;
        if (b != triangle.b) return false;
        if (c != triangle.c) return false;
        if (Double.compare(triangle.terulet, terulet) != 0) return false;
        return Double.compare(triangle.kerulet, kerulet) == 0;
    }

    @Override
    public int hashCode() {
        return (a*101+b*73+c*7);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", terulet=" + terulet +
                ", kerulet=" + kerulet +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return this.getA() - ((Triangle)o).a;
    }
}
