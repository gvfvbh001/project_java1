package exercise3;

import exercise3.Find;
import exercise3.Input;

public class test {
    public static void main(String[] args){
        Input IP =new Input();
        IP.setInputN();
        int n = IP.getInputN();
        Find FD = new Find(n);
        FD.setN();

    }
}