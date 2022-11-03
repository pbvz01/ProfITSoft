package ua.profitsoft.zakharov.tasks.solution3;

public class Cube implements Shape {
     private int facet;

     public Cube(int square) {
         this.facet = square;
     }

    @Override
    public double getVolume() {
         return (Math.pow(facet, 3));
    }

    @Override
    public String getNameShape() {
        return "The cube";
    }


    @Override
    public String toString() {
        return getNameShape() + ": " + getVolume();
    }
}
