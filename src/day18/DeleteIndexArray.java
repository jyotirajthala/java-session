package day18;

public class DeleteIndexArray {
    public static void main(String[] args) {
        int[] numbers= {1,2,3,4,5};//defining array
        int indexDelete = 4;//index to delete
        int[] newNumbers= new int[numbers.length-1];// defining new array index-1
        int newIndex=0;//for new index
        System.out.println("Before deleting index");
        for(int index=0;index<5;index++){
            System.out.println(numbers[index]);
           if(index!=indexDelete){ //3!=0,3!=1,3!=2,3!=4
               newNumbers[newIndex++] = numbers[index]; //newNumber[0,1,2,3]  = numbers[0,1,2,4]
           }

        }

        System.out.println("After deleting index");
        for ( int newNumber: newNumbers) {

            System.out.println(newNumber);

        }

    }
}
