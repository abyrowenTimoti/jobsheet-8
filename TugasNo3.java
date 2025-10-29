import java.util.Scanner;

public class TugasNo3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Jumlah cabang cafe = ");
    int cabang = sc.nextInt();
    System.out.println("===Input Penjualan per Cabang===");

    int i = 1;
    int totalPelanggan = 0;
    int jlhItemAkhir = 0;

    do {
      System.out.println("---Cabang " + i + " ---");
      System.out.print("Jumlah pelanggan: ");
      int pelanggan = sc.nextInt();
      totalPelanggan += pelanggan;

      int j = 1;
      int jlhItem = 0;

      do {
        System.out.print("--Pelanggan " + j + " memesan berapa item? ");
        int item = sc.nextInt();
        jlhItem += item;
        j++;
      } while (j <= pelanggan);

      jlhItemAkhir += jlhItem;

      System.out.println("Cabang " + i + ":");
      System.out.println("Pelanggan = " + pelanggan);
      System.out.println("Item terjual = " + jlhItem);
      i++;
    } while (i <= cabang);

    System.out.println("=== Total Seluruh Cabang ===");
    System.out.println("Total pelanggan = " + totalPelanggan);
    System.out.println("Item terjual = " + jlhItemAkhir);
  }
}