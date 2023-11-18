import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

 public class Task002Test {

    @Test
    @DisplayName("Проверка числом входящим в диапазон")
    void numberInInterval() {
        // Ожидаем true при передаче в метод числа из диапазона
        assertEquals(true, Task002.numberInInterval(50));
    }

    @Test
    @DisplayName("Проверка числом больше диапазона")
    void numberOutOfIntervalPlus(){
        // Ожидаем false при передаче в метод числа больше диапазона
        assertEquals(false, Task002.numberInInterval(101));
    }
    @Test
    @DisplayName("Проверка числом меньше диапазона")
    void numberOutOfIntervalMinus(){
        // Ожидаем false при передаче в метод числа меньше диапазона
        assertEquals(false, Task002.numberInInterval(24));
    }
}