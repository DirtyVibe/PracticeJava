package bin.hackerrank;
import java.util.Scanner;

public class FormatOutput {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                String str1 = String.format("%03d",x);
                System.out.printf("%s%10s\n",s1,str1);
            }
            System.out.println("================================");

    }
}