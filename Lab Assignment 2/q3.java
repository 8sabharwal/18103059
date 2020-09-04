import java.util.Scanner;

public class q3 {

    static int comp(String a, String b) {
        int n1 = a.length();
        int n2 = b.length();
        char[] x = a.toCharArray();
        char[] y = b.toCharArray();
        int flag = 0;
        for(int i=0;i<n1 && i<n2;i++) {
            if(x[i]<y[i]) {
                flag=-1;break;
            }
            if(x[i]>y[i]) {
                flag=1;break;
            }
        }
        if(flag==1 || flag==-1) return flag;
        if(flag==0 && n1>n2) return 1;
        if(flag==0 && n1<n2) return -1;
        return 0;
    }

    static void sortStr(String[] s) {
        int n = s.length;
        for(int i=0;i<n-1;i++) {
            String mn = s[i];
            int ind = i;
            for(int j=i+1;j<n;j++) {
                if(comp(mn,s[j]) == 1) {
                    ind = j;
                    mn = s[j];
                }
            }
            s[ind] = s[i];
            s[i] = mn;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of strings:");
        int n = sc.nextInt();
        String[] sr = new String[n];
        sc.nextLine();
        for(int i=0;i<n;i++) 
        {
            sr[i] = sc.nextLine();
        }
        sortStr(sr);
        for(int i=0;i<n;i++) 
        {
            System.out.print(sr[i]+" ");
        }
    }
}