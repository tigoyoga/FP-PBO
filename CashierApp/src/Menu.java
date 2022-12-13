/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public abstract class Menu {
    private String foodName;
    private double price;
    public double jumlah;
    
    public Menu(String foodName, double price){
     this.foodName = foodName;
     this.price = price;
    }
    
    public Menu(String foodName){
     this(foodName, 0);
    }

     public void setName( String foodName )
    {
      this.foodName = foodName;
    }

    public void setPrice( double price )
    {
      this.price = price;
    }
 
    public String getName(){
        return this.foodName;
    }
 
    public double getPrice(){
        return this.price;
    }
    
    public String printInfo(){
    return ( "Nama menu : " + this.foodName + "\nHarga menu : " + String.format("Rp%.2f"+"0", this.getPrice()) );
 }
 
}
