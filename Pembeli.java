public class Pembeli extends Barang {
    private String alamat;
    private double diskon;
    
    public String getAlamat() {
        return alamat;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public double getDiskon() {
        diskon = 0.15;
        return diskon;
    }
    
    public void setDiskon(Double diskon) {
        this.diskon = diskon;
    }
    
    public void siapaKamu() {
        System.out.println("Saya " + nama + " dan saya pembeli");
    }
}
