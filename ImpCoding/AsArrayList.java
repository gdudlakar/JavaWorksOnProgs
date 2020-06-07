import java.util.ArrayList;
import java.util.List;

class AsArrayList{
public static void main(String[] args) {
    List<Integer> b = new ArrayList<>();
    for(int i = 0; i < 10; i++)
    {
        b.add(i*10);
    }
    Object[] c = b.toArray();
    for(Object a : c)
    {
        System.out.println(a);
    }
}
}