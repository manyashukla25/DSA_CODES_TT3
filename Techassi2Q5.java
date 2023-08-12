public class Techassi2Q5 {
        // Recursive approach for checking prime number using stack building     
        public static boolean checkPrimeStackBuilding(int number, int divisor) 
    {         if (number <=1) {             
        return false; 
            }         
    if (divisor == 1) {            
         return true; 
            } 
            if (number % divisor == 0) {             
                return false; 
            } 
            return checkPrimeStackBuilding(number, divisor -1);     } 
        // Recursive approach for checking prime number using stack falling     
        public static boolean checkPrimeStackFalling(int number) {        
             int divisor = (int) Math.sqrt(number); 
            return checkPrimeStackBuilding(number, divisor);     }      
            public static void main(String[] args) {        
                 int number = 17; 
            boolean isPrime = checkPrimeStackBuilding(number, (int) Math.sqrt(number));         
            if (isPrime) { 
                System.out.println(number + " is a prime number."); 
            } else { 
                System.out.println(number + " is not a prime number."); 
            }          
            isPrime = checkPrimeStackFalling(number);        
             if (isPrime) { 
                System.out.println(number + " is a prime number."); 
            } else { 
                System.out.println(number + " is not a prime number.");         } 
        } 
    } 
    

