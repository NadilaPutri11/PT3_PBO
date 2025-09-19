package model;

public class ResepMinuman extends resep {
    public ResepMinuman(String namaMasakan, String bahanUtama, int lamaMemasak) {
        super(namaMasakan, bahanUtama, lamaMemasak, "Minuman");
    }

    @Override
    public String toString() {
        return "[Minuman] " + super.toString();
    }
}
