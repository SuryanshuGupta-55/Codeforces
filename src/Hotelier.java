import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Hotelier {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String str=s.next();
        int[] arr=new int[10];
        int l=0;
        int r=arr.length-1;
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)=='L'){
                for(int j=0;j<arr.length;j++){
                    if(arr[j]==0){
                        arr[j]=1;
                        break;
                    }
                }
            }
            else if(str.charAt(i)=='R'){
                for(int j=arr.length-1;j>-1;j--){
                    if(arr[j]==0){
                        arr[j]=1;
                        break;
                    }
                }
            }
            else
            {
                arr[str.charAt(i)-'0']=0;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
