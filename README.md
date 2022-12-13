# Final Project PBO B

Nama  : Tigo S Yoga

NRP   : 5025211125

Kelas : PBO B

[Link Sumber](https://youtu.be/A_BJsa8of14)

[Link Demo](https://youtu.be/U9vuMshweDM)


Deskripsi
-----
Aplikasi Kasir Sederhana menggunakan Java. Aplikasi ini berfungsi menghitung total pembayaran berdasarkan menu makanan dan minuman yang dipilih. Aplikasi ini juga dapat menampilkan struk transaksi dan riwayat transaksi.

Implementasi
-----

### 1. Casting/Conversion
> MainFrame.java
```java
ListMenu.AyamGoreng.jumlah = ListMenu.AyamGoreng.getPrice() * Double.parseDouble(jTextAyam.getText());
ListMenu.NasiGoreng.jumlah = ListMenu.NasiGoreng.getPrice() * Double.parseDouble(jTextNasgor.getText());
ListMenu.SotoAyam.jumlah = ListMenu.SotoAyam.getPrice() * Double.parseDouble(jTextSoto.getText());
```

### 2. Constructor
> Menu.java
```java
public abstract class Menu {

    private String foodName;
    private double price;
    public double jumlah;

    public Menu(String foodName, double price) {
        this.foodName = foodName;
        this.price = price;
    }
    ...
}
```

### 3. Overloading
> Menu.java
```java
public abstract class Menu {

    private String foodName;
    private double price;
    public double jumlah;

    public Menu(String foodName, double price) {
        this.foodName = foodName;
        this.price = price;
    }
    ...
}
```

### 4. Overriding
> Menu.java
```java
public abstract class Menu {

    private String foodName;
    private double price;
    public double jumlah;
    
    ...
    
    public String printInfo() {
        return ("Nama menu : " + this.foodName + "\nHarga menu : " + String.format("Rp%.2f" + "0", this.getPrice()));
    }
}
```

> Food.java
```java
public class Food extends Menu {

    ...
      
    public String printInfo() {
        return ("Nama makanan : " + this.getName() + "\nHarga makanan : " + String.format("Rp%.2f" + "0", this.getPrice()));
    }
}
```

### 5. Encapsulation
> Menu.java
```java
public abstract class Menu {

    private String foodName;
    private double price;
    public double jumlah;
    
    ...

    public void setName(String foodName) {
        this.foodName = foodName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return this.foodName;
    }

    public double getPrice() {
        return this.price;
    }
}
```

### 6. Inheritance
> Food.java
```java
public class Food extends Menu {

    public String levelPedas;

    public Food(String foodName, double price, String level) {
        super(foodName, price);
        this.levelPedas = level;
    }
    
    ...
}
```

### 7. Polymorphism
> MenuApp.java
```java
public class MenuApp implements MenuInterface {

    ...

    Menu AyamGoreng = new Food("Ayam Goreng", 17.000, null); 
    Food SotoAyam = new Food("Soto Ayam", 20.000, null);
    Food NasiGoreng = new Food("Nasi Goreng", 15.000, null);

    ...
}
```

### 8. ArrayList
> ReadFilePath.java
```java
public class ReadFilePath {

    ...

    public List<String> getFile() throws IOException {

        List<String> Arr = new ArrayList<>();

        File filesList[] = directoryPath.listFiles();
        for (File file : filesList) {

            if (file.getName().contains(".txt")) {
                Arr.add(file.getName().substring(0, 12));
            }
        }

        return Arr;
    }

    ...
    
}
```

### 9. Exception Handling
> MainFrame.java
```java
private void jBtnStrukActionPerformed(java.awt.event.ActionEvent evt) {                                          
       
       ...

        try {

            File file = new File("receipt-" + nomorOrder + ".txt");

            file.createNewFile();

            PrintWriter pw = new PrintWriter(file);
            
            ...
            
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
       
       ...
       
    }   
```

### 10. GUI
> ![image](https://user-images.githubusercontent.com/88433109/207280689-ce3445f4-8cf7-4826-ada4-c343b219e900.png)

### 11. Interface
> MenuInterface.java
```java
public interface MenuInterface {

    public double GetAmount();

    public void iExitSystem();

    public double totalPajak(double hPajak);
}
```

### 12. Abstract Class
> Menu.java
```java
public abstract class Menu {

    private String foodName;
    private double price;
    public double jumlah;
 
   ...

}
```

### 13. Generics
> ReadFilePath.java
```java
public class ReadFilePath {
   
    ...
    
   public List<String> getFile() throws IOException { //List<String> as a Generics
       
       List<String> Arr = new ArrayList<>();

      File filesList[] = directoryPath.listFiles();
      
      ...
      
   }
```

### 14. Collection
> ReadFilePath.java
```java
public class ReadFilePath {
   
   ...
   
   public List<String> getFile() throws IOException {
       
       List<String> Arr = new ArrayList<>();          //List as a Collection

      File filesList[] = directoryPath.listFiles();
      for(File file : filesList) {                  //Iterable Object
          
          if(file.getName().contains(".txt")){
              Arr.add(file.getName().substring(0, 12));
          }
      }
      
       return Arr;
   }
}
```

### 15. Input Output
- Write File
> MainFrame.java
```java
private void jBtnStrukActionPerformed(java.awt.event.ActionEvent evt) {                                          
        
        int nomorOrder = 1325 + (int) (Math.random() * 4238);

        ...

        try {

            File file = new File("receipt-" + nomorOrder + ".txt");

            file.createNewFile();

            PrintWriter pw = new PrintWriter(file);
            pw.println("                    WARUNG SEDERHANA\n\n"
                    + "No Order : " + nomorOrder
                    + "\n==================================\n"
                    + " Makanan : \t\t" + jTextMakan.getText() + "\n\n"
                    + " Minuman : \t\t" + jTextMinum.getText() + "\n\n"
                    + "\n==================================\n"
                    + " Subtotal : \t\t" + jTextTotal2.getText() + "\n\n"
                    + " PPN : \t\t" + jTextTotal3.getText() + "\n\n"
                    + " Total Bayar : \t\t" + jTextTotal3.getText() + "\n"
                    + "\n==================================\n"
                    + "\n Tanggal : \t" + tDate.format(timer.getTime())
                    + "\n Waktu : \t" + tTime.format(timer.getTime())
                    + "\n\n\n Terimakasih");

            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
}
```

- Read File
> readFilePath.java
```java
public class ReadFilePath {

    File directoryPath = new File("C:\\Users\\LENOVO\\OneDrive\\Documents\\NetBeansProjects\\FP-PBO\\CashierApp");

    public List<String> getFile() throws IOException {

        List<String> Arr = new ArrayList<>();

        File filesList[] = directoryPath.listFiles();
        for (File file : filesList) {

            if (file.getName().contains(".txt")) {
                Arr.add(file.getName().substring(0, 12));
            }
        }

        return Arr;
    }

    public String readContent(String name) throws FileNotFoundException {
        File filesList[] = directoryPath.listFiles();

        StringBuilder sb = new StringBuilder();
        for (File file : filesList) {
            
            
            if (file.getName().equals(name)) {
                Scanner sc = new Scanner(file);
                String input;

                while (sc.hasNextLine()) {
                    input = sc.nextLine();
                    sb.append(input).append("\n");
                }
            }
            
            
        }

        return sb.toString();
    }

}
```
