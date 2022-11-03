package ua.profitsoft.zakharov.tasks.solution3;

import static java.lang.Math.PI;

public class Sphere implements Shape {
    private int radius;

    public Sphere(int radius) {
        this.radius = radius;
    }

    @Override
    public String getNameShape() {
        return "The sphere";
    }

    @Override
    public double getVolume() {
        return (4 * PI * Math.pow(radius, 3))/3;
    }


    @Override
    public String toString() {
        return getNameShape() + ": " + getVolume();
    }
}
