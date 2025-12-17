import java.util.Scanner;

public class Percobaan2 {
    static int hitungPangkat(int bilangan, int pangkat) {
        if (pangkat == 0) {
            return 1;

        } else {
            return bilangan * hitungPangkat(bilangan, pangkat - 1);
        }
    }

    static void cetakDeret(int bilangan, int pangkat) {
        if (pangkat == 0) {
            System.out.println("1");
        } else {
            System.out.print(bilangan + " x ");
            cetakDeret(bilangan, pangkat -1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan bilangan: ");
        int bilangan = sc.nextInt();

        System.out.println("Masukkan pangkat: ");
        int pangkat = sc.nextInt();

        cetakDeret(bilangan, pangkat);
        System.out.println(" = " + hitungPangkat(bilangan, pangkat));
    }
}