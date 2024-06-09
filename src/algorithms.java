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

    }
}
