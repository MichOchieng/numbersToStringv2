/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package michOchiengLab1;

/**
 *
 * @author Mich Ochieng
 * CPSC 101 JAN 2019
 */
public class NumberToStringTester { 
    
     
//     Test answers
     private static final String ans  = "twenty one"; 
     private static final String ans1 = "nineteen";
     private static final String ans2 = "one hundred  one";
     private static final String ans3 = "nine hundred ninety nine";         
     private static final String ans6 = "nine";
     private static final String ans7 = "";     
//     Tests
     private static final String test  = numberToString.tensTester(21);
     private static final String test1 = numberToString.tensTester(19);
     private static final String test2 = numberToString.hundredsTester(101);
     private static final String test3 = numberToString.hundredsTester(999);     
     private static final String test6 = numberToString.singles(9);
     private static final String test7 = numberToString.singles(0);
     
//     13901001 312000789 101101
    public static void main(String[] args) {
        // TODO code application logic here 
        checker();        
    } 
    public static void checker(){
        if(isCorrect()){
            System.out.println("Test result: Passed");
        }
        else{
            System.out.println("Test result: Failed");
        }
    }   
    
    public static boolean isCorrect(){ 
       if(tensTest()){
           if(tensTest2()){
               if(hundredTest()){
                   if(hundredTest2()){                                                             
                      if(singlesTest()){
                          if(singlesTest2()){
                              return true;
                          }else
                           return false;
                      }else
                           return false;                       
                   }else
                     return false;                   
               }else
                 return false;
           }else
             return false;
       }else
         return false;      
    }
    
    public static boolean tensTest(){
      if(ans1.equals(test1)){         
         return true;
     }
      else{        
         System.out.println("Error in tensTest");
         return false; 
       }
    }
    public static boolean tensTest2(){
      if(ans.equals(test)){         
         return true;
     }
      else{         
         System.out.println("Error in tensTest2");
         return false; 
       }
    }    
    public static boolean hundredTest(){
      if(ans2.equals(test2)){         
         return true;
     }
      else{         
         System.out.println("Error in hundredTest");
         return false; 
       }  
    }
    public static boolean hundredTest2(){
       if(ans3.equals(test3)){         
         return true;
     }
      else{         
         System.out.println("Error in hundredTest2");
         return false; 
       } 
    }       
    public static boolean singlesTest(){
      if(ans6.equals(test6)){         
         return true;
     }
      else{         
         System.out.println("Error in singlesTest");
         return false; 
       }  
    }
    public static boolean singlesTest2(){
      if(ans7.equals(test7)){         
         return true;
     }
      else{         
         System.out.println("Error in singlesTest2");
         return false; 
       }  
    }
    
}
