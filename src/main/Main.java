package main;

public class Main {
    double a = -0.5;
    double b = 2;

    public static void main(String[] args) {

    }

    public double f(double x) {
        double y;
        if (x<=0.7) {
            y = 1;
        } else if (x>1.4) {
            y = Math.exp(a*x)*Math.cos(b*x);
        } else {   // (x>0.7 && x<=1.4)
            y = a*x*x*Math.log(x);
        }
        return y;
    }

    public int steps(double h, double start, double finish) {
        return (int) ((finish-start)/h + 1);
    }

    public double[] createX(double h, double start, double finish) {
        int n = steps(h,start,finish);
        double[] x = new double[n];
        for (int i = 0; i < x.length; i++) {
            x[i] = start + i * h;
        }
        return x;
    }
}
