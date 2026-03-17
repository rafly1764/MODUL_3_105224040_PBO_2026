import java.util.Scanner;

public class THT_modul3_105224040 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int stokVIP = 5;
        int stokFestival = 25;
        int stokTribune = 35;
        int pilihan;

        do {
            System.out.println("=== UNIVERSITAS PERTAMINA SOUNDFEST 2026 ===");
            System.out.println("Sisa Stok:");
            System.out.println("VIP: " + stokVIP + "        |   Syarat Usia: Minimal 18 tahun." );
            System.out.println("Festival: " + stokFestival + "  |   Syarat Usia: Minimal 15 tahun." );
            System.out.println("Tribune: " + stokTribune + "   |   Syarat Usia: Tidak ada batasan." );
            System.out.println("-------------------------------");
            System.out.println("1. VIP (Rp 1500000)");
            System.out.println("2. Festival (Rp 800000)");
            System.out.println("3. Tribune (Rp 500000)");
            System.out.println("4. Matikan Mesin");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();

            int jumlah;
            int usia;
            int total = 0;
            int tiketBerhasil = 0;

            switch (pilihan) {

                case 1:
                    System.out.print("Jumlah tiket VIP: ");
                    jumlah = input.nextInt();
                    if (jumlah > stokVIP) {
                        System.out.println("Stok VIP tidak mencukupi.");
                        break;
                    }
                    for (int i = 1; i <= jumlah; i++) {
                        while (true) {

                            System.out.print("Masukkan usia untuk tiket ke-" + i + " (-1 untuk batal): ");
                            usia = input.nextInt();
                            if (usia == -1) {
                                System.out.println("Batal pembelian darurat. Kembali ke menu utama.");
                                break;
                            }
                            if (usia <= 0 || usia > 110) {
                                System.out.println("Usia tidak logis. Silakan masukkan kembali.");
                                continue;
                            }
                            if (usia < 18) {
                                System.out.println("Usia tidak memenuhi syarat VIP.");
                                break;
                            }
                            System.out.println("Tiket VIP ke-" + i + " berhasil.");
                            tiketBerhasil++;
                            total += 1500000;
                            stokVIP--;
                            break;
                        }
                        if (usia == -1) {
                            break;
                        }
                    }

                    System.out.println("Tiket berhasil: " + tiketBerhasil);
                    System.out.println("Total bayar: Rp " + total);
                    break;

                case 2:
                    System.out.print("Jumlah tiket Festival: ");
                    jumlah = input.nextInt();
                    if (jumlah > stokFestival) {
                        System.out.println("Stok Festival tidak mencukupi.");
                        break;
                    }
                    for (int i = 1; i <= jumlah; i++) {
                        while (true) {
                            System.out.print("Masukkan usia tiket ke-" + i + " (-1 batal): ");
                            usia = input.nextInt();
                            if (usia == -1) {
                                System.out.println("Pembatalan darurat.");
                                break;
                            }
                            if (usia <= 0 || usia > 120) {
                                System.out.println("Usia tidak logis.");
                                continue;
                            }
                            if (usia < 15) {
                                System.out.println("Tidak memenuhi syarat Festival.");
                                break;
                            }

                            System.out.println("Tiket Festival berhasil.");
                            tiketBerhasil++;
                            total += 800000;
                            stokFestival--;
                            break;
                        }
                        if (usia == -1) {
                            break;
                        }
                    }

                    System.out.println("Tiket berhasil: " + tiketBerhasil);
                    System.out.println("Total bayar: Rp " + total);
                    break;

                case 3:
                    System.out.print("Jumlah tiket Tribune: ");
                    jumlah = input.nextInt();
                    if (jumlah > stokTribune) {
                        System.out.println("Stok Tribune tidak mencukupi.");
                        break;
                    }
                    for (int i = 1; i <= jumlah; i++) {
                        while (true) {
                            System.out.print("Masukkan usia tiket ke-" + i + " (-1 batal): ");
                            usia = input.nextInt();
                            if (usia == -1) {
                                System.out.println("Pembatalan darurat.");
                                break;
                            }
                            if (usia <= 0 || usia > 120) {
                                System.out.println("Usia tidak logis.");
                                continue;
                            }

                            System.out.println("Tiket Tribune berhasil.");
                            tiketBerhasil++;
                            total += 500000;
                            stokTribune--;
                            break;
                        }
                        if (usia == -1) {
                            break;
                        }
                    }
                    System.out.println("Tiket berhasil: " + tiketBerhasil);
                    System.out.println("Total bayar: Rp " + total);
                    break;

                case 4:
                    System.out.println("Mesin dimatikan oleh teknisi.");
                    break;
                default:
                    System.out.println("Menu tidak tersedia.");
            }
            System.out.println();
        } while (pilihan != 4);
            input.close();
    }
}