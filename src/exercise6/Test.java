package exercise6;

public class Test {
    public static void main(String[] args){
        InputStr IPSTR = new InputStr();
        IPSTR.setStr1();
        String Str1 = IPSTR.getStr1();
        count CT = new count(Str1);
        CT.setStr1();
        Find FD = new Find(Str1);
        FD.setFindStr1();
        reverse RE = new reverse(Str1);
        RE.setReverse();
        anagram AM = new anagram(Str1);
        AM.setAnagram();
    }
}
