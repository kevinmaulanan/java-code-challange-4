import java.util.Scanner;
public class Method {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan angka: ");
        int angka = scanner.nextInt();
        
        System.out.println(calc(angka));
    }

    static String calc(int angka) {
        String textHasil = "Hasil yang di dapatkan: ";
        if (angka < 0 || angka > 100) textHasil = "Rentang angka harus dari 0 - 100";
        else if (angka <= 20) textHasil += "E";
        else if (angka <= 40) textHasil += "D";
        else if (angka <= 60) textHasil += "C";
        else if (angka <= 80) textHasil += "B";
        else textHasil += "A";

        return textHasil;
    }
}