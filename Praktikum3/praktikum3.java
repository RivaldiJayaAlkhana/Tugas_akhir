import java.util.Scanner;

public class praktikum3 {
    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in);
        // Input nomor lantai yang ingin diakses
        System.out.print("Masukkan nomor lantai yang ingin diakses: ");
        int nomorLantai = myObj.nextInt();

        // Membersihkan buffer masukan
        myObj.nextLine();

        // Mengurangkan 1 dari nomor lantai jika lebih dari 13
        if (nomorLantai > 13) {
            nomorLantai--;
        }

        // Cek apakah nomor lantai adalah 13
        if (nomorLantai == 13) {
            System.out.println("Tidak ada tombol lantai 13 pada lift.");
            System.out.println("Anda dapat mengaksesnya dengan menekan tombol lantai 14.");
        } else {
            System.out.println("Anda berada di lantai " + nomorLantai + ".");
        }

        String userName;

        // Enter username and press Enter
        System.out.println("Masukan Nama dan NIM anda:");
        userName = myObj.nextLine();
        System.out.println("Nama dan NIM: " + userName);
    }
}
