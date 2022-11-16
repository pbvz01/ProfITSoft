package ua.profitsoft.zakharov.tasks.solution3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortedFigure {
    public static void main(String[] args) {
        Cube cube1 = new Cube(5);
        Cube cube2 = new Cube(5);
        System.out.println(getSortedFiguresByVolume(List.of(cube1, cube2)));
    }
    public static List<Shape> getSortedFiguresByVolume(List<Shape> figureList) {
        if (figureList == null) {
            return new ArrayList<>();
        }
        return figureList.stream()
                .sorted((el1, el2) -> (int) (el2.getVolume() - el1.getVolume()))
                .collect(Collectors.toList());
    }

}
