
import java.util.Scanner ;

public class proje2 {
    public static void main(String[] args) {

    double tutar , kdvTutar , kdvliTutar , kdvOran =  0.18 ;

    Scanner input = new Scanner(System. in) ;
    System.out.print(" ÜCRET TUTARINI GİRİNİZ: ") ;
    tutar= input.nextDouble();

    kdvTutar = tutar * kdvOran ;
    kdvliTutar= tutar + kdvTutar ;

        System.out.println("KDV'SİZ TUTAR : " + tutar );
        System.out.println("KDV ORANI :" + kdvOran ) ;
        System.out.println("KDV TUTARI : " +kdvTutar );
        System.out.println("KDVLİ TUTARI : " + kdvliTutar );
    }
}