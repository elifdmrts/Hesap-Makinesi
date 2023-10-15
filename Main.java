import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
double sayı1,sayı2,secım;
        Scanner scanner=new Scanner(System.in);
        System.out.print("1.Sayıyı Giriniz: ");
        sayı1=scanner.nextDouble();
        System.out.print("2.Sayıyı Giriniz: ");
        sayı2=scanner.nextDouble();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Tercihiniz: ");
        secım=scanner.nextInt();

        switch ((int) secım) {

            case 1:
                System.out.println("Toplam: " + (sayı1 + sayı2));
                break;
            case 2:
                System.out.println("Çıkarma: " + (sayı1 - sayı2));
                break;
            case 3:
                System.out.println("Çarpma: " + (sayı1 * sayı2));
                break;
            case 4:
                if(sayı2 !=0 ){
                    System.out.println("Bölme: " + (sayı1 / sayı2));
                }
                else System.out.println("Bir Sayı Sıfıra Bölünemez.");
                break;

            default: System.out.println("Yanlış Tercihte Bulundunuz, Yeniden deyeneyiniz ");

        }
    }
}