import java.util.Scanner ;

public class proje5 {
    public static void main(String[] args) {

        int km ;
        double total , perKm = 2.20 , startPrice = 10 ;

        Scanner input = new Scanner( System.in) ;

        System.out.print("KM GİRİNİZ : ");
        km = input.nextInt() ;

        total  = ( km * perKm );
        total += startPrice ;

        total = ( total < 20  ) ? 20 : total ;
        System.out.println( "Toplam TUTAR : "+ total) ;




    }
}
