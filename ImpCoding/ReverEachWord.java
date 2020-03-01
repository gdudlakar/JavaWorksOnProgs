package ImpCoding;

public class ReverEachWord {
    public static void main(String[] args) {
        String str = "I am preparing for OCPJP";
        String words[] = str.split(" ");
        String capitalizeWord = "";
        for (String w : words)
        {
            StringBuilder sb=new StringBuilder(w); 
            sb.reverse();
            capitalizeWord+=sb.toString()+ " ";
        }
        System.out.println(capitalizeWord);
    }
}