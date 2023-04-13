package ikun;

import java.util.List;

public class IkunFive {
    public static void main(String[] args) {
        System.out.println(myPow(2, -2));
    }
    public static double myPow(double x, int n) {
        //x=0,直接返回
        if(x==0.0f) return 0.0d;
        long l=n;
        double res=1.0;
        //n小于零是，转换到大于零的一边
        if(l<0){
            x=1/x;
            l=-l;
        }
        //n大于零是
        while(l>0){
            if((l&1)==1) res*=x;
            x*=x;
            l>>=1;
        }
        return res;
    }
}
