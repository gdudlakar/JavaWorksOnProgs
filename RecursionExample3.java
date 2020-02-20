public class RecursionExample3 {
  static int factorial(String str, int a) {    
    if (a == 0)
      return 1;
    else
      System.out.print(" "+str.charAt(a-1));
     factorial(str,a-1);
    System.out.println("below "+str.charAt(a-1));
    return 0;
  }

  public static void main(final String[] args) {
    String str = "guru";
    int a = str.length();
    factorial(str,a);
  }
}