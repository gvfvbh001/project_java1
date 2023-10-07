package exercise6;

public class reverse {
    private String str1;
    public reverse(String str1){
        this.str1 = str1;
    }

    public void setReverse() {
        int NumRight = str1.length() - 1;
        int NumLeft = 0;
        char[] charStr = str1.toCharArray();
        while (NumLeft < NumRight ){
            char temp = charStr[NumLeft];
            charStr[NumLeft] = charStr[NumRight];
            charStr[NumRight] = temp;
            NumLeft ++;
            NumRight --;
        }
        String str2 = new String(charStr);
        System.out.println(" mảng sau khi đảo " +str2 );
    }
}
