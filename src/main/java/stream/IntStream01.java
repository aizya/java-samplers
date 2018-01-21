package stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
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
    public void sum(){
        Stream<String> stream = Arrays.stream(new String[]{"1", "2", "3"});
        List<String> strings = stream.sorted().collect(Collectors.toList());
        System.out.println(strings);
    }

    @Test
    public void sum02(){
        int sum = IntStream.of(1, 33, 4, 2).sum();
        System.out.println(sum);
    }






}
