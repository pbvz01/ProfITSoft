package ua.profitsoft.zakharov.tasks.solution2;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;


class ParsingTest {
    private static final List<String> sourceListWithText = new ArrayList<>();
    private static final List<Tag> resultListWithPopularTags = new ArrayList<>();

    @BeforeEach
    void setUp(){
        Collections.addAll(sourceListWithText,
                new String("#usualtag"),
                new String("#usualtag"),
                new String("#usualtag"),
                new String("#doubletag#doubletag"),
                new String("#doubletag#doubletag"),
                new String("This line without tags"),
                new String("This line with #different #tags"),
                new String("This line with #linewithtags")
        );

        Collections.addAll(resultListWithPopularTags,
                new Tag("#usualtag", 3l),
                new Tag("#doubletag", 2l),
                new Tag("#linewithtags", 1l),
                new Tag("#different", 1l),
                new Tag("#tags", 1l)
        );
    }

    @Test
    void checkSizeLists() {
        Assert.assertEquals("Difference in size of lists",
                resultListWithPopularTags.size(),
                Parsing.parseListTextToListPopularTags(sourceListWithText).size());
    }

    @Test
    void successPassParseListTextToMapPopularTags() {
        System.out.println(Arrays.toString(resultListWithPopularTags.toArray()));
        System.out.println(Parsing.parseListTextToListPopularTags(sourceListWithText));
        Assert.assertArrayEquals("The lists is not match",
                resultListWithPopularTags.toArray(),
                Parsing.parseListTextToListPopularTags(sourceListWithText).toArray());
    }

    @Test
    void checkNullParseListTextToMapPopularTags() {
        Assert.assertNotNull(Parsing.parseListTextToListPopularTags(null));
    }

}