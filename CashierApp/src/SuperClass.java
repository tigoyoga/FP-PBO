
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class SuperClass {
    
    public double AyamGoreng;
    public double SotoAyam;
    public double NasiGoreng;
    
    public double EsTeh;
    public double EsJeruk;
    public double EsSirup;
    
    public double Makanan;
    public double Minuman;
    public double TotalM;
    
    public double AllTotal;
    
    public double GetAmount(){
        Makanan = AyamGoreng + SotoAyam + NasiGoreng;
        Minuman = EsTeh + EsJeruk + EsSirup;
        TotalM = Makanan + Minuman;
        AllTotal = TotalM;
        
        return AllTotal;
    }
    
    private JFrame frame;
    
    public void iExitSystem(){
        frame = new JFrame("Exit");
        
        if(JOptionPane.showConfirmDialog(frame, "Konfirmasi jika anda ingin keluar", "Aplikasi Kasir Warung Sederhana", 
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
                System.exit(0);
        }
    }
    
// ========= HARGA ============
    public double hAyamGoreng = 17.000;
    public double hSotoAyam = 20.000;
    public double hNasiGoreng = 15.000 ;
    
    public double hEsTeh = 5.000;
    public double hEsJeruk = 8.000;
    public double hEsSirup = 10.000;
    
// ========== PAJAK ===============
    public double Pajak = 0.1;
    
    public double totalPajak(double hPajak){
        double hargaPajak = Pajak * hPajak;
        return hargaPajak;
    }
}
