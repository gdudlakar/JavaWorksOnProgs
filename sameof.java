
class Gcd
{
    static int gcd(int m, int n)
    {
        if(n!=0) return gcd(n,m%n);
        else
        return n; 
    }
     public static void main(String[] args) {
        int c[] = {12,3,6};
        int result = 0;
        for(int i =0; i < c.length;i++)
        {
            result = gcd(c[i], result);
        }
        System.out.println(result + " found the result");
        
    }
}