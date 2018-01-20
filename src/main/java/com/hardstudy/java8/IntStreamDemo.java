package com.hardstudy.java8;

import java.util.stream.IntStream;

import org.junit.Test;

/**
 * @author
 * @create 2018-01-20 6:59 PM
 **/
public class IntStreamDemo {

    @Test
    public void whatIsIntStream() {
        int[] ints = IntStream.of(1, 2, 3).toArray();
        System.out.println(ints.toString());
    }


}

