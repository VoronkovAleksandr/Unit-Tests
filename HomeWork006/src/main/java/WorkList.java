import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WorkList {
    private ArrayList<Integer> arrayList;

    WorkList() {
        arrayList = new ArrayList<>();
    }

    public void fillArrayList(Integer size, Integer minValue, Integer maxValue) {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            int r = random.nextInt(maxValue);
            arrayList.add(i, random.nextInt(maxValue) );
        }
    }

    public float calculateTheAverage() {
        Integer sumValue = 0;
        for (Integer integer : arrayList) {
            sumValue += integer;
        }
        return (float) sumValue / arrayList.size();
    }


    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(arrayList.toString());
        sb.append("\n");
        sb.append("Среднее значение:  ");
        sb.append(calculateTheAverage());
        return sb.toString();
    }

}
