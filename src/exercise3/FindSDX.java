package exercise3;

public class FindSDX {
    public boolean getFind(int n){
        String NumSTR = Integer.toString(n);// chuyển sang chuổi duyệt dữ liệu
        int Num = NumSTR.length();
       for(int i = 0 ; i < Num/2 ; i++){
           if(NumSTR.charAt(i) != NumSTR.charAt(Num - i -1)){ // truy xuất
               return false;// không bằng nhau
           }

       }
        return true;// dối xứng
    }

}
