import java.util.Scanner;
public class Main {
    public static int finding_ebob(int sayi1, int sayi2){

        int ebob = 1;

        for (int i = 1; i <= sayi1 && i <= sayi2; i++){

            if ((sayi1 % i == 0) && (sayi2 % i == 0)){

                ebob = i;

            }
        }
        return ebob;
    }



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter first number : ");
        int first_number = scanner.nextInt();

        System.out.print("Please enter second number : ");
        int second_number = scanner.nextInt();

        System.out.print("Ebob of Two Numbers : " + finding_ebob(first_number,second_number));


    }
}