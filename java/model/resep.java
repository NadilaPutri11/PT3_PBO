package model;

public class resep {
    private String namaMasakan;
    private String bahanUtama;
    private int lamaMemasak;
    private String kategori;
    
    public resep(String namaMasakan, String bahanUtama, int lamaMemasak, String kategori) {
        this.namaMasakan = namaMasakan;
        this.bahanUtama = bahanUtama;
        this.lamaMemasak = lamaMemasak;
        this.kategori = kategori;
    }
    
    public String getNamaMasakan() {
        return namaMasakan;
    }

    public void setNamaMasakan(String namaMasakan) {
        this.namaMasakan = namaMasakan;
    }

    public String getBahanUtama() {
        return bahanUtama;
    }

    public void setBahanUtama(String bahanUtama) {
        this.bahanUtama = bahanUtama;
    }

    public int getLamaMemasak() {
        return lamaMemasak;
    }

    public void setLamaMemasak(int lamaMemasak) {
        this.lamaMemasak = lamaMemasak;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
    
    @Override
    public String toString() {
        return namaMasakan + " | Kategori: " + kategori +
               " | Bahan: " + bahanUtama +
               " | Lama: " + lamaMemasak + " menit";
    }
}