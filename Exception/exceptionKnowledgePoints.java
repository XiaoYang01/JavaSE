import java.util.Scanner;

/**
 * @Author:XiaoYang01
 * @Date:2020/11/28 22:51
 */
public class Exception {
    /**
     * 异常分为不可逆异常：error，和可修复异常Exception
     * Exception异常分为ExceptionSubClass,编译时异常，RuntimeException运行时异常两种
     * */
    //RuntimeException
    //main方法
    public static void main(String[] args){
        //运行时异常
        ExceptionText  exceptionText = new ExceptionText();
        int a = exceptionText.runTimeException(1,0);

        //自定义异常(运行时异常)
        Scanner  scanner = new Scanner(System.in);
        System.out.println("输入一个数字");
        try {
            exceptionText.digital(scanner.nextInt());
        } catch (FormatExceptionTest formatExceptionTest) {
            formatExceptionTest.printStackTrace();
            //异常常用方法
            formatExceptionTest.getMessage();//打印简单的异常信息
            formatExceptionTest.printStackTrace();//打印异常堆栈中的追踪信息，精确
        }finally {
            System.out.println("这是finally知识点，一定会执行");
        }
    }
}
class ExceptionText{
    public static int runTimeException(int a ,int b){
        return a/b;
    }
    public void digital(int a) throws FormatExceptionTest{
        if(a > 0){
            System.out.println(a);
        }else {
            throw new FormatExceptionTest("数字小于0异常");
        }
    }
}

class FormatExceptionTest extends RuntimeException{
    public FormatExceptionTest() {
    }
    public FormatExceptionTest(String s ){
        super();
    }

}

//异常继承结构图，请查看文档
/**
 *子类异常不能多于父类异常
 *异常：程序运行中，发生了非正常状况，称为异常，java提供了异常处理机制，表明java程序非常完善和强壮性（健壮）
 * */
