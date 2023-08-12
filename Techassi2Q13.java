public class Techassi2Q13 {
        // Recursive approach for adding stars using stack building     
        public static String addStarsStackBuilding(String str, int index) {         
            if (index >= str.length() - 1) {             
                return str; 
            } 
            StringBuilder sb = new StringBuilder(str);         
            if (sb.charAt(index) == sb.charAt(index + 1)) {             
                sb.insert(index + 1, '*'); 
            }          
            return addStarsStackBuilding(sb.toString(), index + 1);     } 
        // Recursive approach for adding stars using stack falling     
        public static String addStarsStackFalling(String str, int index) {         
            if (index >= str.length() - 1) {             
                return str; 
            }          
            if (str.charAt(index) == str.charAt(index + 1)) { 
                str = str.substring(0, index + 1) + '*' + str.substring(index + 1); 
            }          
            return addStarsStackFalling(str, index + 1);     }  
        public static void main(String[] args) { 
            String str = "aabbcc"; 
             
            String result = addStarsStackBuilding(str, 0); 
            System.out.println("String after adding stars (Stack Building): "  + result);          
            result = addStarsStackFalling(str, 0); 
            System.out.println("String after adding stars (Stack Falling): " + result);     } } 
 
     
    