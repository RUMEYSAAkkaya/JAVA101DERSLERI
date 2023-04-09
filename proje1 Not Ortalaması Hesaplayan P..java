import java.util.Scanner;

public class proje1 {
    public static void main(String[] args) {

        int matematik,fizik,kimya,biyoloji,muzik,tarih ;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        matematik = inp.nextInt();

        System.out.print("Fizik Notunuz :");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz :");
        kimya = inp.nextInt() ;

        System.out.print("Biyoloji Notunuz :" );
        biyoloji=inp.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzik =inp.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih =inp.nextInt();



        int toplam = (matematik + fizik + kimya + tarih + muzik + biyoloji ) ;

        double sonuc = toplam / 6 ;
        System.out.println("Ortalamanız =" + sonuc );


        System.out.println(sonuc>=60? "Sınıfı Geçtiniz " : "Sınıfta Kaldınız ");






    }

}
