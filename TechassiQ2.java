import java.util.*;
public class TechassiQ2 {
    static void up(String word,int length){

        if (word==null||length ==0)
          return;
        char character = word.charAt(length-1); 
         int ascii = (int) character;
        if (ascii >= 97 && ascii <= 122) {
        character = (char)(ascii-32);
        }
        up(word,length-1);
        System.out.print(character);        
  
    }

    public static void main(String[] args) {
        String[] arr={"Mountains","Lakes","Hello","Laptop","Computer"};
        for (int i = 0; i < arr.length; i++) {
            up(arr[i],arr[i].length());
            System.out.println("");
        }

    }  
   
}
