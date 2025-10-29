import java.util.Scanner;

public class nilaiKelompok01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = 1, nilai;
    float totalNilai, rataNilai;

    while (i <= 6) {
      System.out.println("kelompok "+ i);
      totalNilai = 0;
      for (int j=1; j <= 5; j++) {
        System.out.print("nilai kelompok penilai " + j + ": ");
        nilai=sc.nextInt();
        totalNilai+=nilai;
      }
      rataNilai=totalNilai/5;
      i++;
      System.out.println("rata rata nilai kelompok "+ i +" adalah "+ rataNilai);
    }
  }
}
