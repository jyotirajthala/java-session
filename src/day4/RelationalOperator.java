package day4;

public class RelationalOperator {
    public static void main(String[] args) {
        int m = 8;
        int n = 10;

        /*
        boolean isEqual = m==n;
        System.out.println(isEqual);

        boolean isNotEqual = m!=n;
        System.out.println(isNotEqual);

        boolean isLessThan = m<n;
        System.out.println(isLessThan);

        boolean isLessThanEqual = m<=n;
        System.out.println(isLessThanEqual);

        boolean isGreaterThan = m>n;
        System.out.println(isGreaterThan);

        boolean isGreaterThanEqual = m>=n;
        System.out.println(isGreaterThanEqual);
        */

        boolean x = false;
        boolean y = true;

        //AND operator '&&' Both value need to be true for true result

        boolean anding = x && y;
        System.out.println(anding);

        boolean and = (m<n) && (n>m);
        System.out.println(and);

        // OR operator '||' Either value can be true for true result
        boolean oring = x || y;
        System.out.println(oring);

        boolean or = (m<n) || (m==n);
        System.out.println(or);

        //Ternary operator (condition?"True":"False")

        int age = 25;
        String message = age>18 ? "You are eligible" : "You are not eligible";
        System.out.println(message);

    }
}
