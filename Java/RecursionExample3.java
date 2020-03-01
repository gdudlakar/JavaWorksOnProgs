public class RecursionExample3 {
  public static String Rev(String str) {
    if(str.length()<2)
    {
    return str;
    }
    return Rev(str.substring(1)) +"  "+ str.charAt(0);
    
  }

  public static void main(final String[] args) {
    String str = "guru";
    
   String a = Rev(str);
   System.out.println(a);
  }
}