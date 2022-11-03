package ua.profitsoft.zakharov.tasks.solution3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortedFigure {
    public static List<Shape> getSortedFiguresByVolume(List<Shape> figureList) {
        if (figureList == null) {
            return new ArrayList<>();
        }
        return figureList.stream()
                .sorted((el1, el2) -> (int) (el2.getVolume() - el1.getVolume()))
                .collect(Collectors.toList());
    }

}
