public class TestStringReplace {
  public static void main(String[] args) {
    String article = "The dog run under the gardenland";
    System.out.println(article);

    article = article.replace("dog", "horses");
    System.out.println(article);

    article = article.replaceFirst("gardenland", "grassland");
    System.out.println(article);
  }
}