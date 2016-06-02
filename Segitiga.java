package bangundatarabstract;

public class Segitiga extends BangunDatar {
    int luas, alas = 2, ab= 4, ac = 8, bc = 6, keliling, tinggi = 10;
    @Override
    void hitungLuas() {
        luas = 1/2 * bc * tinggi;
    }
    
    @Override
    void hitungKeliling() {
        keliling = ab + ac + bc;
        
    }
}