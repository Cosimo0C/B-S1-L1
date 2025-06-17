import java.util.Scanner;

public class ES3 {
    public static double perimetroRettangolo(double n1, double n2){
        return (2*n1 +2*n2);
    }
    public static void pariDispari(double n1){
        if (n1%2==0){
            System.out.println("0");
        }else {
            System.out.println("1");
        }
    }
    public static double areaTriangolo(double lat1, double lat2, double lat3){
        double semiperimetroTriangolo= (lat1+lat2+lat3)/2;
        return Math.sqrt(semiperimetroTriangolo*(semiperimetroTriangolo-lat1)*(semiperimetroTriangolo-lat2)*(semiperimetroTriangolo-lat3));
    }
    public static void main(String[] args) {
            Scanner scanner= new Scanner(System.in);
            System.out.println("Inserisci 2 numeri per calcolare il perimetro");
            double n1= scanner.nextDouble();
            double n2= scanner.nextDouble();
            System.out.println("Ecco il perimetro richiesto :"+ perimetroRettangolo(n1, n2) );
            System.out.println("Inserisci un numeri per calcolare se è pari (0) o dispari(1) ");
            double n3= scanner.nextDouble();
            pariDispari(n3);
        System.out.println("Dammi i 3 lati del triangolo!");
            double lat1= scanner.nextDouble();
            double lat2= scanner.nextDouble();
            double lat3= scanner.nextDouble();
          System.out.println("L'area del triangolo è: " + areaTriangolo(lat1, lat2, lat3));
            scanner.close();
    }
}
