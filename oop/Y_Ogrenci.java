/*MİRAS */
package uygulama3;


public class Y_Ogrenci extends Ogrenci implements Egitim{

    
    public String tez_konusu;
    public String ana_bilim_dali;

    public Y_Ogrenci(String ad, String soyad, double gano) {
        super(ad, soyad, gano);
    }

    @Override
    public void Veri_yaz() {
        super.Veri_yaz(); 
        System.out.println("Tez Konusu     : "+tez_konusu);
        System.out.println("Ana bilim dalı : "+ana_bilim_dali);
        System.out.println("mezuniyet durumu:"+mezuniyet_durumu());
    }

    @Override
    public char harf_notu(int nt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double gano(int nt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean mezuniyet_durumu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
