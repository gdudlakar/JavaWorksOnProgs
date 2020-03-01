public class GCD {

    public static void main(String[] args) {
        int []a = {3,12,15};
        int re = 0;
        for( int c : a)
        {
            re = hcf(c,re);
        }
        System.out.printf("G.C.D of %d",re);
                    
    }

    public static int hcf(int n1, int n2)
    {
        if (n2 != 0)
            return hcf(n2, n1 % n2);
        else
            return n1;
    }
}