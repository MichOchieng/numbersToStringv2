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
     private static final String ans4 = "one thousand   one";
     private static final String ans5 = "one hundred  one thousand one hundred  one";
     private static final String ans6 = "thirteen million nine hundred  one thousand    one";
     private static final String ans7 = "three hundred twelve  million   seven hundred  eighty nine";
     private static final String ans8 = "nine";
     private static final String ans9 = "";
//     Tests
     private static final String test  = numberToString.tensTester(21);
     private static final String test1 = numberToString.tensTester(19);
     private static final String test2 = numberToString.hundredsTester(101);
     private static final String test3 = numberToString.hundredsTester(999);
     private static final String test4 = numberToString.thousandsTester(1001);
     private static final String test5 = numberToString.thousandsTester(101101);
     private static final String test6 = numberToString.millionsTester(13901001);
     private static final String test7 = numberToString.millionsTester(312000789);
     private static final String test8 = numberToString.singles(9);
     private static final String test9 = numberToString.singles(0);
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
                       if(thousandTest()){
                           if(thousandTest2()){
                               if(millionTest()){
                                   if(millionTest2()){
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
    public static boolean thousandTest(){
      if(ans4.equals(test4)){         
         return true;
     }
      else{         
         System.out.println("Error in thousandTest");
         return false; 
       }  
    }
    public static boolean thousandTest2(){
      if(ans5.equals(test5)){         
         return true;
     }
      else{         
         System.out.println("Error in thousandTest2");
          System.out.println(test5);
         return false; 
       }  
    }
    public static boolean millionTest(){
      if(ans6.equals(test6)){         
         return true;
     }
      else{         
         System.out.println("Error in millionTest");
         return false; 
       }  
    }
    public static boolean millionTest2(){
      if(ans7.equals(test7)){         
         return true;
     }
      else{         
         System.out.println("Error in millionTest2");
         return false; 
       }  
    }
    public static boolean singlesTest(){
      if(ans8.equals(test8)){         
         return true;
     }
      else{         
         System.out.println("Error in singlesTest");
         return false; 
       }  
    }
    public static boolean singlesTest2(){
      if(ans9.equals(test9)){         
         return true;
     }
      else{         
         System.out.println("Error in singlesTest2");
         return false; 
       }  
    }
    
}
