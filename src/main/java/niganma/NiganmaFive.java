package niganma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class NiganmaFive {
    public static void main(String[] args) {

    }

    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        if(n==1) return intervals;
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        //定义最终结果
        List<int[]> list=new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            int l=intervals[i][0],r=intervals[i][1];
            //左大于集合最右侧
            if(list.size()==0  || list.get(list.size()-1)[1]<l){
                list.add(new int[]{l,r});
            }else{
                //更新集合长度
                list.get(list.size()-1)[1]=Math.max(r,list.get(list.size()-1)[1]);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}
