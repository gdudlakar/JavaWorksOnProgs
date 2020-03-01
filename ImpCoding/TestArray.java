package ImpCoding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class TestArray{
    public static void main(final String[] args) throws Exception {
        
     List<Integer> n = new ArrayList<>();
        for(int i = 0; i < 8;i++)
        {
            n.add(i*3);
        }
        Comparator<Integer> v = (o1,o2) ->{
                if(o1%10 < o2%10) return 1;
                return -1;
        };
        Collections.sort(n,v);
        for(int a:n)
        {
            System.out.println(a);
        }
        
    }
}