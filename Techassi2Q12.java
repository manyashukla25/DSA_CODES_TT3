public class Techassi2Q12 {
        // Recursive approach for replacing adjacent elements using stack building 
        public static String replaceAdjacentStackBuilding(String str, int index) { 
            if (index >= str.length() - 1) {            
                 return str; 
            } 
            StringBuilder sb = new StringBuilder(str);        
             if (sb.charAt(index) == sb.charAt(index + 1)) {           
                  sb.setCharAt(index + 1, '#'); 
            }                  return replaceAdjacentStackBuilding(sb.toString(), index + 1);     }      
        // Recursive approach for replacing adjacent elements using stack falling 
        public static String replaceAdjacentStackFalling(String str, int index) {        
             if (index >= str.length() - 1) {            
                 return str; 
            }          
            if (str.charAt(index) == str.charAt(index + 1)) { 
                str = str.substring(0, index + 1) + '#' + str.substring(index  + 2); 
            }          
            return replaceAdjacentStackFalling(str, index + 1);     }  
        public static void main(String[] args) { 
            String str = "aabbcc"; 
             
            replaceAdjacentStackBuilding(str, 0); 
            System.out.println("String after replacing adjacent elements (Stack Building): " + str); 
             
            String result = replaceAdjacentStackFalling(str, 0); 
            System.out.println("String after replacing adjacent elements (Stack Falling): " + result); 
        } } 
    
    