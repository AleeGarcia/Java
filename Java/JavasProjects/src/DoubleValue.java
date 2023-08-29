public class DoubleValue {

  public static int num = 0;

  public static int getNumber() {

    if (num == 0) {
      num = 1;
      return num;
    } else {
      num *= 2;
      return num;
    }
  }
}
