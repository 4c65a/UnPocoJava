import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt() + i;
        double b = scan.nextDouble() + d;
        scan.nextLine();
        String c = scan.nextLine();;

        System.out.println(a);

  
        System.out.println(b);
       
        System.out.println(s.concat(c));

        scan.close();
    }
}
