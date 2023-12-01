import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class ServiceTest {

    Service service;

    @BeforeEach
    void setUp() {
        // Перед каждым тестом создаем новый экземпляр класса Service
        service = new Service();
    }

    @AfterEach
    void tearDown() {
        // После каждого теста обнуляем экземпляр Service
        service = null;
    }

    @Test
    @DisplayName("Проверка, что первое среднее значение больше второго")
    void compareAveragesFirstBigger() {
        // Проверяем, что при вызове compareAverage с первым аргументом больше второго возвращается значение "Первый список имеет большее среднее значение"
        assertEquals("Первый список имеет большее среднее значение", service.compareAverages(1.5f, 1f));

    }

    @Test
    @DisplayName("Проверка, что второе среднее значение больше первого")
    void compareAveragesSecondBigger() {
        // Проверяем, что при вызове compareAverage с первым аргументом меньше второго возвращается значение "Второй список имеет большее среднее значение"
        assertEquals("Второй список имеет большее среднее значение", service.compareAverages(1f, 1.5f));

    }

    @Test
    @DisplayName("Проверка, что средние значения равны")
    void compareAveragesEquals() {
        // Проверяем, что при вызове compareAverage с первым аргументом равном второму возвращается значение "Средние значения равны"
        assertEquals("Средние значения равны", service.compareAverages(1f,1f));
    }

}