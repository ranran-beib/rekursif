import java.util.Scanner;

public class Tugas {
    static int totalRekursif(int n) {
        if (n == 0) {
            return 0;
        } else {
            return + totalRekursif(n - 1);
        }
    }

    static int totalIteratif(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int n = sc.nextInt();

        System.out.println("Total Rekursif: " + totalRekursif(n));
        System.out.println("Total Iteratif: " + totalIteratif(n));
    }
}