package ua.profitsoft.zakharov.tasks.solution3;


import org.junit.jupiter.api.Test;
import ua.profitsoft.zakharov.tasks.solution2.Parsing;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class SortedFigureTest {

    private static final List<Shape> sourceFiguresList = new ArrayList<>();
    private static final List<Shape> resultFiguresList = new ArrayList<>();

    static  {
        resultFiguresList.add(new Cube(7));// 343
        resultFiguresList.add(new Sphere(4));// 268.082573106329
        resultFiguresList.add(new Cube(5));// 125
        resultFiguresList.add(new Sphere(3));// 113.09733552923255
        resultFiguresList.add(new Cylinder(3,3));// 84.82300164692441
        resultFiguresList.add(new Cylinder(2,2));// 25.132741228718345
    }

    @Test
    void successPassGetSortedFiguresByVolume() {
        sourceFiguresList.add(new Cylinder(3,3));
        sourceFiguresList.add(new Cube(5));
        sourceFiguresList.add(new Cylinder(2,2));
        sourceFiguresList.add(new Sphere(4));
        sourceFiguresList.add(new Cube(7));
        sourceFiguresList.add(new Sphere(3));
        List<Shape> testList = SortedFigure.getSortedFiguresByVolume(sourceFiguresList);

        boolean checkingLists = false;

        if (testList.size() == resultFiguresList.size()) {
            checkingLists = true;
            for(int i = 0; i < testList.size(); i++) {
                Shape elementFromTest = testList.get(i);
                Shape elementFromResult = resultFiguresList.get(i);

                if (!(elementFromTest.getClass().equals(elementFromResult.getClass()))
                        || (elementFromTest.getVolume() != elementFromResult.getVolume())) {
                    checkingLists = false;
                    break;
                }
            }

        }
        assertTrue(checkingLists);
    }

    @Test
    void checkNullGetSortedFigureByVolume() {
        assertNotNull(SortedFigure.getSortedFiguresByVolume(null));
    }


}