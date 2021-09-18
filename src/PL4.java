import java.util.Arrays;

public class PL4 {

  public static int[] sort(int[] a) {
    return Arrays.stream(a).sorted().toArray();
  }

  public static void main(String[] args) {
    int[] a = {2, 3, 8, 3, 4, 5, 6};
    System.out.println(Arrays.toString(sort(a)));
  }
}
