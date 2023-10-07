package exercise5;

public class average {
    private int[] b;
    public average(int[] b){
        this.b =b;
    }
    public void NumAverage(){
        int NumAG = 0;
        for(int i : b){
            NumAG +=i;
        }
        float NumAverage = NumAG/(b.length) ;
        System.out.println("trung bình cộng số đối xứng là " + NumAverage);
    }
}
