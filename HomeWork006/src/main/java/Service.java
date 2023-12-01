
import java.util.List;

public class Service {
    private final String FIRST_BIGGER = "Первый список имеет большее среднее значение";
    private final String SECOND_BIGGER = "Второй список имеет большее среднее значение";
    private final String EQUALS = "Средние значения равны";

    public String compareAverages(float firstAverage, float secondAverage) {
        if (firstAverage > secondAverage){
            return FIRST_BIGGER;
        } else if (firstAverage < secondAverage) {
            return SECOND_BIGGER;
        } else {
            return EQUALS;
        }
    }
}
