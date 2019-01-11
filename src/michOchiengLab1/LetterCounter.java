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
    }  
    
    public static void arraySeeder(){        
        for(int i = 0; i<=range;i++){
            arr.add(i);
        }
        arr.trimToSize();
        System.out.println(arr.get(35000000));
    }
    public static void wCounter(){        
        for(int i = 0; i<=arr.size();i++){
            if(arr.indexOf(i)%2 == 0){
                count++;
            }            
        }
        System.out.println("There are " + count + " w's between one and 35 million.");
    }
}
