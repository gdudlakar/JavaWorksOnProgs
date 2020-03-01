package ImpCoding;


public class Permut {
   private String swap(String str, int i , int j)
    {
        char temp;
        char[] chara = str.toCharArray();
        temp = chara[i];
        chara[i] = chara[j];
        chara[j] = temp;
        return String.valueOf(chara);
    }
    private void calc(String str , int left, int right)
    {
        if(left == right)
        { System.out.println(str);
        }
        else
        {
            for(int i = left; i <= right; i++)
            {
                String sw = swap(str, left, i);
                calc(sw, left+1, right);
            }
        }
    }
   
    public static void main(String[] args) 
    {
        String s = "ABC";
        int n = s.length();
        Permut v = new Permut();
        v.calc(s, 0, n-1);
    }
}