import java.util.Scanner;
public class Tester {
    public static void main(String args[]) {
        
        
        Scanner bBarang = new Scanner(System.in);
        Scanner nPembeli = new Scanner(System.in);
        Scanner mPenjual = new Scanner(System.in);
        Scanner tBeli = new Scanner(System.in);
        Scanner uUpah = new Scanner(System.in);
        Scanner kKota = new Scanner(System.in);
        
        System.out.print("Masukkan nama penjual : ");
        String m = mPenjual.nextLine();
        System.out.print("Masukkan nama pembeli : ");        
        String n = nPembeli.nextLine();
        System.out.print("Masukkan nama barang : ");
        String b = bBarang.nextLine();
        System.out.print("Berapa jumlah total yang dibeli : ");
        int t = tBeli.nextInt();
        System.out.println("-------------------------------------------------");
        System.out.print("Berapa jam kerja karyawan : ");
        int u = uUpah.nextInt();
        System.out.print("Barang dikirim ke mana ? ");
        String k = kKota.nextLine();
        System.out.println("-------------------------------------------------");
        
        Penjual penjual = new Penjual();
        penjual.setNama(m);
        penjual.setJam(u);
        
        Pembeli pembeli = new Pembeli();
        pembeli.setNama(n);
        
        Barang barang = new Barang();
        barang.setNama(b);
        System.out.println("Nama Barang : " + barang.getNama());
        System.out.println("Harga Unit Barang : " + barang.getHarga());
        System.out.println("-------------------------------------------------");
        System.out.println("Harga Diskon Jika Pembelian >= 1.5Jt : " + pembeli.getDiskon());
        System.out.println("-------------------------------------------------");
        penjual.siapaKamu();
        pembeli.siapaKamu();
        System.out.println("-------------------------------------------------");
        
        // Hitung total dan diskon
        int beli, totDiskon = 0, total = 0;
        
        beli = barang.getHarga() * t;
        
        if (beli >= 1500000) {
            totDiskon = (int) (beli * pembeli.getDiskon());
            total = beli - totDiskon;
            //System.out.println("Diskon: Rp." + totDiskon);            
        } else {
            System.out.println(beli);
        }
        
        // Hitung upah karyawan
        int gaji = (int) (penjual.getUpah() * penjual.getJam());
        
        // Hitung biaya pengiriman
        int ongkos, jarak;
            switch (k) {
                case "Surabaya":
                    jarak = 169;
                    ongkos = jarak * 2500;
                    System.out.println("Pengiriman ke Surabaya dengan jarak " + jarak + "m, sebesar Rp. " + ongkos);
                    break;

                case "Bandung":
                    jarak = 452;
                    ongkos = jarak * 4000;
                    System.out.println("Pengiriman ke Surabaya dengan jarak " + jarak + "m, sebesar Rp. " + ongkos);
                    break;

                default:
                    System.out.println("Kota tidak dikenal");
                    System.out.println("---------------------------------------------");
            }
        
        System.out.println("-------------------------------------------------");
        System.out.println("Total diskon yang di dapat adalah : Rp. " + totDiskon);
        System.out.println("Total pembelian adalah : Rp. " + total);
        System.out.println("-------------------------------------------------");
        System.out.println("Total jam kerja karyawan : " + penjual.getJam() + " Jam ");
        System.out.println("Upah yang di dapatkan oleh karyawan sebesar : RP. " + gaji);
    }
}
