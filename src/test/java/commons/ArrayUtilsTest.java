package commons;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author hongzhi xiong
 * @create 2018-01-20 9:32 PM
 **/
public class ArrayUtilsTest {

    public static <T> T[] getArrays(Class<T> targerClass) {
        if (Integer.class.isAssignableFrom(targerClass)) {
            return (T[]) Stream.of(1, 2, 3, 4, 6).toArray();
        }
        return (T[]) Stream.of(null).toArray();
    }

    @Test
    public void testArray2List() {
        int[] ages = IntStream.of(1, 3, 5, 7).toArray();
        List<Integer> transformAges = ArrayUtils.array2List(null);
        Assert.assertEquals(Collections.emptyList(), transformAges);
    }

    @Test
    public void testArrayCopy() {
    }

    @Test
    public void testGetArray() {
        getArrays(Integer.class);
    }

    @Test
    public void testArray() {
        String[] names = (String[]) Array.newInstance(String.class, 8);
        Arrays.stream(names).peek(name -> System.out.println(name + "@@@"));
        for (String name : names) {
            System.out.println("###" + name);
        }
        System.out.println(names.getClass() + "==>>" + names);
    }

    @Test
    public void testGetValueFromArray() {
        Integer[] integers = getArrays(Integer.class);
        Object valueFromArray = ArrayUtils.getValueFromArray(integers);
        Assert.assertEquals(2, valueFromArray);
    }

    @Test
    public void testConcat() {
        Integer[] integers = new Integer[]{1, 3, 45, 6, 7};
        Integer[] ints = new Integer[]{5, 6, 7, 8, 9, 0};
//        Integer[] concats = ArrayUtils.concat(integers, ints);
//        System.out.println(concats);
    }
}
