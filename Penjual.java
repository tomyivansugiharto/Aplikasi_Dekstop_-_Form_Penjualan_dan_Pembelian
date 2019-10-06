public class Penjual extends Barang {
    private int jam;
    private double upah;
    
    public int getJam() {
        return jam;
    }
    
    public void setJam(int jam) {
        this.jam = jam;
    }
    
    public double getUpah() {
        upah = 2500;
        return upah;
    }
    
    public void setUpah(Double upah) {
        this.upah = upah;
    }
    
    public void siapaKamu() {
        System.out.println("Saya " + nama + " dan saya penjual");
    }
}
