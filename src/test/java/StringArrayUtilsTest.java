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

    @Test
    public void fizziesTestWith4(){
        //given
        StringArrayUtils test = new StringArrayUtils();
        int n = 4;
        String[] expected = {"1", "2", "Fizz", "4"};

        //when
        String [] actual = test.replaceWithFizzies(n);

        //then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void fizziesTestWith5(){
        //given
        StringArrayUtils test = new StringArrayUtils();
        int n = 5;
        String[] expected = {"1", "2", "Fizz", "4", "Buzz"};

        //when
        String [] actual = test.replaceWithFizzies(n);

        //then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void fizziesTestWith15(){
        //given
        StringArrayUtils test = new StringArrayUtils();
        int n = 15;
        String[] expected = {"1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"};

        //when
        String [] actual = test.replaceWithFizzies(n);

        //then
        Assert.assertArrayEquals(expected, actual);
    }



}
