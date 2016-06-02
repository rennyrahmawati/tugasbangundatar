package bangundatarabstract;

public class Persegi extends BangunDatar {
    int luas, sisi = 6, keliling;
    
    @Override
    void hitungLuas() {
        luas = sisi * sisi;
        System.out.println(luas);
    }
    
    @Override
    void hitungKeliling() {
        keliling = 8 * sisi;
        System.out.println(keliling);
        
    }
}
