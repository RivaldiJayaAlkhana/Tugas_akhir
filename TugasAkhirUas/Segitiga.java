package TugasAkhirUas;

// Implementasi segitiga
class Segitiga implements BangunDatar {
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    public double hitungKeliling() {
        // Untuk sederhana, asumsikan ini adalah segitiga siku-siku
        double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
        return alas + tinggi + sisiMiring;
    }
}