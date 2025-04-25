package AreaRecord;

public record AreaCounting(double lenght, double width) {
    public double area(){
        return lenght * width;
    }

    public double info(){
        return lenght / width;
    }
}
