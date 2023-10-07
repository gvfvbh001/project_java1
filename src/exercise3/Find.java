package exercise3;

public class Find {
    private int n ;
    public Find(int n ){
        this.n = n;
    }
    public void setN(){
        FindSDX FSDX  = new FindSDX();
        for (int i = 1; i<= n ; i++){
            if (FSDX.getFind(i)){
                System.out.print(i + " ");
            }
        }
    }
}
