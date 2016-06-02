package ua.org.oa.ivanovd.practice1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Администратор on 25.05.2016.
 */
public class ArrayProdTest {
    ArrayProd arrayProd;

    @Test
    public void testProd1() throws Exception {
        int [] array = {2, 3, 4};
        int expected = 24;
        int actual = new ArrayProd().Prod(array);
        assertEquals(expected, actual);
    }
}