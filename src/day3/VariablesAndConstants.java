package day3;

public class VariablesAndConstants {

    public static void main(String[] args){
        String postId = "instagram1"; // Variable declare
        postId = "instagram2";

        final String TITLE = "This is constant";
        //TITLE = "Constant value can't be changed";

        //constant
        final String SMALL= "S";
        final String MEDIUM= "M";
        final String LARGE= "L";
        final String EXTRA_LARGE= "XL";

        //enum replaces multiple constant
        enum SIZE {
            SMALL, MEDIUM, LARGE, EXTRA_LARGE
        }

        //assignment operator
        int x= 45;
        x+=9; // x= x+9;
        System.out.println(x);
        x-=9; //x= x-9;
        System.out.println(x);
        x*=9; //x= x*9;
        System.out.println(x);
        x/=9; //x= x/9;
        System.out.println(x);


        //arithmetic operation
        int a= 7;
        int b= 9;
        int c= 5;
        int d= 6;
        int e= ((a*b)+(c+d));
        System.out.println(e);

    }


}
