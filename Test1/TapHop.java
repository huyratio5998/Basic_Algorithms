package TN26;

import java.util.*;

public class TapHop {

    static int n,k,s,kq,temp;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            n = in.nextInt();
            k = in.nextInt();
            s = in.nextInt();
            if (n == 0 && k == 0 && s == 0) {
                break;
            }
            kq = 0;
            temp = 0;
            Try(1,1);
            System.out.println(kq);
        }
    }

    public static void Try(int i,int j) {
        if (i > n || j > k) {
            if(temp==s && j>k) kq++;
            return;
        }
        Try(i + 1, j);
        if (temp + i <= s) {
            temp += i;
            Try(i + 1, j + 1);
            temp -= i;
        }
    }

}
