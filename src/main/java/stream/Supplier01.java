package stream;

import java.util.stream.Collectors;

/**
 * @author hongzhi xiong
 * @create 2018-01-28 9:19 PM
 * @see java.util.function.Supplier
 **/
public final class Supplier01 {
    // Supplier的含义： 供应商 vendor/ 供给者
    //  Represents a supplier of results. 表示一个结果的供应者
    // @FunctionalInterface： 函数式接口,接口中只有一个方法
    //<p>There is no requirement（要求,必要） that a new or distinct（确切的/有区别的） result be returned each
    // * time the supplier is invoked.
    // Supplier没有必要保证每次的调用返回一个不同的结果（意思是可以返回相同的结果，也可以返回不同的结果）。

    public static void test() {
        System.out.println("test it");
    }
}
