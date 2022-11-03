package ua.profitsoft.zakharov.tasks.solution3;


import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class SortedFigureTest {

    private static final List<Shape> sourceFiguresList = new ArrayList<>();

    static  {
        sourceFiguresList.add(new Cube(7));// 343
        sourceFiguresList.add(new Sphere(4));// 268.082573106329
        sourceFiguresList.add(new Cube(5));// 125
        sourceFiguresList.add(new Sphere(3));// 113.09733552923255
        sourceFiguresList.add(new Cylinder(3,3));// 84.82300164692441
        sourceFiguresList.add(new Cylinder(2,2));// 25.132741228718345
    }

    @Test
    void successPassGetSortedFiguresByVolume() {
        List<Shape> testList = SortedFigure.getSortedFiguresByVolume(sourceFiguresList);
        assertArrayEquals(testList.toArray(), sourceFiguresList.toArray());

    }

    @Test
    void checkNullGetSortedFigureByVolume() {
        assertNotNull(SortedFigure.getSortedFiguresByVolume(null));
    }


}