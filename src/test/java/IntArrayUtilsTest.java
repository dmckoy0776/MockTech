import org.junit.Assert;
import org.junit.Test;

public class IntArrayUtilsTest {

    @Test
    public void getSubSumTestHardCode(){ //ONLY WORKS WHEN ARRAY LENGTH = 4;
        //given
        IntArrayUtils utils = new IntArrayUtils();
        int [] test = {1,3,5,4};
        int expected = 68;

        //when
        int actual = utils.sumOfAllSubArrays(test);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getSubSumTestEvenLengthArray(){
        //given
        IntArrayUtils utils = new IntArrayUtils();
        int [] test = {1,3,5,4};
        int expected = 68;

        //when
        int actual = utils.theMathWay(test);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSubSumOddLengthArray(){
        //given
        IntArrayUtils utils = new IntArrayUtils();
        int [] test = {5,6,4,2,1};
        int expected = 130;

        //when
        int actual = utils.theMathWay(test);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getParabolicEvenLengthTimesFirstIndex(){
        //given
        IntArrayUtils utils = new IntArrayUtils();
        int index = 0;
        int length = 4;
        int expected = 4;

        //when
        int actual = utils.parabolicValue(index, length);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getParabolicEvenLengthTimesMiddleIndex(){
        //given
        IntArrayUtils utils = new IntArrayUtils();
        int index = 1;
        int length = 4;
        int expected = 6;

        //when
        int actual = utils.parabolicValue(index, length);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getParabolicEvenLengthTimesLastIndex(){
        //given
        IntArrayUtils utils = new IntArrayUtils();
        int index = 3;
        int length = 4;
        int expected = 4;

        //when
        int actual = utils.parabolicValue(index, length);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getParabolicOddLengthTimesFirstIndex(){
        //given
        IntArrayUtils utils = new IntArrayUtils();
        int index = 0;
        int length = 5;
        int expected = 5;

        //when
        int actual = utils.parabolicValue(index, length);

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void getParabolicOddLengthTimesMiddleIndex(){
        //given
        IntArrayUtils utils = new IntArrayUtils();
        int index = 2;
        int length = 5;
        int expected = 9;

        //when
        int actual = utils.parabolicValue(index, length);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getParabolicOddLengthTimesLastIndex(){
        //given
        IntArrayUtils utils = new IntArrayUtils();
        int index = 4;
        int length = 5;
        int expected = 5;

        //when
        int actual = utils.parabolicValue(index, length);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void get2ndLargestTest(){
        //given
        IntArrayUtils utils = new IntArrayUtils();
        int [] index = {45, 4, 3, 44};
        int expected = 44;

        //when
        int actual = utils.secondLargestNumber(index);

        Assert.assertEquals(expected, actual);
    }

}
