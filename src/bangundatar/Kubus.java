package bangundatar;

public class Kubus extends Persegi {
    
    @Override
    public double getSisi(){
        return sisi;
    }
    @Override
    public void setSisi(double sisi){
        this.sisi = sisi;
    }
    
    public double volume(){
        double volume = (Math.pow(this.sisi, 3));
        System.out.println("Volume kubus :" + volume);
        return volume;
    }
}
