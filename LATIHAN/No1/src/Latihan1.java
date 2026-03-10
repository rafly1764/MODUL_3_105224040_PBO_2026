import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a, b , hasil;
        char operator;

        System.out.print("Masukkan angka pertama: ");
        a = input.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        b = input.nextDouble();
        System.out.print("Masukkan operator (+, -, *, /): ");
        operator = input.next().charAt(0);

        switch(operator) {
            case '+':
                hasil = a + b;
                System.out.println("Hasil = " + hasil);
                break;
            case '-':
                hasil = a - b;
                System.out.println("Hasil = " + hasil);
                break;
            case '*':
                hasil = a * b;
                System.out.println("Hasil = " + hasil);
                break;
            case '/':
                if(b != 0) {
                    hasil = a / b;
                    System.out.println("Hasil = " + hasil);
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diizinkan.");
                }
                break;
            default:
                System.out.println("Operator tidak valid.");
        }
        input.close();
    }
}