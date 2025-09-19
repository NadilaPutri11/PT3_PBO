package model;

public class ResepMakanan extends resep {
    public ResepMakanan(String namaMasakan, String bahanUtama, int lamaMemasak) {
        super(namaMasakan, bahanUtama, lamaMemasak, "Makanan");
    }

    @Override
    public String toString() {
        return "[Makanan] " + super.toString();
    }  
}
