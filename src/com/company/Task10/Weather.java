//Weather

package com.company.Task10;

public class Weather {
    public double Temperature;
    private boolean IsSun;
    private boolean IsRain;
    private  boolean IsSnow;
    private double WindForce;

    public  Weather(double Temperature,boolean IsSun,boolean IsSnow,boolean IsRain,double WindForce){
        this.Temperature = Temperature;
        this.IsSun=IsSun;
        this.IsRain=IsRain;
        this.IsSnow=IsSnow;
        this.WindForce=WindForce;

    }

    @Override
    public String toString() {
        return "Weather{" +
                "Temperature=" + Temperature +
                ", IsSun=" + IsSun +
                ", IsRain=" + IsRain +
                ", IsSnow=" + IsSnow +
                ", WindForce=" + WindForce +
                '}';
    }
}
