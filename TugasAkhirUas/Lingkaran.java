package TugasAkhirUas;

// Implementasi lingkaran
class Lingkaran implements BangunDatar {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

    @Override
    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }
}