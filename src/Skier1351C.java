import java.util.Scanner;

public class Skier1351C {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        int c=5;
        int d=5;
        while(t-->0){
            String str=s.next();
            for(int i=1;i<str.length();i++){
                if(str.charAt(i)==str.charAt(i-1)){
                    c+=5;
                }
                else
                    d++;
            }
            System.out.println(c+d);
        }
    }
}
