package Lambda_Expressions;

import java.util.function.Function;

public class Function_Interface_1 {
    public static void main(String[] args) {
        Function<Integer,Integer> square=number->number*number;
        System.out.println(square.apply(5));
    }
}
