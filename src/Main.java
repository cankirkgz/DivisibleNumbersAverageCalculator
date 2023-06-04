import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int num;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayıyı giriniz.");
        num = scanner.nextInt();

        int sum = 0;
        int count = 0;
        int i = 0;
        while (i <= num){
            if (i % 3 == 0 && i % 4 == 0){
                sum += i;
                count++;
            }
            i++;
        }
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + average);
        } else {
            System.out.println("3 ve 4'e tam bölünen bir sayı bulunamadı.");
        }
    }
}