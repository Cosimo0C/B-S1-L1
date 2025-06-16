import java.util.Scanner;

public class ES2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Inserisci 3 stringa!");
        String s1= scanner.nextLine();
        String s2= scanner.nextLine();
        String s3= scanner.nextLine();
        System.out.println();
        System.out.println(s1+s2+s3);
        System.out.println(s3+s2+s1);
    }
}