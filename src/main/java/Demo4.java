import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo4 {
    public static void main(String[] args) {
        System.out.println(etterCombinations("234"));
    }
    static final Map<Character,String> map=new HashMap<Character,String>(){{
        put('2',"abc");
        put('3',"def");
        put('4',"ghi");
        put('5',"jkl");
        put('6',"mno");
        put('7',"pqrs");
        put('8',"tuv");
        put('9',"wxyz");
    }};
    public static List<String> etterCombinations(String digits) {
        List<String> result=new ArrayList<>();
        if(digits==null ||digits.length()==0) return result;
        addString(result,digits,0,new StringBuffer());
        return result;
    }
    public static void addString(List<String> result,String digits,int index,StringBuffer sb){
        if(index==digits.length()){
            result.add(sb.toString());
        }else {
            char c = digits.charAt(index);
            String s = map.get(c);
            int n = s.length();
            for (int i = 0; i < n; i++) {
               sb.append(s.charAt(i));
               addString(result,digits,index+1,sb);
               sb.deleteCharAt(index);
            }
        }
    }
}
