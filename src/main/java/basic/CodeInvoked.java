package basic;

/**
 * 用于测试代码的在运行时的初始化顺序
 *
 * @author hongzhi xiong
 * @create 2018-01-21 9:58 PM
 **/
public class CodeInvoked {
    static {
        System.out.println("static code block invoked");
    }

    {
        System.out.println("code block invoked");
    }

    public CodeInvoked() {
        System.out.println(" default constructor invoked");
    }
}
