package FizzBuzz;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FizzBuzz {
    
    public String execute(int[] numbers) {
        return Arrays.stream(numbers).mapToObj(this::processNumber).collect(Collectors.joining(", "));
    }

    public String processNumber(int num) {
        if(num % 3 == 0 && num % 5 == 0) {
            return "Fizz Buzz";
        } else if (num % 5 == 0) {
            return "Buzz";
        } else if (num % 3 == 0) {
            return "Fizz";
        } else {
            return String.valueOf(num);
        }
    }
    
}