package ua.profitsoft.zakharov.tasks.solution2;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;


class ParsingTest {
    private static final List<String> sourceListWithText = new ArrayList<>();
    private static final List<Tag> resultListWithPopularTags = new ArrayList<>();

    static {
        Collections.addAll(sourceListWithText,
                ("#usualtag"),
                ("#usualtag"),
                ("#usualtag"),
                ("#doubletag#doubletag"),
                ("#doubletag#doubletag"),
                ("This line without tags"),
                ("This line with #different #tags"),
                ("This line with #linewithtags")
        );

        Collections.addAll(resultListWithPopularTags,
                new Tag("#usualtag", 3L),
                new Tag("#doubletag", 2L),
                new Tag("#linewithtags", 1L),
                new Tag("#different", 1L),
                new Tag("#tags", 1L)
        );
    }

    @Test
    void checkSizeLists() {
        List<Tag> checkingList = Parsing.parseListTextToListPopularTags(sourceListWithText);
        Assert.assertEquals("Difference in size of lists",
                resultListWithPopularTags.size(),
                checkingList.size());
    }

    @Test
    void successPassParseListTextToMapPopularTags() {
        List<Tag> checkingList = Parsing.parseListTextToListPopularTags(sourceListWithText);
        assertArrayEquals("The lists is not match",
                resultListWithPopularTags.toArray(),
                checkingList.toArray());
    }

    @Test
    void checkNullParseListTextToMapPopularTags() {
        assertNotNull(Parsing.parseListTextToListPopularTags(null));
    }

}
