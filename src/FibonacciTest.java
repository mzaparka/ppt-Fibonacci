
import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    Fibonacci fib = new Fibonacci();

    @org.junit.jupiter.api.Test
    void calcRek() {
        assertEquals(55, fib.CalcRek(10));
        assertEquals(89, fib.CalcRek(11));
        assertEquals(1, fib.CalcRek(1));
        assertEquals(1, fib.CalcRek(2));
        assertEquals(0, fib.CalcRek(0));
    }

    @org.junit.jupiter.api.Test
    void calcRekTable() {
        assertEquals(55, fib.CalcRekTable(10));
        assertEquals(89, fib.CalcRekTable(11));
        assertEquals(1, fib.CalcRekTable(1));
        assertEquals(1, fib.CalcRekTable(2));
        assertEquals(0, fib.CalcRekTable(0));
    }

    @org.junit.jupiter.api.Test
    void calcNerek() {
        assertEquals(55, fib.CalcNerek(10));
        assertEquals(89, fib.CalcRek(11));
        assertEquals(1, fib.CalcNerek(1));
        assertEquals(1, fib.CalcNerek(2));
        assertEquals(0, fib.CalcNerek(0));
    }
}
