import Calculator.Calculator;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

//import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    private Calculator calculator;

    @BeforeAll
    static void beforeAll() {
// Здесь могут быть глобальные операции инициализации
    }

    @AfterAll
    static void afterAll() {
// Здесь могут быть глобальные операции завершения
    }

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }

    @Test
    @DisplayName("Проверка суммирования")
    void testAdd() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    @DisplayName("Проверка вычитания")
    void testSubtract() {
        assertEquals(1, calculator.subtract(3, 2));
    }

    @Test
    @DisplayName("Проверка умножения")
    void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    @DisplayName("Проверка деления")
    void testDivide() {
        assertEquals(2.0, calculator.divide(4, 2));
    }

    @Test
    @DisplayName("Проверка деления на ноль")
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));
    }

    @Test
    @Disabled("Этот тест отключен")
    void disabledTest() {
        fail("Не будет выполнен");
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3})
    @DisplayName("Параметризованный тест для умножения на 2")
    void testMultiplyWithParameters(int arg) {
        assertEquals(arg * 2, calculator.multiply(arg, 2));
    }

    @Test
    @DisplayName("Проверка отрицательной суммы при вычислении скидки")
    void testSumByMinus(){
        assertThrows(ArithmeticException.class, () -> calculator.calculateDiscount(-100,10));
    }

    @Test
    @DisplayName("Проверка отрицательного процента при вычислении скидки")
    void testPercentByMinus(){
        assertThrows(ArithmeticException.class, () -> calculator.calculateDiscount(100,-10));
    }
}