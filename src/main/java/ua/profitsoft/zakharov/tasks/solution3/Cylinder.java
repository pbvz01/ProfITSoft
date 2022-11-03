package ua.profitsoft.zakharov.tasks.solution3;

import static java.lang.Math.PI;

public class Cylinder implements Shape {
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public String getNameShape() {
        return "The cylinder";
    }

    @Override
    public double getVolume() {
        return PI * Math.pow(radius,2) * height;
    }


    @Override
    public String toString() {
        return getNameShape() + ": " + getVolume();
    }
}
