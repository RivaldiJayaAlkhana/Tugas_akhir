package TugasAkhirUas;

// Factory untuk menciptakan objek BangunDatar
class BangunDatarFactory {
    public BangunDatar createBangunDatar(String jenis, double... parameters) {
        switch (jenis.toLowerCase()) {
            case "persegi":
                return new Persegi(parameters[0]);
            case "lingkaran":
                return new Lingkaran(parameters[0]);
            case "segitiga":
                return new Segitiga(parameters[0], parameters[1]);
            case "persegi panjang":
                return new PersegiPanjang(parameters[0], parameters[1]);
            default:
                throw new IllegalArgumentException("Jenis bangun datar tidak valid: " + jenis);
        }
    }
}