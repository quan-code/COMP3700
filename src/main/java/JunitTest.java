import org.junit.*;

import static org.junit.Assert.assertEquals;
public class JunitTest {
    @Test
    public void test_findMax() {
        Finder finder = new Finder();
        Integer expectedResult = 6;
        Integer actualResult = finder.findMax(new int[]{1,2,3,4,5,6});
        // test
        assertEquals(actualResult,expectedResult);
    }

    @Test
    public void test_findMax_emptyArray() {
        Finder finder = new Finder();
        Integer expectedResult = null;
        Integer actualResult = finder.findMax(new int[]{});
        // test
        assertEquals(actualResult,expectedResult);
    }

    @Test
    public void test_findMax_nullInput() {
        Finder finder = new Finder();
        Integer expectedResult = null;
        Integer actualResult = finder.findMax(null);
        // test
        assertEquals(actualResult,expectedResult);
    }

    @Test
    public void test_findMin() {
        Finder finder = new Finder();
        Integer expectedResult = 1;
        Integer actualResult = finder.findMin(new int[]{1,2,3,4,5,6});
        // test
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test_findMin_emptyArray() {
        Finder finder = new Finder();
        Integer expectedResult = null;
        Integer actualResult = finder.findMin(new int[]{});
        // test
        assertEquals(actualResult,expectedResult);
    }

    @Test
    public void test_findMin_nullInput() {
        Finder finder = new Finder();
        Integer expectedResult = null;
        Integer actualResult = finder.findMin(null);
        // test
        assertEquals(actualResult,expectedResult);
    }


}
