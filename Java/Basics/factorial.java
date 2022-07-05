import java.util.Scanner; 
class Java {
    public static void main(String[] args) {
       int n,f=1;
       Scanner s = new Scanner(System.in);
       n=s.nextInt();
       while(n>0){
           f=f*n;
           n--;
       }
       System.out.println(f);
    }
}
