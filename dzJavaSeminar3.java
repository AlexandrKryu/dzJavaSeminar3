import java.util.Scanner;

public class dzJavaSeminar3 {
        static void generate(int a, int b, int c, int d, String path) {
          
        if (a > b)
            return;
        if (a == b) {
            System.out.println(path);
            return;
        }
        generate(a * c, b, c, d, path + "K1 ");
        generate(a + d, b, c, d, path + "K2 ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      System.out.println("Введите число a: ");
      int a = sc.nextInt();
      System.out.println("Введите число b: ");
      int b = sc.nextInt();
      System.out.println("Введите число c: ");
      int c = sc.nextInt();
      System.out.println("Введите число d: ");
      int d = sc.nextInt();
      sc.close();
        generate(a, b, c, d, "Число действий: ");
    }
}