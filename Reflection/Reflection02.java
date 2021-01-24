package Reflection;
import Thread.*;

/**
 * @Author:XiaoYang01
 * @Date: 2021/1/24 @Week: 星期日
 * Package: JavaSE
 */
public class Reflection02 {
    /*
    * 通过反射实列化对象
    * */
    //main方法
    public static void main(String[] args) throws Exception {
        //获取路径
        String path = "Thread.Thread07";
        //获取Class，创建对象
        Class thread07 = Class.forName(path);
        Object t1 = thread07.newInstance();
        System.out.println(t1);
    }
}
