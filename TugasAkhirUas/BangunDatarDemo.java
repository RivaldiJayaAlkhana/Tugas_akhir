package TugasAkhirUas;

import java.util.Scanner;

public class BangunDatarDemo {
    // Main class dengan contoh penggunaan
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jenis bangun datar
        System.out.print("Masukkan jenis bangun datar (persegi/lingkaran/segitiga/persegi panjang): ");
        String jenis = scanner.nextLine();

        // Membuat objek BangunDatar menggunakan BangunDatarFactory
        BangunDatarFactory factory = new BangunDatarFactory();

        // Input nilai untuk bentuk bangun datar tertentu
        double[] parameters;
        switch (jenis.toLowerCase()) {
            case "persegi":
                System.out.print("Masukkan panjang sisi Persegi: ");
                parameters = new double[]{scanner.nextDouble()};
                break;
            case "lingkaran":
                System.out.print("Masukkan panjang jari-jari Lingkaran: ");
                parameters = new double[]{scanner.nextDouble()};
                break;
            case "segitiga":
                System.out.print("Masukkan panjang alas Segitiga: ");
                double alasSegitiga = scanner.nextDouble();
                System.out.print("Masukkan tinggi Segitiga: ");
                double tinggiSegitiga = scanner.nextDouble();
                parameters = new double[]{alasSegitiga, tinggiSegitiga};
                break;
            case "persegi panjang":
                System.out.print("Masukkan panjang Persegi Panjang: ");
                double panjangPersegiPanjang = scanner.nextDouble();
                System.out.print("Masukkan lebar Persegi Panjang: ");
                double lebarPersegiPanjang = scanner.nextDouble();
                parameters = new double[]{panjangPersegiPanjang, lebarPersegiPanjang};
                break;
            default:
                throw new IllegalArgumentException("Jenis bangun datar tidak valid: " + jenis);
        }

        BangunDatar bangunDatar = factory.createBangunDatar(jenis, parameters);
        System.out.println("Luas " + jenis + ": " + bangunDatar.hitungLuas());
        System.out.println("Keliling " + jenis + ": " + bangunDatar.hitungKeliling());

        // Menutup Scanner
        scanner.close();
    }
}
}
