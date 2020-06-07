import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
public class ArrayListTest {
    public static void main(String[] args) {
        
        Random r = new Random();
        Set<Integer> k = new HashSet<>();
        for(int i = 0; i < 100; i++)
        {
            k.add(r.nextInt(101));
        }
        k.forEach(System.out::println);
       }
    
}