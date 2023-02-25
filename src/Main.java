import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("bir sayı giriniz : ");
        int n1 = input.nextInt();

        System.out.print("ikinci sayıyı giriniz : ");
        int n2 = input.nextInt();

        if (n1 <= n2) {
            int ebob = 1, k = 1;
            while (k<=n1) {

                if (n1 % k == 0 && n2 % k == 0){

                    ebob=k;
                }
                k++;
            }System.out.println("Ebob="+ ebob);
            System.out.println("Ekok=" +(n1*n2)/ebob);
        }
        if (n2< n1) {
            int ebob = 1, k = 1;
            while (k<=n2) {

                if (n1 % k == 0 && n2 % k == 0){

                    ebob=k;
                }
                k++;
            }System.out.println("Ebob="+ebob);
            System.out.println("Ekok=" +(n1*n2)/ebob);
        }
    }
}
