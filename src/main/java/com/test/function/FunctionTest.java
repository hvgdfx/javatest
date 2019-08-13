package com.test.function;

import java.util.function.Function;

public class FunctionTest {

    public static void main(String[] args) {

        Function<String,String> function = (x) -> {System.out.print(x+": ");return "Function";};
        System.out.println(function.apply("hello world"));

    }


}
