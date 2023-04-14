package ikun;

public class IkunSix {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 6, 8, 3, 0}));
    }
    public static int maxProfit(int[] prices) {
        int n=prices.length;
        int min=Integer.MAX_VALUE;
        int result=0;
        for(int i=0;i<n;i++){
            if(prices[i]<min){
                min=prices[i];
            }else if(prices[i]-min>result){
                result=prices[i]-min;
            }
        }
        return result;
    }


//    给定一个数组 prices ，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。
//
//    你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
//
//    返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
}
