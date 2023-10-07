package exercise5;

import java.util.ArrayList;

public class Find {
    private int[] a;
    private int[] b;
    public Find(int[] a){
        this.a = a;
    }
    public boolean FindNum(int Num){
        String NumStr = Integer.toString(Num);
        int NumLg = NumStr.length();
        for (int i = 0; i < NumLg/2;i++ ){
           if(NumStr.charAt(i) != NumStr.charAt((NumLg - i -1))){
               return false;
           }
        }
        return true;
    }
    public ArrayList<Integer> FindAddArray(){
        ArrayList<Integer> ArrayNum = new ArrayList<>();
        for(int i : a){
            if(FindNum(i)){
                ArrayNum.add(i);
            }
        }
        return ArrayNum;
    }

    public int[] getB() {
        b = new int[FindAddArray().size()];
        for(int i =0; i < FindAddArray().size(); i++){
            b[i] = FindAddArray().get(i);
        }
        return b;
    }
}
