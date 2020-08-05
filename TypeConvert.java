public class TypeConvert {

  public static void main(String[] args) {
    byte varByte = 1;
    int varInt = 2;

    varInt = varByte;
    System.out.println(varInt);

    byte varByte2 = 1;
    int varInt2 = 2;

    varByte2 = (byte) varInt2;
    System.out.println(varByte2);

    char f1 = 'a';
    int f2 = 98;

    f1 = (char) f2;
    System.out.println(f1);
  }
}