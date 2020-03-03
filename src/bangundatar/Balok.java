package bangundatar;

public class Balok extends PersegiPanjang{
    double tinggi;
    
    @Override
    public double getPanjang(){
        return panjang;
    }

    @Override
    public double getLebar(){
        return lebar;
    }

    @Override
    public void setPanjang(double panjang){
        this.panjang = panjang;
    }
    
    @Override
    public void setLebar(double lebar){
        this.lebar = lebar;
    }
    
    public double volume(){
        double volume = panjang*lebar*tinggi;
        System.out.println("Volume balok : " + volume);
        return volume;
    }
}
