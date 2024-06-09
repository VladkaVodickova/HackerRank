import java.util.Scanner;

public class algorithms {
    public static void main(String[] args) {
        //Task 1
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        System.out.println(number1+number2);
        sc.close();
        //Task 2
        //addition of int from array
        /*public static int simpleArraySum(List<Integer> ar) {
            int result = 0;
            for (Integer item : ar) {
                result+= item;
            }
            return result;
        }*/
        //Task 3
        //comparing results and awarding points based on the result
        /*
            public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int resultForA = 0;
        int resultForB = 0;
        int counter = 0;
        for (Integer number : a){
            if (number > b.get(counter)){
                resultForA++;
            } else if (number< b.get(counter)){
                resultForB++;
            }
            counter++;
        }
        List <Integer> result = List.of(resultForA, resultForB);
        return result;
    }
         */
        //Task 4
        //addtiiong of long numbers
        /*
            public static long aVeryBigSum(List<Long> ar) {
        long result = 0;
        for (Long number : ar){
            result+=number;
        }
        return result;
    }
         */
        //Task 5
        //absolute difference between the sums of its diagonals
    /*
    public static int diagonalDifference(List<List<Integer>> arr) {
        int additionOfFirstDiagonal = 0;
        int additionOfSecondDiagonal = 0;
        int counter = 0;
        for (List<Integer> list : arr) {
            int number = list.get(counter);
            counter++;
            additionOfFirstDiagonal+=number;
        }
        if (counter >= 1){
            for (List<Integer> list : arr){
                counter--;
                int number = list.get(counter);
                additionOfSecondDiagonal+=number;
            }
        }
        int result = abs(additionOfFirstDiagonal-additionOfSecondDiagonal);
        return result;
    }
    */
        //Task 6
        //write a rations of positive, negative and zero with decimal value with 6 places
    /*
    public static void plusMinus(List<Integer> arr) {
        int counterOfNegative = 0;
        int counterOfPositive = 0;
        int counterOfZeroes= 0;
        for (Integer number: arr){
            if (number.intValue()< 0) {
                counterOfNegative++;
            } else if (number.intValue()>0){
                counterOfPositive++;
            } else {
                counterOfZeroes++;
            }
        }
        int arrayLength = (arr.size());
        double ratioOfPositives = (double) counterOfPositive/arrayLength;
        double ratioOfNegatives = (double) counterOfNegative/arrayLength;
        double ratioOfZeroes = (double) counterOfZeroes/arrayLength;
        System.out.println(ratioOfPositives);
        System.out.println(ratioOfNegatives);
        System.out.println(ratioOfZeroes);
    }
    */
        //Task 7
        //make sraircase from hashtags
    /*
    public static void staircase(int n) {
        for (int level = 0; level<n; level++){
            for (int i = n-2; i >= level ; i--){
                    System.out.print(" ");
            }
            for (int i = 0; i<= level; i++){
                System.out.print("#");
            }
            System.out.println();
         }
    }
}
    */
        //Task 8
        //choose 4 lowest and then 4 biggest int and make an addation of them separately
        /*

         */
    }
}
