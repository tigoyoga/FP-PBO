
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Tigo S Yoga
 */
public class Drink extends Menu {

    public String ice;

    public Drink(String drinkName, double price, String ice) {
        super(drinkName, price);
        this.ice = ice;
    }

    public Drink(String drinkName) {
        this(drinkName, 0, null);
    }

    public String printInfo() {
        return ("Nama minuman : " + this.getName() + "\nHarga minuman : " + String.format("Rp%.2f" + "0", this.getPrice()));
    }

}
