import java.util.Scanner;
public class Aplikasi6b {
    
    public static void main(String args[]) {
        int qty; 
        double beli,harga, total;
        harga = 660000;
        double diskon,totdiskon;
                
        System.out.println("Daftar Printer");
        System.out.println("Printer Epson T20 Rp 660.000");
        System.out.println("---------------------------------------------");
        
        Scanner inputQty = new Scanner(System.in);
        System.out.print("Berapa banyak printer yang di beli : ");
        qty = inputQty.nextInt();
       
        beli =  harga * qty;
        diskon = 0.15;
        if (beli >= 1500000) {
            totdiskon = beli * diskon;
            total = beli - totdiskon  ;
            System.out.println("Diskon: Rp." + totdiskon );
        } else {
            total = qty * harga;
        }
        
        System.out.println("---------------------------------------------");
        System.out.println("Printer yang di beli sejumlah : " + qty);
        System.out.println("Pembelian : Rp." + beli);
        System.out.println("Total jumlah pembelian adalah : Rp. " + total);
        System.out.println("---------------------------------------------");
        
    }
}
