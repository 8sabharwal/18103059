import java.util.Scanner;

public class q1 {

    static void comp(String str1s, String str2s) {
        int n = str1s.length();
        int m = str2s.length();
        char[] str1 = str1s.toCharArray();
        char[] str2 = str2s.toCharArray();
        int cmp = 0;
        for(int i=0;i<n && i<m;i++) {
            if(str1[i]<str2[i]) {
                cmp=-1;break;
            }
            if(str1[i]>str2[i]) {
                cmp=1;break;
            }
        }
        if(cmp==-1) {
            System.out.println(str1s+" < "+str2s);
        }
        else if(cmp==1) {
            System.out.println(str2s+" < "+str1s);
        }
        else {
            if(n>m) {
                System.out.println(str2s+" < "+str1s);
            }
            else if(m>n) {
                System.out.println(str1s+" < "+str2s);
            }
            else {
                System.out.println(str1s+" = "+str2s);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two strings:");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        comp(str1,str2);
    }
}