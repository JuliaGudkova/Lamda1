package lamda.lesson;

import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> {
      if(y!=0) {return x/y;}
        else
          try {
            throw new Exception() {};
            } catch (Exception e) {
              System.out.println("На ноль делить нельзя");;
            }
        return y;
    };


    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    Predicate<Integer> isPositive = x -> x > 0;
    Predicate<Integer> isnull = y -> y != 0;
    Consumer<Integer> println = System.out::println;

}

