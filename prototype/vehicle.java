package com.dinesh.vehicle

public abstract class vehicle implements  Cloneble{
private  string fueltype;
private  string engine;

    public string getEngine() {
        return engine;
    }
    public string getFueltype() {
        return fueltype;
    }
    public void setEngine(string engine) {
        this.engine = engine;
    }
    public void setFueltype(string fueltype) {
        this.fueltype = fueltype;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
