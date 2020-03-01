package ImpCoding;

import java.util.Scanner;

class Palindrome
{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("enter");
        String b = n .nextLine();
        System.out.println("palindr");
        StringBuffer c = new StringBuffer(b);
        c.reverse();
        String x = c.toString();
        if(x.equals(b))
        {
            System.out.println(" panli");
        }
        else
        System.out.println("not");
        n.close();

    }
}