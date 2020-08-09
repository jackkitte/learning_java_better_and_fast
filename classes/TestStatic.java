class User {
  public static int count;

  public static int getCount() {
    return count;
  }
}

public class TestStatic {
  public static void main(String[] args) {
    User user1 = new User();
    user1.count++;

    User user2 = new User();
    user2.count++;

    User user3 = new User();
    user3.count++;

    System.out.println("User Count : " + User.getCount());
  }
}