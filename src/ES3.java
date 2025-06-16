import java.util.Scanner;

public class ES3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Inserisci 2 numeri per calcolare il perimetro");
        double n1= scanner.nextDouble();
        double n2= scanner.nextDouble();
        System.out.println("Ecco il perimetro richiesto :"+ (2*n1 +2*n2));
        System.out.println("Inserisci un numeri per calcolare se è pari (0) o dispari(1) ");
        double n3= scanner.nextDouble();
        if (n3%2==0){
            System.out.println("0");
        }else {
            System.out.println("1");
        }

    }
}
