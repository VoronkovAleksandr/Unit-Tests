import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkListTest {
    WorkList workList;

    @BeforeEach
    void setUp() {
        workList = new WorkList();
    }

    @AfterEach
    void tearDown() {
        workList = null;
    }

    @Test
    @DisplayName("Проверяем, что список заполняется")
    void fillArrayList() {
        // Вызываем метод заполнения списка
        workList.fillArrayList(10, 0, 10);
        //Проверяем, что список не пустой
        assertNotNull(workList.getArrayList());
    }

    @Test
    @DisplayName("Проверяем количество элементов списка")
    void arrayListSize() {
        //Вызываем метод заполнения списка с длинной 10
        workList.fillArrayList(10, 0, 10);
        //Проверяем, что длинна созданного списка 10
        assertEquals(10, workList.getArrayList().size());
    }

    @Test
    @DisplayName("Проверяем минимальный диапазон списка")
    void arrayListMinValue() {
        //Вызываем метод заполнения списка с длинной 10
        workList.fillArrayList(10, 0, 10);
        //Ищем минимальное значение в списке
        int min = Integer.MAX_VALUE;
        for (Integer i : workList.getArrayList()) {
            if (min > i) {
                min = i;
            }
        }
        //Проверяем, что минимальное значение больше 0
        assertEquals(true, min>=0);
    }

    @Test
    @DisplayName("Проверяем максимальный диапазон списка")
    void arrayListMaxValue() {
        //Вызываем метод заполнения списка значениями от 0 до 10
        workList.fillArrayList(10, 0, 10);
        //Ищем максимальное значение в списке
        int max = Integer.MIN_VALUE;
        for (Integer i : workList.getArrayList()) {
            if (max < i) {
                max = i;
            }
        }
        //Проверяем, что максимальное значение меньше 10
        assertEquals(true, max<10);
    }


    @Test
    void calculateTheAverage() {
        workList.fillArrayList(10, 0, 10);
        float sum = 0;
        for (Integer i: workList.getArrayList()) {
            sum +=i;
        }
        assertEquals(sum/10, workList.calculateTheAverage());
    }
}