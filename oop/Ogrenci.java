
package uygulama3;


public class Ogrenci implements Egitim{
    /*veria alanları*/
    private String ad;
    private String soyad;
    private double gano;
    
    /*get set constructer method*/
    //getter setter methodları
    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public double getGano() {
        return gano;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setGano(double gano) {
        this.gano = gano;
    }
      public void Veri_yaz()
    {
        System.out.println("AD    :"+ad);
        System.out.println("SOYAD :"+soyad);
        
        
    }
      //yapıcı method ismi ve class ismi aynı.

    public Ogrenci(String ad, String soyad, double gano) {
        this.ad = ad;
        this.soyad = soyad;
        this.gano = gano;
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
