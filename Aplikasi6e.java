import java.util.Scanner;
public class Aplikasi6e {
    public static void main(String args[]) {
        String kota = "";
        double jarak, ongkos;
        
        Scanner inputKota =  new Scanner(System.in);
        System.out.print("Dikirim ke Kota mana : ");
        kota = inputKota.next();
        
        Scanner inputJarak = new Scanner(System.in);
        System.out.print("Berapa jarak pengiriman : ");
        jarak =  inputJarak.nextInt();
        System.out.println("---------------------------------------------");
        
        switch (kota) {
            case "Surabaya":
                ongkos = jarak * 2500;
                System.out.println("Pengiriman ke Surabaya dengan jarak " + jarak + "m, sebesar Rp." + ongkos);
                break;
                
            case "Bandung":
                ongkos = jarak * 4000;
                System.out.println("Pengiriman ke Surabaya dengan jarak " + jarak + "m, sebesar Rp." + ongkos);
                break;
                
            default:
                System.out.println("Kota tidak dikenal");
                System.out.println("---------------------------------------------");
        }
                
    }
}
