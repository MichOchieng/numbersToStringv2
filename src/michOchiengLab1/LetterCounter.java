/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package michOchiengLab1;
import java.util.ArrayList;

/**
 *
 * @author Mich
 */
public class LetterCounter {
    static int count;
    private static final ArrayList<Integer> arr = new ArrayList<>();
    private static final int range = 35000000;
    
    public static void main(String[] args){
        arraySeeder(); 
        wCounter();
    }  
    
    public static void arraySeeder(){        
        for(int i = 0; i<=range;i++){
            arr.add(i);
        }
        arr.trimToSize();        
    }
    
    public static void wCounter(){          
        for(int i = 0; i<=arr.size()-1;i++){
            if(arr.get(i)%2 == 0){
                count++;
            }            
        }
        int result = (count-1)*2;
        System.out.println("There are " + result + " w's between one and 35 million.");
    }
}
