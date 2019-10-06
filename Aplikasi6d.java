import java.util.Scanner;
public class Aplikasi6d {
    public static void main(String args[]) {
    String nama;
    double upah, jam, pajak, totupah;
    
    Scanner inputNama = new Scanner(System.in);
    System.out.print("Nama karyawan : ");
    nama =  inputNama.next();
    
    Scanner inputJam = new Scanner(System.in);
    System.out.print("Berapa lama kerja karyawan : ");
    jam = inputJam.nextInt();
    
    upah = jam * 2500;
    pajak = 0.15;
    totupah = upah - (upah * pajak);
    System.out.println("---------------------------------------------");
    System.out.println("Total jumlah jam kerja : " + jam + " Jam ");
    System.out.println("Upah yang diperoleh : Rp." + upah);
    System.out.println("Upah yang di peroleh : Rp." + totupah + " perHari ");
    System.out.println("---------------------------------------------");
    }
}
