import java.util.Scanner;

public class PairofTopics {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int count=0;
        int[] a=new int[n];
        int[] b=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=s.nextInt();
        }
        for(int j=0;j<b.length;j++){
            b[j]=s.nextInt();
        }
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]>b[i]+b[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
