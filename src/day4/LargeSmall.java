package day4;

public class LargeSmall {
    public static void main(String[] args){
        int a = 10;
        int b = 8;
        int c = 45;

        if( a>b && a>c ){
            System.out.println("Largest number is " + a );
        }

        if( b>a && b>c ){
            System.out.println("Largest number is " + b );
        }

        if( c>a && c>b ){
            System.out.println("Largest number is " + c );
        }

        if( a<b && a<c ){
            System.out.println("Smallest number is " + a );
        }

        if( b<a && b<c ){
            System.out.println("Smallest number is " + b );
        }

        if( c<a && c<b ){
            System.out.println("Smallest number is " + c );
        }





    }
}
