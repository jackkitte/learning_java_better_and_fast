interface ChairMan {
  String name = "ChairMan";

  public void buildHarmonyCommunity(String method);
}

class Governer implements ChairMan {
  private String name;

  public Governer(String name) {
    this.name = name;
  }

  public void buildHarmonyCommunity(String method) {
    System.out.println(name + "build harmony community by" + method);
  }

  public String getName() {
    return this.name;
  }
}

public class TestInterface {
  public static void main(String[] args) {
    System.out.println(ChairMan.name);

    System.out.println("Start conference...");
    Governer g1 = new Governer("Governer");
    g1.buildHarmonyCommunity("Education");
  }
}