import java.util.*;

class Station {
    private String name;

    public Station(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class TestIterator {
    public static void main(String[] args) {
        List stationList = new ArrayList();
        stationList.add(new Station("Berkeley University"));
        stationList.add(new Station("Market Street"));
        stationList.add(new Station("Polo Alto"));
        stationList.add(new Station("Cuptino"));

        System.out.println("\nOutput as an list --------------------");

        for (int i = 0; i < stationList.size(); i++) {
            Station station = (Station) stationList.get(i);
            System.out.print(station.getName() + "->");
        }

        System.out.println("\nOutput as an Iterator --------------------");
        Iterator iter = stationList.iterator();
        while (iter.hasNext()) {
            Station station = (Station) iter.next();
            System.out.print(station.getName() + "->");
        }
    }
}
