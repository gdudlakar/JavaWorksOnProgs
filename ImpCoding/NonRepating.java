package ImpCoding;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class NonRepating
{
    public static void main(String[] args) {
        String ab = "guru";
        // char[] b = a.toCharArray();
        // for(int i = 0; i < b.length;i++)
        // {
        //     int cout = 0;
        //     for(int j = 0; j < b.length;j++)
        //     {
        //         if(b[i] == b[j])
        //         {
        //             cout++;
        //         }
        //     }
        //     if(cout == 1)
        //     {
        //         System.out.println("this is non repeating char  " + b[i]);
        //         break;
        //     }
        // }

        Map<Character,Integer> n = new HashMap<>();
        for(char a : ab.toCharArray())
        {
            if(n.containsKey(a))
            {
                n.put(a, n.get(a)+1);
                
            }
            else
            n.put(a,1);
        }
        
       Set<Map.Entry<Character,Integer>> m = n.entrySet();

            for(Map.Entry<Character,Integer> e : m)
            {
                System.out.println(e.getKey() +" " + e.getValue());
            }     
    }
}