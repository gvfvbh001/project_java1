package exercise6;

public class count {
    private String Str1;
    public count(String str1){
        this.Str1 = str1;
    }
    public void setStr1() {
        Str1 = Str1.trim(); // xóa dấu cách

        int dem = 0;
        for(int i =0 ; i< Str1.length(); i++){
            if(Str1.charAt(i) == 32){
                dem++;
            }
        }
        System.out.println("số từ có trong chuổi là " + (dem+1));
    }
}
