import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringArrayUtilsTest {

    @Test
    public void getCommonStringsTest(){
        //given
        StringArrayUtils test = new StringArrayUtils();
        String[] desiredSkills =  {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
        String[] currentSkills = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};

        //when
        String [] result = test.getCommonStrings(desiredSkills,currentSkills);
        String [] expected = {"SQL", "JAVA"};

        //then
        List<String> check = new ArrayList<>(Arrays.asList(result));
        List<String> contents = new ArrayList<>(Arrays.asList(expected));
        Assert.assertTrue(check.containsAll(contents));

    }

    @Test
    public void anagramTest(){
        //given
        StringArrayUtils test = new StringArrayUtils();
        String one = "Jedi";
        String two = "Diej";

        //when
        boolean check = test.anagram(one, two);

        //then
        Assert.assertTrue(check);
    }
}
