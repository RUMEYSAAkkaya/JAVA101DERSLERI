import java.util.Scanner ;

public class proje3 {
    public static void main(String[] args) {

    int a , b  ;
    double c ;

    Scanner input = new Scanner(System.in) ;
    System.out.print("1. kenarı yazınız : ");
    a = input.nextInt();
    System.out.print("2. kenarı yazınız : ");
    b=input.nextInt();

    c=Math.sqrt((a*a)+(b*b)) ;

        System.out.println("HİPOTENUS : " + c );




    }
}
