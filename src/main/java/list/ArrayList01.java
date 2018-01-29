package list;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author hongzhi xiong
 * @create 2018-01-28 9:09 PM
 **/
public class ArrayList01 {

    private static final int INDEX_OF_GET = 4;

    @Test
    public void get() {
        List<Integer> integers = Arrays.asList(1, 3, 45, 6, 7, 78, 32);
        Integer integer = integers.get(INDEX_OF_GET);
        System.out.println(integer);
    }

    /**
     * Supplier<C> collectionFactory
     */
    @Test
    public void get02() {
        List<Integer> integers = Arrays.asList(1, 3, 45, 6, 7, 78, 32);
        integers.stream().limit(4 + 1).collect(Collectors.toCollection(LinkedList::new)).getLast();
    }


}
