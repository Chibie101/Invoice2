import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String answer;
        Invoice bison1 = new Invoice("Bison Sweater", 55.99);
        Invoice bison2 = new Invoice("Bison Tee", 14.99);
        Invoice bison3 = new Invoice("Bison Hoodie ", 23.99);
        Invoice bison4 = new Invoice("Bison Bumpersticker ", 4.99);
        Scanner input = new Scanner(System.in;
            double total = 0;
            System.out.println("What do you want to do?");
            System.out.println("1) add purchase 2) finish transaction");
            answer = input.nextLine();
            if (answer.equals("1")) {
                System.out.println("What do you wish to buy?");
                answer = input.nextLine();
                if (answer == "Bison Sweater") {
                    bison1.getprice();
                    total += bison1.getprice();
                }
                if (answer == "Bison Tee") {
                    bison2.getprice();
                    total += bison2.getprice();
                }
                if (answer == "Bison Hoodie") {
                    bison3.getprice();
                    total += bison3.getprice();
                }
                if (answer == "Bison Bumpersticker") {
                    bison3.getprice();
                    total += bison3.getprice();
                }
                if (answer.equals("4")) {
                    System.out.println(total);
                }
            }
    }
}