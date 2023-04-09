import java.util.Scanner ;

public class proje7 {
    public static void main(String[] args) {

        double armut = 2.14  , elma = 3.67  , domates  = 1.11 , muz = 0.95,  patlican = 5  , tutar  ;

        Scanner input = new Scanner (System.in);

        System.out.print("ARMUT KAÇ KİLO ? ");
        armut = input.nextDouble();
        System.out.print("ELMA KAÇ KİLO ?" );
        elma= input.nextDouble();
        System.out.print("DOMATES KAÇ KİLO ?");
        domates = input.nextDouble();
        System.out.print("MUZ KAÇ KİLO ?");
        muz = input.nextDouble();
        System.out.print("PATLICAN KAÇ KİLO ?");
        patlican= input.nextDouble();

        tutar = (armut*(2.14)) + (elma * (3.67)) + (domates*(1.11)) + (muz * (0.95)) + (patlican * 5) ;

        System.out.println("TOPLAM TUTAR :"  + tutar );
    }
}
