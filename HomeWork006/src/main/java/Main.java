

public class Main {
    public static void main(String[] args) {
        WorkList firstList = new WorkList();
        WorkList secondList = new WorkList();
        Service service = new Service();

        firstList.fillArrayList(10,0,100);
        secondList.fillArrayList(10,0,100);

        System.out.println(firstList.toString());
        System.out.println(secondList.toString());

        System.out.println(service.compareAverages(firstList.calculateTheAverage(), secondList.calculateTheAverage()));
    }
}
