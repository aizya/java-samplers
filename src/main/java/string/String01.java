package string;

import org.junit.Test;

/**
 * @author hongzhi xiong
 * @create 2018-01-29 11:13 AM
 * @see String
 **/
public class String01 {
    String aaa = "aa";

    /**
     * Returns a canonical(权威的;规范的) representation(n.表现;陈述;) for the string object.
     * <p>
     * A pool of strings, initially empty, is maintained privately by the
     * class {@code String}.
     * 一个字符串池, 初始化为空,由String类单独的维护.
     * <p>
     * When the intern(拘留,关押,实习生) method is invoked, if the pool already contains a
     * string equal to this {@code String} object as determined by(确定的;坚定的;)
     * the {@link #equals(Object)} method, then the string from the pool is
     * returned. Otherwise, this {@code String} object is added to the
     * pool and a reference to this {@code String} object is returned.
     * 当intern方法被调用时, 如果字符串池中已经存在一个相同的字符串等于当前调用该方法的字符串时,
     * 这个字符串就会被返回,否则,会将该字符串加入到字符串池中，并且将引用返回.
     * <p>
     * <p>
     * It follows that for any two strings {@code s} and {@code t},
     * {@code s.intern() == t.intern()} is {@code true}
     * if and only if {@code s.equals(t)} is {@code true}.
     * <p>
     * 如果s.intern()==t.intern()为true,那么s.equals(t)也一定为true.
     * <p>
     * All literal strings and string-valued constant expressions are
     * interned. String literals are defined in section 3.10.5 of the
     * <cite>The Java&trade; Language Specification</cite>.
     *
     * @return a string that has the same contents as this string, but is
     * guaranteed to be from a pool of unique strings. (从池中获得的相同的字符串)
     * @jls 3.10.5 String Literals
     */
    @Test
    public void testIntern() {
        String intern = aaa.intern();
        System.out.println(intern.equals(aaa) + "==>>" + intern);
        String intern1 = intern.intern();
        System.out.println(intern1.equals(intern));
    }

    @Test
    public void testCreateString() {
        char[] values = new char[]{'a', 'b', 'c', 'd'};
        String result = new String(values);
        System.out.println(result);
    }



}
