import java.util.Scanner;

public class PostTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilihan;
        int saldo = 500000;
        int jumlah;

        do {
            System.out.println("MENU ATM");
            System.out.println("1.Cek Saldo");
            System.out.println("2.Setor Tunai");
            System.out.println("3.Tarik Tunai");
            System.out.println("4.Keluar");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();

            switch(pilihan) {
                case 1:
                    System.out.println("Saldo anda: Rp " + saldo);
                    break;
                case 2:
                    System.out.print("Masukkan jumlah setor: Rp ");
                    jumlah = input.nextInt();
                    saldo = saldo + jumlah;
                    System.out.println("Setor berhasil.");
                    System.out.println("Saldo sekarang: Rp " + saldo);
                    break;
                case 3:
                    System.out.print("Masukkan jumlah tarik: Rp ");
                    jumlah = input.nextInt();
                    if(saldo - jumlah >= 50000) {
                        saldo = saldo - jumlah;
                        System.out.println("Penarikan berhasil.");
                        System.out.println("Saldo sekarang: Rp " + saldo);
                    } else {
                        System.out.println("Penarikan gagal.");
                        System.out.println("Saldo tidak boleh kurang dari Rp 50000.");
                    }
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan ATM.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

            System.out.println();

        } while(pilihan != 4);
        input.close();
    }
}