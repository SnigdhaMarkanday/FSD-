import java.io.*;
import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int n1=s.nextInt();
            int a[] = new int[n1];
            
            int c=0;
            for(int i=0;i<n1;i++){
                int v =s.nextInt();
                a[i]=v;
            }
            for(int start=0; start<n1; start++){
                for(int end=0; end<n1; end++){
                    int sum=0;
                    for(int i= start;i<=end;i++){
                        sum=sum+a[i];
                        
                    }
                    if(sum<0){
                            c++;
                    }
                }
                
            }
        System.out.println(c);  
    }
}
