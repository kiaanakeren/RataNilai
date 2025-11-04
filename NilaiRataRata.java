import java.util.*;

public class NilaiRataRata {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Program Hitung Rata-Rata Nilai Siswa");
        System.out.print("Masukkan jumlah siswa: ");
        int jumlah = in.nextInt();

        double total = 0;

        for (int i = 1; i <= jumlah; i++) {
            System.out.print("Masukkan nilai siswa ke-" + i + ": ");
            double nilai = in.nextDouble();
            total += nilai;
        }

        double rata = total / jumlah;

        System.out.println("Rata-rata nilai seluruh siswa = " + rata);
        in.close();
    }
}
