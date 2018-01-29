package commons;

import org.junit.Assert;
import org.junit.Test;

import javax.management.Notification;
import java.awt.*;
import java.util.Objects;

/**
 * @author hongzhi xiong
 * @create 2018-01-21 9:53 PM
 * 理解一下Java7出现的Objects工具类
 * 1. 对象空以及非空的处理
 * 2. hash的一些处理
 **/
public class ObjectsUtil {

    private Object obj = null;
    private Object obj2 = new Object();

    @Test
    public void testIsNull01() {
        try {
            if (obj == null) {
                throw new NullPointerException(obj + " is null");
            }
        } catch (Exception ex) {
            if (ex.getClass().isAssignableFrom(NullPointerException.class)) {
                System.out.println("catch an null pointer exception");
            }
        }
    }

    @Test
    public void testIsNull02() {
        if (Objects.isNull(obj)) {
            System.out.println(obj + " is null");
        }
    }

    @Test
    public void testNonNull() {
        boolean notNull = Objects.nonNull(obj2);
        if (notNull) {
            System.out.println("obj2 not null");
        }
    }

    @Test
    public void testRequiredNonNull() {
        Objects.requireNonNull(obj2, "obj2 is null");
    }

    @Test
    public void testRequiredNonNullElse() {
        Object result = Objects.requireNonNullElse(obj, obj2);
        System.out.println(result);
    }

    /**
     * 该方法用于测试两个同为null的对象是否相等
     */
    @Test
    public void testCompareTwoNullObject() {
        Object obj1 = null;
        Object obj2 = null;
        boolean equals = Objects.equals(obj1, obj2);
        Assert.assertEquals(true, equals);

        boolean deepEquals = Objects.deepEquals(obj1, obj2);
        // 我以为是false....
        Assert.assertEquals(true, deepEquals);
    }

}
