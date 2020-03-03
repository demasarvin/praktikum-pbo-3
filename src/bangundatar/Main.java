package bangundatar;

public class Main {
    public static void main(String[] args){
       
       Persegi persegi = new Persegi();
       persegi.setSisi(4);
       persegi.luas();
       persegi.keliling();
       System.out.println("");
       
       Lingkaran lingkaran = new Lingkaran();
       lingkaran.setR(7);
       lingkaran.luas();
       lingkaran.keliling();
       System.out.println("");
       
       PersegiPanjang pp = new PersegiPanjang();
       pp.setPanjang(10);
       pp.setLebar(4);
       pp.luas();
       pp.keliling();
       System.out.println("");
       
       Segitiga segitiga = new Segitiga();
       segitiga.alas = 10;
       segitiga.tinggi = 10;
       segitiga.luas();
       segitiga.keliling();
       System.out.println("");
       
       Kubus kubus = new Kubus();
       kubus.setSisi(10);
       kubus.volume();
       System.out.println("");
       
       Silinder silinder = new Silinder();
       silinder.setR((float)0.5);
       silinder.tinggi = 10;
       silinder.volume();
       System.out.println("");
       
       Balok balok = new Balok();
       balok.setPanjang(20);
       balok.setLebar(5);
       balok.tinggi = 10;
       balok.volume();
    }
}
