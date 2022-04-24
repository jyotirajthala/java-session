package day18;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
//        for (int i = 0; i<5; i++){
//            System.out.format("a[%d] = %d \n" , i ,numbers[i]);
//        }
//
//        for (int i = 0; i<numbers.length; i++){
//            System.out.format("a[%d] = %d \n" , i ,numbers[i]);
//        }

        int index = 0;
        for ( int number : numbers) {
            System.out.format("a[%d] = %d \n" , index++ ,number);
        }


    }
}
