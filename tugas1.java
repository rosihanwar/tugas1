class Film {
    String judul, genre, jamPenayangan;
    double hargaTiket;

    Film(String judul, String genre, String jamPenayangan, double hargaTiket) {
        this.judul = judul;
        this.genre = genre;
        this.jamPenayangan = jamPenayangan;
        this.hargaTiket = hargaTiket;
    }
}

class Studio {
    int nomerStudio;
    Film film;

    Studio(int nomerStudio, Film film) {
        this.nomerStudio = nomerStudio;
        this.film = film;
    }
}

class Tiket {
    static int nomer = 1;
    int nomerTiket, kursi;
    String nama;
    Film film;
    Studio studio;

    Tiket(Film film, Studio studio, int kursi, String nama) {
        this.nomerTiket = nomer++;
        this.film = film;
        this.studio = studio;
        this.kursi = kursi;
        this.nama = nama;
    }
}

public class BioskopABC {
    public static void main(String[] args) {
        Film film1 = new Film("Air Mata Yang Dijanjikan", "Romance", "18:00", 40000);
        Film film2 = new Film("404", "Sci-Fi", "14:00", 40000);
        Film film3 = new Film("KUMAR", "Horor", "20:00", 40000);
        
        Studio studio1 = new Studio(1, film1);
        Studio studio2 = new Studio(2, film2);
        Studio studio3 = new Studio(3, film3);
        
        Tiket tiket1 = new Tiket(film1, studio1, 13, "udin1");
        Tiket tiket2 = new Tiket(film2, studio2, 12, "udin2");
        Tiket tiket3 = new Tiket(film3, studio3, 11, "udin3");
        
        System.out.println("Tiket " + tiket1.nomerTiket + ": " + tiket1.nama + " menonton " + tiket1.film.judul + " di Studio " + tiket1.studio.nomerStudio + " (Kursi " + tiket1.kursi + ")");
        System.out.println("Tiket " + tiket2.nomerTiket + ": " + tiket2.nama + " menonton " + tiket2.film.judul + " di Studio " + tiket2.studio.nomerStudio + " (Kursi " + tiket2.kursi + ")");
        System.out.println("Tiket " + tiket3.nomerTiket + ": " + tiket3.nama + " menonton " + tiket3.film.judul + " di Studio " + tiket3.studio.nomerStudio + " (Kursi " + tiket3.kursi + ")");
    }
}
