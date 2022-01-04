/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;
/**
 *
 * @author best
 */
public class DelaCalzada_finals2 {
    public static String encode1(String st){
        String en = "";
        int i = 0;
        
        while (i < st.length()){
            int count = 1;
            
            while (i + 1 < st.length() && st.charAt(i) == st.charAt(i + 1)){
                count++;
                i++;
            }
            en = en + count + st.charAt(i);
            i++;
        }
        return en;
    }
    public static String encode2(String st){
        
        String en = "";
        int i = 0;
        int count = 0;
        char current = st.charAt(i);
        
        while (i <= st.length()){
            
            if (i == st.length()){
                en = en + count + current;
            }
            else if (current != st.charAt(i) && i==1){
                en = en + count + current;
                current = st.charAt(i);
                count = 1;
            }
            else if(current != st.charAt(i)){
                en = en + (count) + current;
                current = st.charAt(i);
                count = 1;
            }
            else{
                count++;
            }
            
            i++;
        }
        
        return en;
    }
    public static void main (String[]args){
        Scanner iscan = new Scanner(System.in);
        System.out.println("input string: ");
        String input = iscan.next();
        //print encode 1
        System.out.println("encode1 output: ");
        System.out.println(encode1(input));
        //print encode 2
        System.out.println("encode2 ouutput: ");
        System.out.println(encode2(input));      
        System.out.println("Comparison of both outputs if equal: " + encode2(input).equals(encode1(input)));
    }
}
