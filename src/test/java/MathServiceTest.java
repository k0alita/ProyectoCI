import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.MathService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathServiceTest {


    private MathService mathService;

    @BeforeEach
    void setUp() {
        mathService = new MathService();
    }

    @Test
    public void testSuma() {
        int a = 5;
        int b = 4;
        int result = this.mathService.sumar(a, b);
        assertEquals(result, 9);
    }

    @Test
    public void testResta(){
        int a = 5;
        int b = 4;
        int result = this.mathService.restar(a, b);
        assertEquals(result, 1);
    }

    public void testMultiplicacion(){
        int a = 5;
        int b = 5;
        int result = this.mathService.restar(a, b);
        assertEquals(result, 25);
    }
}
