package ua.profitsoft.zakharov.tasks.solution2;

import java.util.*;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


public class Parsing {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("#ab");
        list.add("#bb");
        list.add("#cc");
        System.out.println(parseListTextToListPopularTags(list));
    }
    public static List<Tag> parseListTextToListPopularTags (List<String> list) {
        if (list == null) {
            return new ArrayList<>();
        }

        List<String> tagsStringList = getTagsListFromLines(list);
        List<Tag> tags = new ArrayList<>();

        tagsStringList.stream()
                .collect(
                        Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting())
                )
                .entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .limit(5)
                .forEach(pair -> tags.add(new Tag(pair.getKey(), pair.getValue())));
                return tags;
    }

    private static List<String> getTagsListFromLines(List<String> linesList) {
        Pattern pattern = Pattern.compile("#+[a-zA-Z0-9(_)]+");
        List<String> tagsList = new ArrayList<>();

        linesList.forEach(element -> {
            Set<String> lineTags = new HashSet<>();

            Matcher matcher = pattern.matcher(element);
            while(matcher.find()) {
                lineTags.add(matcher.group());
            }
            lineTags.stream().forEach(x -> tagsList.add(x));
        });

        return tagsList;
    }


}
