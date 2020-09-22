import java.util.*;

class House {
    private String owner;
    private double price;

    public House(String owner, double price) {
        this.owner = owner;
        this.price = price;
    }

    public String getOwner() {
        return owner;
    }

    public double getPrice() {
        return price;
    }
}

class Company {
    private List<House> houseList;

    public Company() {
        this.houseList = new ArrayList<House>();
    }

    public void add(House h) {
        houseList.add(h);
    }

    public List<House> getHouseList() {
        return houseList;
    }
}

public class TestHouse {
    public static void main(String[] args) {
        Company company = new Company();
        company.add(new House("Faith", 1500));
        company.add(new House("Danie", 3000));
        company.add(new House("Mathew", 4000));

        List<House> houseList = company.getHouseList();
        for (int i = 0; i < houseList.size(); i++) {
            House h = houseList.get(i);
            System.out.println(h.getOwner() + "," + h.getPrice());
        }

        Iterator<House> iter = company.getHouseList().iterator();
        while (iter.hasNext()) {
            House h = iter.next();
            System.out.println(h.getOwner() + "," + h.getPrice());
        }
    }
}
