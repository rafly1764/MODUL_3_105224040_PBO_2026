import java.util.Scanner;
public class Latihan4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nilai;
        int absensi;

        System.out.print("Masukkan nilai ujian akhir: ");
        nilai = input.nextInt();
        System.out.print("Masukkan persentase absensi: ");
        absensi = input.nextInt();
        String status = (nilai >= 75 && absensi >= 80) ? "Lulus" : "Tidak Lulus";
        System.out.println("Status: " + status);
        input.close();
    }
}