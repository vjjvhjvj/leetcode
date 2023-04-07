public class Demo20 {
    public static void main(String[] args) {
        System.out.println(strStr("mississippi", "issipi"));
    }
    public static int strStr(String haystack, String needle) {
        int n=haystack.length(),l=needle.length();
        if(n<l) return -1;
        for (int i=0;i<n;i++){
            int sign=0;
            if(haystack.charAt(i)==needle.charAt(0)){
                if(n-i<l) return -1;
                int s=i+1;
                for (int j=1;j<l;j++){
                    if(haystack.charAt(s)==needle.charAt(j)){
                        sign++;
                    }
                    sign--;
                    s++;
                }
                if(sign==0) return  i;
            }
        }
        return -1;
    }
}
