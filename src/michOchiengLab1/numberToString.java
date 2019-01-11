/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package michOchiengLab1;

import java.util.Scanner;
/**
 *
 * @author Mich Ochieng
 * CPSC 101 JAN 2019
 */
public class numberToString {

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
    
    

    public static void sorter(int x){
        int length = length(x);
        switch(length){
            case 1: System.out.println(singles(x));               
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
    public static String tens(int x){
        if(x>19){
            x/=10;
            String temp = baseTenString[x];
            return temp;
         }
         else if(x==10){
             String temp = "ten";
             return temp;
         }
         else{          
             String temp = tens[x];
             return temp;
         }
    }  
    
    public static String singles(int x){
        x%=100;
        x%=10;        
        String temp = singles[x];        
        return temp;
    }
    
//    Converts hundreds to words 
    public static String hundreds(int x){         
             x/=100; 
             String temp = singles[x];
             return temp;                 
    } 
    
    public static String singlesH(int x){
        x%=100;
//    stops program from adding two at the end ex. 912 = nine hundred twelve two
        if(x<10 || x>19){
          x%=10;
          String temp = singles[x];
          return temp; 
        }      
        return "";
    }
    
    public static String tenH(int x){
        x%=100;
        if(x<20 && x>10){
            String temp = tens[x];
            return temp; 
         } 
         else{
            x/=10;
            String temp = baseTenString[x];
            return temp;
        }
    }  
    
//    Converts thousands to words
    public static String thousands(int x){
       x/=1000;
       if(x<10){
           String temp = singlesH(x) + " thousand"; 
           return temp;
        }
        else if(x==10){
            return "ten thousand";
        }
        else if(x>10 && x<100){
//            ISSUE HERE
           String temp = tensTh(x);
          if(x<9 || x>19){
           String temp2 = tensTh(x) + " " + singlesTh(x) + " thousand"; 
           return temp2;
           }
          else{
            return temp + " thousand";  
          }
        }
        else if(x>99){
         String temp;         
         if(x%100<9 || x%100>19){
             temp = hundredTh(x) + " " + tensTh(x) + " " + singlesTh(x) + " thousand";
             return temp;           
            }
         else{
             temp = hundredTh(x) + " " + tensTh(x) + " thousand";
             return temp;
            }
         }  
       return "";
    }
    
    public static String singlesTh(int x){        
       x%=1000;
       x%=100;
//       stops program from printing last digit again ex. 15111 = fifteen thousand one hundred eleven one
       if(x<10 || x>19){
          x%=10;
          String temp = singles[x];
          return temp;
        }     
       return "";
    }
    
    public static String tensTh(int x){
       x%=100;
        if(x>10 && x<20){
            String temp = tens[x];
            return temp; 
         } 
         else{
            x/=10;
            String temp = baseTenString[x];
            return temp;
        }
    }
    
    public static String hundredTh(int x){
        x%=1000;
        x/=100;        
        if(x>0){
          String temp = singles[x] + " hundred";
          return temp;
        }
        return "";
        
    }
    
//    Converts millions to words
    public static String millions(int x){
       x/=1000000;
       if(x<10){
           String temp = singlesH(x); 
           return temp;
        }
        else if(x==10){
            return "ten million";
        }
        else if(x>10 && x<100){
           millionHandler1(x);
        }
        else if(x>99){
           millionHandler2(x);
        }
       return "";        
    }     
        
    public static String singlesMilion(int x){
       x%=1000000;
       x%=1000;
       x%=100;
//       stops program from printing last digit again ex. 15111 = fifteen thousand one hundred eleven one
       if(x<10 || x>19){          
          String temp = singles(x);
          return temp;           
        }   
       else
           return "";       
    } 
    
    public static String tensMilion(int x){
       x%=1000000;
       x%=1000;
       x%=100;
       if(x<20 && x>10){
           String temp = tens[x];
           return temp; 
       }
       else{
          x/=10;
          String temp = baseTenString[x];
          return temp; 
       } 
    }
    
    public static String hundredsMilion(int x){       
        if(x>0){
          x%=1000000;
          x%=1000;          
          String temp = hundreds(x) + " hundred ";
          return temp; 
        }
        else
            return "";        
    }
    
    public static String thousandMilion(int x){       
        if(x>0){
          x%=1000000;
          String temp = thousands(x);
          return temp;            
        }
        else
            return "";
    }    
    
//     Used in 'million' methods
    public static String millionHandler1(int x){       
       if(x>10 && x<20){
          String temp = tens[x];
          return temp;
          }
          else{
            String temp,temp2;
            int y = x/10;
            temp = baseTenString[y];
            x%=10;
            temp2 = singles[x];
            return temp + " " + temp2;
          }  
    }
    
    public static String millionHandler2(int x){ 
       String temp = hundreds(x) + " hundred " + tensMilion(x) + singlesMilion(x) + " million ";
       return temp;
    }
    
//    Used in 'thousand' methods
    public static String thousandHandler1(int x){
         String temp = tensTh(x);
          if(x<9 || x>19){
           String temp2 = tensTh(x) + " " + singlesTh(x) + " thousand"; 
           return temp2;
           }
          else{
            return temp + " thousand";  
          }
    }
    
    public static void thousandHandler2(int x){
        hundredTh(x);
        tensTh(x);
        if(x<9 || x>19){
           singlesTh(x);
           
           }
    }    
    
//    Used in sorter method
    public static void sorterCase2(int x){     
      if(x>19 || x<10){
         String temp = tens(x);
         String temp2 = singles(x); 
         System.out.println(temp + " " + temp2);
         }
      else{
         String temp = tens(x);
         System.out.println(temp);
      }
    }
    
    public static void sorterCase3(int x){                      
        System.out.println(hundreds(x) + " " + "hundred " + tenH(x) + " " + singlesH(x) );     
    }
    
    public static void sorterCase4(int x){     
     System.out.println(thousands(x) + " " + hundredTh(x) + " " + tensTh(x) + " " + singlesTh(x));
    }
    
    public static String sorterCase5(int x){
     String temp = millions(x) + thousandMilion(x) + hundredsMilion(x) + tensMilion(x) + singlesMilion(x);   
     return temp; 
    }
}

