import java.util.Scanner;

public class q4 {

    public static void main(String[] args) {
        int sum=0, m=1;
        for(; sum<Integer.MAX_VALUE && m<Integer.MAX_VALUE; m++) {
            if(sum+m>=Integer.MAX_VALUE)
                break;
            sum+=m;
            if(sum==m*m)
                System.out.println(m);
        }
        //System.out.println("the program is ended at "+m);
    }
}