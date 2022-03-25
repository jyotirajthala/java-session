package day3;

public class VariablesAndConstants {

    public static void main(String[] args){
        String postId = "insta1"; // Variable declare
        postId = "insta2";

        final String TITLE = "This is constant";
        //TITLE = "Constant value can't be changed";

        final String SMALL= "S";
        final String MEDIUM= "M";
        final String LARGE= "L";
        final String EXTRA_LARGE= "XL";

        enum SIZE {
            SMALL, MEDIUM, LARGE, EXTRA_LARGE
        }

        int x= 45;
        x+=9; // x= x+9;
        x-=9; //x= x-9;
        x*=9; //x= x*9;
        x/=9; //x= x/9;


        int a= 7;
        int b= 9;
        int c= 5;
        int d= 6;
        int e= ((a*b)+(c+d));
        System.out.println(e);

    }


}
