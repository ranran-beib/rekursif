import java.util.Scanner;

public class Percobaan3 {
    static double hitungLaba(double saldo, double tahun) {
        if (tahun == 0) {
            return saldo;
        } else {
            return 1.11 * hitungLaba(saldo, tahun - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan saldo awal: ");
        double saldoAwal = sc.nextDouble();

        System.out.print("Masukkan lama investasi (tahun): ");
        double tahun = sc.nextInt();

        System.out.println("Saldo akhir: " + hitungLaba(saldoAwal, tahun));
    }
}