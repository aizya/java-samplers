package basic;

/**
 * @author hongzhi xiong
 * @create 2018-01-21 9:59 PM
 * @see CodeInvoked
 **/
public class CodeInvokedTest {
    /**
     * output:
     * 1. static code block invoked: 首先触发的是静态代码块 static{具体代码}
     * 2. code block invoked: 然后再是代码块 {具体代码}
     * 3. default constructor invoked: 最后才是构造方法
     * <a href=""></a>
     *
     * @param args
     */
    public static void main(String[] args) {
        CodeInvoked codeInvoked = new CodeInvoked();
    }

}
