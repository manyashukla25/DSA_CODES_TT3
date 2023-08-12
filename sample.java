import java.util.*;
 class vowels {
    public static void main(String args[]) {
    	System.out.println("Name = shashank rawat , SAP_ID = 1000014024"); 
    char x = args[0].charAt(0);
    String ans = (x=='a'||x=='A'||x=='e'||x=='E'||x=='i'||x=='I'||x=='o'||x=='O'||x=='u'||x=='U') ? "vowel" : "consonant";

          System.out.println(ans);
    }
}