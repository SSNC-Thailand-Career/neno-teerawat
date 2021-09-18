public class PL1 {

  public static int findMax(int[] a) {
    int max = 0;
    for (int b : a) {
      if(max < b) {
        max = b;
      }
    }
    return max;
  }

  public static void main(String[] args) {
    int[] a = {2, 4, 8, 5};
    System.out.println(findMax(a));
  }
}
