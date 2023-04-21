package niganma;

public class NiganmaNine {
    public static void main(String[] args) {
        System.out.println(hammingDistance(1, 4));
    }

    //汉明距离
    public static int hammingDistance(int x, int y) {
        return Integer.bitCount(x^y);
    }
}
