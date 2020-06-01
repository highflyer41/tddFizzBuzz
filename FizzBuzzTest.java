package FizzBuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {
    
    @Test
    public void shouldExecute() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("1", fb.execute(new int[] {1}));
        assertEquals("1, Fizz, Buzz, Fizz Buzz", fb.execute(new int[] {1, 3, 5, 15}));
    }

    @Test
    public void shouldProcessInput() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("1", fb.processNumber(1));
        assertEquals("2", fb.processNumber(2));
        assertEquals("Fizz", fb.processNumber(3));
        assertEquals("Buzz", fb.processNumber(5));
        assertEquals("Fizz Buzz", fb.processNumber(15));
    }
}