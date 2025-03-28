package exercise3;
import exercise2.MyPoint;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(MyPoint v1,MyPoint v2,MyPoint v3){
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public MyTriangle(int x1,int y1,int x2,int y2,int x3,int y3){
        this.v1 = new MyPoint(x1,y1);
        this.v2 = new MyPoint(x2,y2);
        this.v3 = new MyPoint(x3,y3);
    }

    public String toString(){
        return ("v1=" + v1 + "v2=" + v2 + "v3=" + v3);
    }

    public double getPerimeter(){
        double L1 = v1.distance(this.v2);
        double L2 = v2.distance(this.v3);
        double L3 = v3.distance(this.v1);

        return (L1 + L2 + L3);
    }

    public String printType(){
        double L1 = v1.distance(this.v2);
        double L2 = v2.distance(this.v3);
        double L3 = v3.distance(this.v1);

        if(L1 == L2 && L2 == L3){
            return "equilateral";
        }

        if(L1 != L2 && L1 != L3 && L2 != L3){
            return "scalene";
        }

        return "isosceles";
    }
}
