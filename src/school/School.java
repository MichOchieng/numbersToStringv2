/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Mich Ochieng
 * CPSC 101 JAN 2019
 */
public class School {

    /**
     * @param args the command line arguments
     */
    private static final String baseTenString[] = {
        "", "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };
    private static final String tens[] ={
        "","","","","","","","","","","","eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };
    private static final String singles[] ={
        "","one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
    };

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Give me a whole number from 1 to (but not including) 1 billion.");
        Scanner sc = new Scanner(System.in);
        final int var = sc.nextInt();       
        
        decision(var);
    }    
    
    public static void numberToString(int x){
        sorter(x);
    }
    
    
    public static void decision(int x){
        if(x>=1 && x<1000000000){
            numberToString(x);
        }        
        else{
            System.out.println("Oops! Looks like you gave me a value out of the given range. Better luck next time  ¯\\_(ツ)_/¯.");
        }
    }
    
    
//    methods
    public static void sorter(int x){
        int length = length(x);
        switch(length){
            case 1: singles(x);                
                break;
            case 2: sorterCase2(x);                            
                break;    
            case 3: sorterCase3(x);                              
                break;    
            case 4: sorterCase4(x);                
                break;
            case 5: sorterCase5(x);                               
                break;
            default: System.out.println("It looks like something went very wrong. How did you manage to get here?");                
        }
    }
    
    public static int length(int x){
        if(x<10){
            return 1;
        }
        else if(x<100 && x>=10){
            return 2;
        }
        else if(x<1000 && x>99){
            return 3;
        }
        else if(x<1000000 && x>999){
            return 4;
        }
        else if(x<1000000000 && x>=1000000){
            return 5;
        }
        return 0;
    }  
    
//    Converts double digits to words
    public static void tens(int x){
        if(x>19){
            x/=10;
            System.out.println(baseTenString[x]);
         }
         else if(x==10){
             System.out.println("ten");
         }
         else{          
             System.out.println(tens[x]);
         }
    }  
    
    public static void singles(int x){
        x%=100;
        x%=10;
        System.out.println(singles[x]);
    }
    
//    Converts hundreds to words 
    public static void hundreds(int x){
        if(x<=19 && x>=10){
            System.out.println(tens[x]);
         }
         else if(x>999 && x<=9999){
             x%=1000;
             x/=100;
             System.out.println(singles[x]);
             System.out.println("hundred");
         }
         else{
             x/=100;        
             System.out.println(singles[x]);     
             System.out.println("hundred");
         }        
    } 
    
    public static void singlesH(int x){
        x%=100;
//    stops program from adding two at the end ex. 912 = nine hundred twelve two
        if(x>10){
          x%=10;  
        }        
        System.out.println(singles[x]);
    }
    
    public static void tenH(int x){
        x%=100;
        if(x<19 && x>10){
            System.out.println(tens[x]); 
         } 
         else{
            x/=10;
            System.out.println(baseTenString[x]);
        }
    }  
    
//    Converts thousands to words
    public static void thousands(int x){
       x/=1000;
       if(x<10){
           singlesTh(x); 
        }
        else if(x==10){
            System.out.println("ten");
        }
        else if(x>10 && x<100){
           thousandHandler1(x);
        }
        else if(x>99){
           thousandHandler2(x);
        }
        System.out.println("thousand");        
    }
    
    public static void singlesTh(int x){        
       x%=1000;
       x%=100;
//       stops program from printing last digit again ex. 15111 = fifteen thousand one hundred eleven one
       if(x<9 || x>19){
          x%=10;
          System.out.println(singles[x]); 
        }       
    }
    
    public static void tensTh(int x){
       x%=1000;
       x%=100;
       if(x<20 && x>10){
           System.out.println(tens[x]); 
        }
        else{
           x/=10;
            System.out.println(baseTenString[x]);
        }
    }
    
    public static void hundredTh(int x){
        x%=1000;
        x/=100;
        System.out.println(singles[x]);
        if(x>0){
          System.out.println("hundred");  
        }
        
    }
    
//    Converts millions to words
    public static void millions(int x){
       x/=1000000;
       if(x<10){
           singlesTh(x); 
        }
        else if(x==10){
            System.out.println("ten");
        }
        else if(x>10 && x<100){
           millionHandler1(x);
        }
        else if(x>99){
           millionHandler2(x);
        }
        System.out.println("million");
    }     
        
    public static void singlesMilion(int x){
       x%=1000000;
       x%=1000;
       x%=100;
//       stops program from printing last digit again ex. 15111 = fifteen thousand one hundred eleven one
       if(x<9 || x>19){
          x%=10;
          System.out.println(singles[x]); 
        }   
    } 
    
    public static void tensMilion(int x){
       x%=1000000;
       x%=1000;
       x%=100;
       if(x<20 && x>10){
           System.out.println(tens[x]); 
       }
       else{
          x/=10;
           System.out.println(baseTenString[x]);
       } 
    }
    
    public static void hundredsMilion(int x){
       x%=1000000;
       x%=1000;
       x/=100;
       System.out.println(singles[x]);
        if(x>0){
          System.out.println("hundred");  
        }
    }
    
    public static void thousandMilion(int x){
       x%=1000000;
       x/=1000;
       if(x<10){
           singlesTh(x); 
        }
        else if(x==10){
           System.out.println("ten");
        }
        else if(x>10 && x<100){
           thousandHandler1(x);
        }
        else if(x>99){
           thousandHandler2(x);
        }
        if(x>0){
           System.out.println("thousand");   
        }        
    }    
    
//     Used in 'million' methods
    public static void millionHandler1(int x){       
       if(x>10 && x<20){
          System.out.println(tens[x]); 
          }
          else{
            System.out.println(baseTenString[x]);
            x%=10;
            System.out.println(singles[x]);
          }  
    }
    
    public static void millionHandler2(int x){       
       hundreds(x);
       x%=100;
       if(x>10 && x<20){
          tenH(x);  
       }
       else{
           tenH(x);
           if(x<9 || x>19){
              singles(x); 
           }
       }
    }
    
//    Used in 'thousand' methods
    public static void thousandHandler1(int x){
        tensTh(x);
        if(x<9 || x>19){
           singles(x); 
           } 
    }
    
    public static void thousandHandler2(int x){
        hundredTh(x);
        tensTh(x);
        if(x<9 || x>19){
           singles(x); 
           }
    }    
    
//    Used in sorter method
    public static void sorterCase2(int x){
      tens(x);
      if(x>19 || x<10){
         singles(x); 
         }        
    }
    
    public static void sorterCase3(int x){
     hundreds(x);
     if(x>100){
        tenH(x);                   
        singlesH(x);                 
        }     
    }
    
    public static void sorterCase4(int x){
     thousands(x);
     hundredTh(x);
     tensTh(x);
     singlesTh(x);   
    }
    
    public static void sorterCase5(int x){
     millions(x);
     thousandMilion(x);
     hundredsMilion(x);
     tensMilion(x);
     singlesMilion(x);    
    }
}

/**
 * Class to count w's
 * 
 * testers to check out #s with lots of zeros
 * fix spacing
 * fix formatting
 */ 


