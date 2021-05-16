package Reflection;
import Thread.Thread07;
/**
 * @Author:XiaoYang01
 * @Date: 2021/1/23 @Week: 星期六
 * Package: JavaSE
 */
public class Reflection01 {
    /*
    * 原理：通过java语言读取，修改字节码文件（Stream）也就是class文件
    反射：在lang.reflect.*；包下
    与反射相关的class
    Lang.Class  // 获取字节码文件
    Lang.reflect.Math // 获取字节码文件中的方法
    Lang.reflect.Constructor  //获取字节码文件中的构造方法
    Lang.reflect.Field  //或许字节码文件属性（变量）
    * */
    //main方法
    public static void main(String[] args){
        //通过反射获取class的三种方式
        //第一种
        Class c1 = null;
        try {
             c1 = Class.forName("Thread.Thread07");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //第二种，通过对象引用名的，getClass（）
        Thread07 t1 = new Thread07();
        Class c2 = t1.getClass();
        //第三种.class
        Class c3 = Thread07.class;
        //对比
        System.out.println(c1 == c2 && c1 == c3);  //true
    }
}
