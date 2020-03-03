package bangundatar;

public class PersegiPanjang extends BangunDatar {

    double panjang, lebar;
    
    public double getPanjang(){
        return panjang;
    }

    public double getLebar(){
        return lebar;
    }

    public void setPanjang(double panjang){
        this.panjang = panjang;
    }
    public void setLebar(double lebar){
        this.lebar = lebar;
    }

    @Override
    public double luas(){
        double luas = lebar * panjang;
        System.out.println("Luas Persegi Panjang : " + luas);
        return luas;
    }


    @Override
    public double keliling(){
        double keliling = panjang + panjang + lebar + lebar;
        System.out.println("Keliling Persegi Panjang: " + keliling);
        return keliling;
    }
}
