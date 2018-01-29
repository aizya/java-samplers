package stream;

import org.junit.Test;

import java.util.stream.Stream;

/**
 * Stream 的一些用法
 *
 * @author hongzhi xiong
 * @create 2018-01-28 8:56 PM
 **/
public class Stream01 {

    /**
     * 初识stream： limit
     */
    @Test
    public void test01() {
        Stream.of(1, 4, 5, 6, 67, 8)
                .limit(3).forEach(item -> {
            System.out.println(item);
        });
    }



}
