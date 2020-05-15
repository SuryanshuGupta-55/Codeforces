import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SkiersandSuffixes {
    private static int count(String str){
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<str.length();i++){
            set.add((int) str.charAt(i));
        }
        for (int i:set
             ) {
            System.out.println(i);
        }
        return set.size()+1;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int[] arr=new int[n+1];
        int[] arrl=new int[m+1];
        String str="";
        for(int i=1;i<=n;i++){
            arr[i]=s.nextInt();
            str+=arr[i];
        }
        for(int i=1;i<=m;i++){
            arrl[i]=s.nextInt();
        }
        for(int i=1;i<arrl.length;i++){
            System.out.println(count(str.substring(arrl[i],n)));
        }

    }
}
