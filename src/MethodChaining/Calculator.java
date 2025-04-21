package MethodChaining;

public class Calculator {
    private int result;

    public Calculator add(int value){
        this.result += value;
        return this;
    }

    public Calculator substract(int value){
        this.result -= value;
        return this;
    }

    public int getResult(){
        return result;
    }
}
