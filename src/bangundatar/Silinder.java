package bangundatar;

public class Silinder extends Lingkaran{
    double tinggi;
    
    @Override
    public double getR(){
        return r;
    }
    
    @Override
     public double getPI(){
        return PI;
    }

    public double volume(){
        double volume = (double) (PI * Math.pow(this.r, 2)*tinggi);
        System.out.println("Volume silinder : " + volume);
        return volume;
    }
}
