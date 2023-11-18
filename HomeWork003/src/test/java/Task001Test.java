import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Task001Test {

    @Test
    @DisplayName("Проверка при делении на четное число")
    void evenOddNumberIsTrue() {
        // Ожидаем true при передаче в метод четного числа
        assertEquals(true, Task001.evenOddNumber(2));
    }

    @Test
    @DisplayName("Проверка при делении на нечетное число")
    void evenOddNumberIsFalse() {
        // Ожидаем false при передаче в метод нечетного числа
        assertEquals(false, Task001.evenOddNumber(5));
    }

}