package exercise5;

public class Sum {
    private int a[];

    public Sum(int[] a){
        this.a = a;
    }
    public void setSumMax(){
        int NumMax = a[0] + a[1];
        for(int i = 0; i< a.length - 1;i++){
            int NumMax1 = a[i] + a[i+1];
            if(NumMax < NumMax1){
                NumMax = NumMax1;
            }
        }
        System.out.println("tổng 2 liên tiếp  lớn nhất " + NumMax);
    }
}
