import java.util.List;

class ArrayConvert
{
    public static void main(final String... arg) {
        final List<Integer> n = new Arraylist<Integer>();
       for(int i = 0; i < 5 ; i++ ) 
            n.add(i+2);
       int[] v = new int[n.size()];
       v = n.toArray(new int[n.size()]); 
    }
}