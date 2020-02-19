class javaStringRec {
    static void recur(String str, int n) {
        if (n == 0)
            return;
        System.out.print(str.charAt(n-1));
        recur(str, n - 1);
    }

    public static void main(String arg[]) {
        String str = "life";
        System.out.println("here begin recurtin");
        recur(str, str.length());
        String ab = "Welcome to cheg";
        String a = new String(ab);
        if(ab == a)
            System.out.println((ab==a)+" "+a.equals(a));
        else
         System.out.println((ab==a)+" "+a.equals(a));

    }
}