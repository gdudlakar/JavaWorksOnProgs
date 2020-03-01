package ImpCoding;

class Occcrance
{
    public static void main(String[] args) {
        String B= "aaA";
        String c = B.toLowerCase();
        System.out.println(c);
        int count = 0;
        for(char a :c.toCharArray())
        {
            if(a == 'a')
            {
                    count++;
            }
                
        }
        System.out.println(count);

    }
}