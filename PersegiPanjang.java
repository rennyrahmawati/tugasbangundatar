package bangundatarabstract;

public class PersegiPanjang extends BangunDatar {
    int luas, panjang = 8, lebar = 2, keliling;
    
    @Override
    void hitungLuas() {
        luas = panjang * lebar;
        System.out.println(luas);
    }
    
    @Override
    void hitungKeliling() {
        keliling = 2 * (panjang + lebar);
        
    }
}