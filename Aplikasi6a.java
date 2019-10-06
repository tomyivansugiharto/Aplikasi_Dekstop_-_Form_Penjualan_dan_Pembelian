import java.util.Scanner;
public class Aplikasi6a {
    public static void main(String args []) {
        int qty, harga, total;
        harga = 660000;
                
        System.out.println("Daftar Printer");
        System.out.println("Printer Epson T20 Rp 660.000");
        
        Scanner inputQty = new Scanner(System.in);
        System.out.print("Berapa banyak printer yang di beli : ");
        qty = inputQty.nextInt();
        
        total = qty * harga;
        
        System.out.println("---------------------------------------------");
        System.out.println("Printer yang di beli sejumlah : " + qty);
        System.out.println("Total jumlah pembelian adalah : Rp. " + total);
        System.out.println("---------------------------------------------");
    }
}
