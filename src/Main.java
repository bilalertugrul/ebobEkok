import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number1, number2, ebob=0, ekok;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı 1 Gir : ");
        number1 = input.nextInt();
        System.out.print("Sayı 2 Gir : ");
        number2 = input.nextInt();

        for (int i=1; i<=number2; i++) {
            if((number1 % i == 0) && (number2 % i == 0)){
                ebob=i;
            }
        }
        System.out.println("EBOB : " + ebob);

        if(ebob>1){
            ekok = (number1*number2)/ebob;
            System.out.println("EKOK : " +  ekok);
        }else{
            System.out.println("EKOK : 1'dir Çünkü " + number1 + " ve " + number2 + " aralarında asaldır.");
        }

    }
}