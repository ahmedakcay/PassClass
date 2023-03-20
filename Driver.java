//author ahmedakcay
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] dersler = {"Matematik", "Fizik", "Kimya", "Biyo", "Muzik" };
        double Matematik=0, Fizik=0, Kimya=0, Biyo=0, Muzik=0;
        double ort=0;
        String sonuc;

        System.out.print("Lutfen " + dersler[0] + " notunuzu giriniz :" );
        Matematik = scanner.nextDouble();
        if (Matematik > 100  || Matematik <0){
            System.out.println("0 ie 100 arasında sayı girmediniz!! Matematik notunuz ortalamaya dahil edilmedi.");
            Matematik=0;
        }

        System.out.print("Lutfen " + dersler[1] + " notunuzu giriniz :" );
        Fizik = scanner.nextDouble();
        if (Fizik > 100  || Fizik <0){
            System.out.println("0 ie 100 arasında sayı girmediniz!! Fizik notunuz ortalamaya dahil edilmedi.");
            Fizik=0;
        }

        System.out.print("Lutfen " + dersler[2] + " notunuzu giriniz :" );
        Kimya = scanner.nextDouble();
        if (Kimya > 100  || Kimya <0){
            System.out.println("0 ie 100 arasında sayı girmediniz!! Kimya notunuz ortalamaya dahil edilmedi.");
            Kimya=0;
        }

        System.out.print("Lutfen " + dersler[3] + " notunuzu giriniz :" );
        Biyo = scanner.nextDouble();
        if (Biyo > 100  || Biyo <0){
            System.out.println("0 ie 100 arasında sayı girmediniz!! Biyoloji notunuz ortalamaya dahil edilmedi.");
            Biyo=0;
        }

        System.out.print("Lutfen " + dersler[4] + " notunuzu giriniz :" );
        Muzik = scanner.nextDouble();
        if (Muzik > 100  || Muzik <0){
            System.out.println("0 ie 100 arasında sayı girmediniz!! Muzik notunuz ortalamaya dahil edilmedi.");
            Muzik=0;
        }

        ort = ((Matematik + Fizik + Kimya + Biyo + Muzik)/dersler.length  );
        System.out.println("Ortalamanız : " + ort);

        sonuc = ort>=55 ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız";
        System.out.println("Sonuc :" + sonuc);








    }
}
