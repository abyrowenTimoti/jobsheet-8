import java.util.Scanner;

public class TugasNo2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("masukkan nilai n (minimal 3) = ");
    int n = sc.nextInt();

    if (n >= 3) {
      int i = 1;
      do {
        int j = 1;
        do {
          if (i == 1 || i == n || j == 1 || j == n) {
            System.out.print(n + " ");
          } else {
            System.out.print("  ");
          }
          j++;
        } while (j <= n);
        System.out.println();
        i++;
      } while (i <= n);
    } else {
      System.out.println("angka tidak valid");
    }
  }
}