package commons;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * an utility class of array
 *
 * @author hongzhi xiong
 * @create 2018-01-20 7:50 PM
 **/
public class ArrayUtils {

    /**
     * @param target: 需要转换成List的目标数组
     * @param <T>:    声明此方法持有一个类型T, 也可以理解成此方法为泛型方法
     * @question: 存在问题: 泛型数组T[]无法传入对应的值,因为不同类型的数组就是不同的对象.无法通用
     * @return: List<T> 返回数组转换后的集合
     */
    public static <T> List<T> array2List(T[] target) {
        if (Objects.isNull(target)) {
            return Collections.emptyList();
        }
        List<T> sources = Stream.of(target).collect(Collectors.toList());
        return sources;
    }

    public static Object getValueFromArray(Object array) {
        Object o = null;
        try {
            o = Array.get(array, 1);
        } catch (IllegalArgumentException e) {
            // 证明并不是一个数组
            System.out.println("It's not an legal array!");
        } catch (IndexOutOfBoundsException e) {
            // 证明数组越边界
            System.out.println("It's out of array's bound!");
        }
        return o;
    }

}
