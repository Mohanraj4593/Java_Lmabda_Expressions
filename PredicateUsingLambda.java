package Lambda_Expressions;

import java.util.function.Predicate;



public class PredicateUsingLambda {
    public static void main(String[] args) {
        int arr[] = {10, 20, 4, 8, 6, 30, 80};




        // -----------------First Method--------------------------
        Predicate<Integer> divisibleby10 = dig -> dig % 10 == 0;
        System.out.println("Numbers divisible by 10 are");
        disp(divisibleby10, arr);

        // -----------------Second Method--------------------------
        Predicate<Integer> greaterThan10 = dig -> dig > 10;
        System.out.println("Numbers greater than 10 are");
        disp(greaterThan10, arr);

        // -----------------Third Method--------------------------
        Predicate<Integer> greateranddivisible = dig -> (dig > 10) && (dig % 10 == 0);
        System.out.println("Number gretaer than 10 and divisible by 10 are:");
        disp(greateranddivisible, arr);

        // -----------------Fourth Method--------------------------
        Predicate<Integer> notdivisibleby10 = dig -> dig % 10 == 0;
        System.out.println("Numbers not divisible by 10 are");
        disp(notdivisibleby10.negate(), arr);

    }


    public static void disp(Predicate<Integer> predicate, int[] arr) {
       for (int i=0;i<arr.length;i++){
            if (predicate.test(arr[i])) {

                System.out.println(arr[i]);

            }
        }
    }
}