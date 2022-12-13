
import java.util.ArrayList;
import java.util.List;
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
public class SuperClass{

    public double Makanan;
    public double Minuman;
    public double TotalM;
    
    double Pajak = 0.1;
    
    Food AyamGoreng = new Food("Ayam Goreng", 17.000, null);
    Food SotoAyam = new Food("Soto Ayam", 20.000, null);
    Food NasiGoreng = new Food("Nasi Goreng", 15.000, null);
    
    Drink EsTeh = new Drink("Es Teh", 3.000, null);
    Drink EsJeruk = new Drink("Es Jeruk", 5.000, null);
    Drink EsSirup = new Drink("Es Sirup", 10.000, null);
    
    public double GetAmount(){
        Makanan = AyamGoreng.jumlah + SotoAyam.jumlah + NasiGoreng.jumlah;
        Minuman = EsTeh.jumlah + EsJeruk.jumlah + EsSirup.jumlah;
        TotalM = Makanan + Minuman;
        
        return TotalM;
    }
    
    private JFrame frame;
    
    public void iExitSystem(){
        frame = new JFrame("Exit");
        
        if(JOptionPane.showConfirmDialog(frame, "Konfirmasi jika anda ingin keluar", "Aplikasi Kasir Warung Sederhana", 
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
                System.exit(0);
        }
    }

    public double totalPajak(double hPajak){
        double hargaPajak = Pajak * hPajak;
        return hargaPajak;
    }
}
