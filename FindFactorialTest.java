import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindFactorialTest {
    @Test
    void shouldReturnOneIfNumberIsZero()
    {
        FindFactorial findFactorial = new FindFactorial(1);
        int factorial = findFactorial.find();
        assertEquals(factorial,1);
    }

    @Test
    void shouldReturnFactorialOfAGivenNumber()
    {
        FindFactorial findFactorial = new FindFactorial(5);
        int factorial = findFactorial.find();
        assertEquals(factorial,120);
    }
}
