package exercise6;

public class Find {
    private String Str1;
    public Find(String str1){
        this.Str1 = str1;
    }
    public void setFindStr1() {
        int dem = 0;
        for(int i =0 ; i< Str1.length(); i++){
            if(!(Str1.charAt(i) >= '0' && Str1.charAt(i) <= '9') &&
                    !(Str1.charAt(i) >= 'A' && Str1.charAt(i) <= 'Z') &&
                    !(Str1.charAt(i) >= 'a' && Str1.charAt(i) <= 'z') &&
                    Str1.charAt(i) != ' ' ){
                dem++;
            }
        }
        System.out.println(" số kí tự đặc biệt có trong chuổi là " + dem);
    }
}
