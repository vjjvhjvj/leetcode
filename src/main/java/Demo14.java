public class Demo14 {
    public static void main(String[] args) {

    }
    public int reverse(int x) {
        int res=0;
        while (x!=0){
            int temp=x%10;
            if(res>214748364||(res==214748364&& temp>7)){
                return 0;
            }
            if(res<-214748364 ||(res==-214748364&& temp<-8)){
                return 0;
            }
            res=res*10+temp;
            x/=10;
        }
        return res;
    }
}
