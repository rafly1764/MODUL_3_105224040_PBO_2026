import java.util.Scanner;

public class Pretest_105224040 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int usia;
        float berat;
        float hemoglobin;

        System.out.print("Masukkan Usia: ");
        usia = input.nextInt();
        System.out.print("Masukkan Berat Badan (kg): ");
        berat = input.nextFloat();
        System.out.print("Masukkan Kadar Hemoglobin (g/dL): ");
        hemoglobin = input.nextFloat();

        if (usia >= 18) {
            if (berat >= 45) {
                if (hemoglobin >= 15) {
                    System.out.println(" Anda LAYAK menjadi donor darah.");
                } else {
                    System.out.println("Anda TIDAK LAYAK mendonorkan darah.");
                    System.out.println("Alasan: Kadar hemoglobin terlalu rendah.");
                }
            } else {
                System.out.println("Anda TIDAK LAYAK mendonorkan darah.");
                System.out.println("Alasan: Berat badan kurang dari 45 kg.");
            }
        } else {
            System.out.println("Anda TIDAK LAYAK mendonorkan darah.");
            System.out.println("Alasan: Usia kurang dari 17 tahun.");
        }
        input.close();
    }
}