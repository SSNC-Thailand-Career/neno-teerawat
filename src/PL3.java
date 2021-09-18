
public class PL3 {

  public static int findMul(int a) {
    int mul = 1;
    for (int i = 0; i < a ; i++) {
      mul *= i;
    }

    return mul;
  }

  public static void main(String[] args) {

    System.out.println(findMul(6));
  }
}
