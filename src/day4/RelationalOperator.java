package day4;

public class RelationalOperator {
    public static void main(String[] args) {
        int m = 8;
        int n = 10;

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
    }
}
