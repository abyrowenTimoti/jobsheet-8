import java.util.Scanner;

public class nilaiKelompok01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = 1, nilai, kelTertinggi = 0;
    float totalNilai, rataNilai, rataTertinggi = 0;

    while (i <= 6) {
      System.out.println("Kelompok " + i);
      totalNilai = 0;
      for (int j = 1; j <= 5; j++) {
        System.out.print("Nilai kelompok penilai " + j + ": ");
        nilai = sc.nextInt();
        totalNilai += nilai;
      }
      rataNilai = totalNilai / 5;
      System.out.println("Rata-rata nilai kelompok " + i + " adalah " + rataNilai);
      if (rataNilai > rataTertinggi) {
        rataTertinggi = rataNilai;
        kelTertinggi = i;
      }
      i++;
    }
    System.out.println("\nKelompok dengan rata-rata tertinggi adalah kelompok " + kelTertinggi + " dengan nilai " + rataTertinggi);
  }
}