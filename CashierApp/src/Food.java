/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Food extends Menu {
    public String levelPedas;

    public Food(String foodName, double price, String level){
        super(foodName, price);
        this.levelPedas = level;
    }
    
    public Food(String foodName){
        this(foodName, 0, null);
    }
    
    public String printInfo(){
    return ( "Nama makanan : " + this.getName() + "\nHarga makanan : " + String.format("Rp%.2f"+"0", this.getPrice()));
 }
    
}
