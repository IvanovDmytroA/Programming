package ua.org.oa.ivanovd.practice1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Администратор on 23.05.2016.
 */
public class ArraySumTest {

    ArraySum arraySum;

    @Test
    public void sumArray() throws Exception {
        int [] Array = {5, 3, 6};
        int actual = ArraySum.Sum(Array);
        int expected = 14;
        Assert.assertEquals("Test for sumArray", expected, actual);
    }

    @Before
    public void setUp() throws Exception {
        arraySum = new ArraySum(new int[]{1, 2, 3});
    }

    @Test
    public void testSum2() throws Exception {
        int actual = 6;
        int expected = arraySum.Sum();
        double delta = 0.01;
        assertEquals(expected, actual, delta);
    }

    @Test(expected = java.lang.NullPointerException.class)
    public void testSum3() {
        ArraySum.Sum(null);
    }
}