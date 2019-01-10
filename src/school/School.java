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
 * @author Mich
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
        System.out.println("Give me a number from 1 to (but not including) 1 million.");
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
            System.out.println("Oops! Looks like you gave me a value out of the given range. Please try again.");
        }
    }
//    methods
    public static void sorter(int x){
        int length = length(x);
        switch(length){
            case 1:
                singles(x);
                break;
            case 2:
                tens(x);
                if(x>19 || x<10){
                   singles(x); 
                }                
                break;    
            case 3:
                hundreds(x);
                if(x>100){
                   tenH(x);                   
                   singlesH(x);                 
                }                
                break;    
            case 4:
                thousands(x);
                hundredTh(x);
                tensTh(x);
                singlesTh(x);
                break;
            case 5:
                System.out.println("I can't do this yet ¯\\_(ツ)_/¯");
                break;
            default:
                System.out.println("It looks like something went very wrong. How did you manage to get here?");
        }
    }
    public static int length(int x){
//        singles
        if(x<10){
            return 1;
        }
//        tens
        else if(x<100 && x>=10){
            return 2;
        }
//        hundreds
        else if(x<1000 && x>99){
            return 3;
        }
//        hundred thousand
        else if(x<1000000 && x>999){
            return 4;
        }
//        million
        else if(x<1000000000 && x>=1000000){
            return 5;
        }
        return 0;
    }   
    
//    real methods -----------------------------
    public static void millions(int x){
        if(x<10000000 && x>=1000000){
            
        }
        else if(x<100000000 && x>=10000000){
            
        }
        else if(x<1000000000 && x>=100000000){
            
        }
    } 
    public static void thousands(int x){
        x/=1000;
        if(x<10){
           singlesTh(x); 
        }
        else if(x==10){
            System.out.println("ten");
        }
        else if(x>10 && x<100){
           tensTh(x);
           if(x<9 || x>19){
              singles(x); 
           } 
        }
        else if(x>99){
           hundredTh(x);
           tensTh(x);
           if(x<9 || x>19){
              singles(x); 
           }
        }
        System.out.println("thousand");        
    }
    
    
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
//    breaking down double digits
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
    
//    for breaking down hundreds    
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
    
//    breaking down thousands 999 < x < 9999
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
}

/**
 * Class to count w's
 * finish millions
 * testers to check out #s with lots of zeros
 * fix spacing
 * fix formatting
 */ 


