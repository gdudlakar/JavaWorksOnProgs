package recuration;

class SrtingRecution {
    private static void recur(String str, int n) 
    {
        if( n == 0) return;
        System.out.println(str.charAt(n));
        recur(str, n-1);
    }

    public static void main(String... strings) {
        String str = "Life is Zyand";
        System.out.println("here begin recurtin");
        recur(str, str.length()-1);
    }
}