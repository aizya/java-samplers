package commons;

import org.junit.Test;

import java.util.AbstractList;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;

/**
 * 用于测试Arrays的一些方法
 *
 * @author hongzhi xiong
 * @create 2018-01-24 10:39 PM
 **/
public class ArraysTest {

    /**
     * 我常常会有这样一个问题: 为什么使用Arrays生成的集合无法增加/删除元素了
     */
    @Test
    public void testAsList() {
        List<Integer> integers = asList(1, 3, 4);
        System.out.println(integers.size() + "===>>" + integers);

        integers.add(111);
    }

    public static <E> List<E> asList(E... element) {
        return new ImmutableList<>(element);
    }

    /**
     * 该List继承自AbstractList, 即其中的add方法和remove方法都会抛出UnsupportedOperationException异常,需要重写add和remove才可以
     * <p>
     * 真正的ArrayList也是同样的重写了这两个方法,而Arrays中的asList生成的ArrayList仅仅也只是Arrays这个类的一个内部类
     *
     * @param <E>
     */
    private static class ImmutableList<E> extends AbstractList<E> implements RandomAccess, java.io.Serializable {
        private final E[] immutableArray;

        public ImmutableList(E[] arr) {
            this.immutableArray = Objects.requireNonNull(arr);
        }

        @Override
        public E get(int index) {
            return immutableArray[index];
        }

        @Override
        public int size() {
            return immutableArray.length;
        }

        @Override
        public boolean add(E e) {
            // 不报错,但是也不存进去
            return false;
        }
    }
}
