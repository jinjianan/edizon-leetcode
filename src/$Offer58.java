/**
 * 剑指 Offer 58 - II. 左旋转字符串
 */
public class $Offer58 {

    public String reverseLeftWords(String s, int n) {
        return s.substring(n) + s.substring(0,n);
    }

}
