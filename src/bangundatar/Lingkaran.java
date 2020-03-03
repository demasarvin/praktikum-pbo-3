package bangundatar;

public class Lingkaran extends BangunDatar{
    
    double r;
   protected final double PI = (double) 3.14;

    public double getR(){
        return r;
    }
    public void setR(double r){
        this.r = r;
    }
    
    public double getPI(){
        return PI;
    }
    
    @Override
    public double luas(){
        double luas = (double) (PI * Math.pow(this.r, 2));
        System.out.println("Luas lingkaran: " + luas);
        return luas;
    }
    
    @Override
    public double keliling(){
        double keliling = (double) (PI*2*r);
        System.out.println("Keliling Lingkaran: " + keliling);
        return keliling;
    }
    
}
