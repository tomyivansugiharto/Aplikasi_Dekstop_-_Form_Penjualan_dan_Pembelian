import java.util.Scanner;
public class Aplikasi6c {
    public static void main(String args[]) {
    String nama;
    double upah, jam;
    
    Scanner inputNama = new Scanner(System.in);
    System.out.print("Nama karyawan : ");
    nama =  inputNama.next();
    
    Scanner inputJam = new Scanner(System.in);
    System.out.print("Berapa lama kerja karyawan : ");
    jam = inputJam.nextInt();
    
    upah = jam * 2500;
    System.out.println("Total jumlah jam kerja : " + jam + " Jam ");
    System.out.println("Upah yang di peroleh : Rp." + upah + " perHari ");
    }
}
