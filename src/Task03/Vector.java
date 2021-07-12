package Task03;

class geomVector
{
    public double x1,x2,y1,y2,xV,yV,xM,yM,vL;
    public void setVector(double a1,double b1, double a2, double b2)
    {
        x1 = a1;
        x2 = a2;
        y1 = b1;
        y2 = b2;
    }
    public void getVectorCoords()
    {
        xV = x2 - x1;
        yV = y2 - y1;
    }

    public double getLength()
    {
        return vL = Math.sqrt(xV*xV+yV*yV);
    } //Длинна вектора

    public double scalMult(geomVector a,geomVector b)
    {
        return (a.xV*b.xV+a.yV*b.yV);
    } //Произведения вектора

}

public class Vector {
    public static void main(String[] args)
    {
        double x1,x2,x3,x4,y1,y2,y3,y4;
        x1 = 12;
        x2 = 1;
        x3 = 7;
        x4 = 42;
        y1 = 57;
        y2 = 11;
        y3 = 13;
        y4 = 4;

        geomVector a = new geomVector();
        geomVector b = new geomVector();
        a.setVector(x1,y1,x2,y2);
        b.setVector(x3,y3,x4,y4);
        a.getVectorCoords();
        b.getVectorCoords();

        System.out.println(a.getLength());
        System.out.println(b.getLength());
        System.out.println(a.scalMult(a,b));
        System.out.println(a.scalMult(b,a));
    }
}
