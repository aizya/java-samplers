package stream;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
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

    @Test
    public void testRange() {
        IntStream.range(0, 100).forEach(e -> {
            System.out.println(e);
        });

        //
        IntStream.range(0, 10).forEach(System.out::println);
    }

    @Test
    public void testPeek02() {
        int sum = IntStream.of(1, 2, 3, 4)
                .filter(e -> e > 2)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(e -> e * e)
                .peek(e -> System.out.println("Mapped value: " + e))
                .sum();
        Assert.assertEquals(25, sum);
    }

    /**
     * 问题: 给出一个字符串数组,找出其中以z开头以e结尾的. 另将不符合条件的也同时列出来
     */
    @Test
    public void testPeek03() {
        List<String> names = Arrays.asList("zhangsan", "zhangsi", "zhangwu", "zhangyue", "zhangliu", "zhangqi", "zhange");
        List<String> disMatchNames = new ArrayList<>();
        List<String> matchNames = names.stream().filter(name -> {
            // 填写过滤条件
            if (name.startsWith("z") && name.endsWith("e")) {
                return true;
            }
            return false;
        }).peek(name -> disMatchNames.add(name)).collect(Collectors.toList());

        System.out.println(matchNames + "==>>" + disMatchNames);
    }


}
