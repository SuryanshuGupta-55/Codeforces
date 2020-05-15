import java.util.Scanner;

public class Sumofrounds {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            int n=s.nextInt();
            if(n>0 && n<=10){
                System.out.println(n);
            }

        }
    }
}
