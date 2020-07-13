package com.concepts.core.java.tech.example;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result {

    /*
     * Complete the 'findSmallestDivisor' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. STRING t
     */

	public static int findSmallestDivisor(String s, String t) {
        int retCount = 0;        
        
        int strCount = 0, strFromIndex = 0;
        
        while ((strFromIndex = s.indexOf(t, strFromIndex)) != -1 ){ 
            System.out.println("1. Found at index: " + strFromIndex);
            strCount++;
            strFromIndex++;            
        }

        System.out.println("Total occurrences: " + strCount);
        
        if(strFromIndex != -1 && s != null && s.length() > 0) {
            s = s.substring(strFromIndex);
             retCount = -1;
             return -1;
        }  else {
            
            retCount = t.length();  

            int ind = retCount/2;
            String subStr = t.substring(0,  ind);

            strCount = 0; strFromIndex = 0;

            while ((strFromIndex = t.indexOf(subStr, strFromIndex)) != -1 ){ 
                System.out.println("2. Found at index: " + strFromIndex);
                strCount++;
                strFromIndex++;  
            }
           
           if(strCount > 0) {
               
               retCount = subStr.length();
           }
            return retCount;
        }
        
    }

    public static String commonPrefix(String s, String t){  
        int n = Math.min(s.length(),t.length());  
        for(int i = 0; i < n; i++){  
            if(s.charAt(i) != t.charAt(i)){  
                return s.substring(0,i);  
            }  
        }  
        return s.substring(0,n);  
    }  

}



public class TectEx1 {
    public static void main(String[] args) throws IOException {
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        //String s = bufferedReader.readLine();

        //String t = bufferedReader.readLine();
    	
    	String s ="rbrbrbrbrbrbrbrbrbrbrbrbrbrbrbrbrbrbrbrbrbrb";
    	
    	String t = "rbrb";

        //int result = Result.findSmallestDivisor(s, t);
        
        //System.out.println("Result: "+result);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedReader.close();
        //bufferedWriter.close();
    }
}
