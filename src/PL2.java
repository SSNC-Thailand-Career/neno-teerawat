import java.util.Arrays;

public class PL2 {

  public static int[] findMax(int[] a) {
    int first = 0;
    int two = first;
    for (int b : a) {
      if(two < b) {
        first = two;
        two = b;
      }
    }
    int[] b = {first, two};
    return b;
  }

  public static void main(String[] args) {
    int[] a = {2, 4, 8, 5};
    System.out.println(Arrays.toString(findMax(a)));
  }
}
