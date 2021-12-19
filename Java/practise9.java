import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       String str = convert(100);
       System.out.println(str);
       
       
    }
    public static String convert(int n){
        
        String s = "";
        if(n<-100){
            s = "Wrong answer";
        }else{
            s = "Good job";
        }
        return s;
    }
}
