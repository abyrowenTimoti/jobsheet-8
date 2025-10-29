
import java.util.Scanner;
public class TugasNo1 {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Masukkan nilai n = ");
    int n=sc.nextInt();
    int kuadrat;
    int i=1;
    do {
      int total=0;
      System.out.print("n = "+ i+ "=> jumlah kuadrat= ");
      int j=1;
      do {
        kuadrat=j*j;
        System.out.print(kuadrat);
        if (j<i) {
          System.out.print(" + ");
        }
        total+=kuadrat;
        j++;
      } while (j<=i); 
      System.out.print(" = " +total);
      i++;
      System.out.println();
    } while (i<=n);
  }
}
