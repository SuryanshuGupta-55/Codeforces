import java.util.Scanner;

public class AandB {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a1=new int[n];
        int[] a2=new int[n-1];
        int[] a3=new int[n-2];
        int sum1=0;
        int sum2=0;
        int sum3=0;
        for(int i=0;i<a1.length;i++){
            a1[i]=s.nextInt();
            sum1+=a1[i];
        }
        for(int i=0;i<a2.length;i++){
            a2[i]=s.nextInt();
            sum2+=a2[i];
        }
        for(int i=0;i<a3.length;i++){
            a3[i]=s.nextInt();
            sum3+=a3[i];
        }
        System.out.println(sum1-sum2);
        System.out.println(sum2-sum3);
    }
}
