package io;

import org.junit.Test;

import java.io.IOException;
import java.io.StringReader;
import java.util.Objects;

/**
 * @author hongzhi xiong
 * @create 2018-01-29 9:50 PM
 **/
public class StringReader01 {
    // 如何构造
    @Test
    public void test01() {
        StringReader reader = new StringReader("Two Years with zhangyue");
        try {
            int currentRead = reader.read();

            while (!Objects.equals(currentRead, -1)) {
                System.out.println((char) currentRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
