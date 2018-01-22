package stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author
 * @create 2018-01-20 7:46 PM
 **/
public class IntStream01 {

    public IntStream createIntStreamByOf() {
        return IntStream.of(1, 2, 3);
    }

    @Test
    public void sum() {
        Stream<String> stream = Arrays.stream(new String[]{"1", "2", "3"});
        List<String> strings = stream.sorted().collect(Collectors.toList());
        System.out.println(strings);
    }

    @Test
    public void sum02() {
        int sum = IntStream.of(1, 33, 4, 2).sum();
        System.out.println(sum);
    }

    /**
     * 关于IntStream的min方法,返回该Stream当中最小的元素的值,如果该Stream为空,则返回empty
     */
    @Test
    public void testMin() {
        OptionalInt min = IntStream.of(1, 3, 4).min();
        if (min.isPresent()) {
            System.out.println("It's not empty, min is " + min.getAsInt());
        } else {
            System.out.println("It's an empty stream");
        }
    }

    /**
     * 现在已经一个Int数组,然后我想找到这个数组中最大值的下标值,如果不止一个,那么都显示出来
     */
    @Test
    public void testMax() {
        int[] ages = new int[]{1, 3, 45, 56, 77, 77, 21};
        OptionalInt max = Arrays.stream(ages).max();
        if (max.isPresent()) {
            System.out.println("It's max value: " + max.getAsInt());
        } else {
            System.out.println("It's not exist any value");
        }
    }

    /**
     * the count of elements in this stream
     */
    @Test
    public void testCount() {
        Stream<Integer> integerStream = Stream.of(1, 3, 4, 5, 6, 6);
        long count = integerStream.count();
        System.out.println("The count of stream is: " + count);

        long intCount = IntStream.of().count();
        System.out.println("The count of int stream is: " + intCount);
    }

    /**
     * peek到底是个什么东西?
     * <p>
     * peek翻译成中文: 偷瞄,偷窥
     * <p>
     * peek接收一个intConsumer参数
     */
    @Test
    public void testPeek() {
        IntStream stream = IntStream.of(1, 3, 4, 5, 6, 67, 76).peek(age -> System.out.println(age));
    }

}
