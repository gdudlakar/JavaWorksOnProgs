package ImpCoding;

public class Test {
    public static void main(String[] args) {
        String str = "I am preparing for OCPJP";
        String words[] = str.split(" ");
        String capitalizeWord = "";
        for (String w : words)
        {
        String first =  w.substring(0,1);
        String afterfirst = w.substring(1);
        capitalizeWord += first.toUpperCase() + afterfirst + " ";
        }
        System.out.println(capitalizeWord);
    }
}