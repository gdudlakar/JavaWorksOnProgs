import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

class NonRepating {
    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        String ab = sp.nextLine();
        // char[] b = a.toCharArray();
        // for(int i = 0; i < b.length;i++)
        // {
        // int cout = 0;
        // for(int j = 0; j < b.length;j++)
        // {
        // if(b[i] == b[j])
        // {
        // cout++;
        // }
        // }
        // if(cout == 1)
        // {
        // System.out.println("this is non repeating char " + b[i]);
        // break;
        // }
        // }

        Map<Character, Integer> n = new HashMap<>();
        for (char a : ab.toCharArray()) {
            if (n.containsKey(a)) {
                n.put(a, n.get(a) + 1);

            } else
                n.put(a, 1);
        }

        Set<Character> m = n.keySet();

            for(Character e : m)
            {
                System.out.println(e +" " + n.get(e));
            }   
            sp.close(); 
    }
}