import java.util.LinkedList;

class Station {
    private String name;
    private LinkedList carList;

    public Station(String name) {
        this.name = name;
        this.carList = new LinkedList();
    }

    public void addCar(Car car) {
        carList.add(car);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LinkedList getCarList() {
        return carList;
    }

    public void setCarList(LinkedList carList) {
        this.carList = carList;
    }
}

class Car {
    private String name;
    private double volume;

    public Car(String name, double volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
public class TestLinkedList {
    public static void main(String[] args) {
        Station station = new Station("Gas Station");
        station.addCar(new Car("Car", 100));
        station.addCar(new Car("Benz Car", 200));
        station.addCar(new Car("Bus", 300));

        LinkedList carList = station.getCarList();
        System.out.println(station.getName() + " refueling car:");

        for (int i = 0; i < carList.size(); i++) {
            Car car = (Car) carList.get(i);
            System.out.println(car.getName() + "," + car.getVolume());
        }
    }
}
