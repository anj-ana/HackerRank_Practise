import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        if(N%2==0){
            if(N>=2 && N<=5){
                System.out.println("Not Weird");
            }
            else if(N>=6 && N<=20){
                System.out.println("Weird");
            }
            else if(N>20){
                System.out.println("Not Weird");
            }
        }
        else{
            System.out.println("Weird");
        }
    }
}
