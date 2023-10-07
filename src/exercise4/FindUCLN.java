package exercise4;




public class FindUCLN {
    private int a;
    private  int b;
    public FindUCLN(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void  Find(){

        while (b != 0){ // dùng thuật toán EUCLID thay cho đệ quy
            int temp = b ;
            b = a % b;
            a = temp;
        }
        System.out.println(" ước chuông lớn nhất là "+ a);
    }
}
