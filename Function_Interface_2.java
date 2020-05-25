package Lambda_Expressions;

import java.util.function.Function;

public class Function_Interface_2 {
    public static void main(String[] args) {
        Function<String,Integer> length=strin->strin.length();
        System.out.println(length.apply("ABC FOR TECHNOLOGY"));
    }
}
