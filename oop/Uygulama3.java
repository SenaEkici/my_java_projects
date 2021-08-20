
package uygulama3;


public class Uygulama3 {

    
    public static void main(String[] args) {
        System.out.println("lisans\n");
        Ogrenci o1=new Ogrenci("sena ", "ekici", 90);
        o1.Veri_yaz();
        System.out.println("\nyuksek lisans");
        Y_Ogrenci y1=new Y_Ogrenci("gizem", "demir", 96);
        y1.ana_bilim_dali="elektrik";
        y1.tez_konusu="JAVA";
        y1.mezuniyet_durumu();
        y1.Veri_yaz();
    }
    
}
