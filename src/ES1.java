import java.util.Scanner;

public class ES1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci 2 numeri e ricevera il loro prodotto");
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("il prodotto è : " + n1 * n2);
        System.out.println("Inserisci una stringa!");

        String stinga1 = scanner.nextLine();

        System.out.println("Bene! Ora inserisci un numero");
        int n3 = scanner.nextInt();
        System.out.println("Eccoli concatenati :" + stinga1 + " " + n3);
        scanner.close();

        String[] lio = {"lio1", "lio2", "lio3", "lio4", "lio5"};
        String lIo = ("lio6");

        String[] liO = {"", "", "", "", "", ""};
        liO[0] = lio[0];
        liO[1] = lio[1];
        liO[2] = lIo;
        liO[3] = lio[2];
        liO[4] = lio[3];
        liO[5] = lio[4];
        for (int i = 0; i < 6; i++) {
            System.out.println(liO[i]);

        }
    }
}