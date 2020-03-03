package bangundatar;

public class Segitiga extends BangunDatar{
    double alas;
    double tinggi;
    
    @Override
    public double luas(){
        double luas = ((alas * tinggi)/2);
        System.out.println("Luas Segtiga: " + luas);
        return luas;
    }
    @Override
    public double keliling(){
        double keliling = alas + alas + alas;
        System.out.println("Keliling Segtiga: " + keliling);
        return keliling;
    }
}
