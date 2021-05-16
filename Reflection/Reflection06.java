package Reflection;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.util.Properties;

/**
 * @Author:XiaoYang01
 * @Date: 2021/1/24 @Week: 星期日
 * Package: JavaSE
 * 反射机制如何访问私有对象属性
 */
public class Reflection06 {
    //main方法
    public static void main(String[] args) throws Exception{
        //获取属性文件
        String path = "E:\\JavaSE\\src\\Reflection\\Reflection01.properties";
        FileInputStream fls = new FileInputStream(new File(path));
        Properties pts = new Properties();
        pts.load(fls);
        fls.close();
        String path_1 = pts.getProperty("className");
        //反射机制
        Class c1 = Class.forName(path_1);
        Object student = c1.newInstance();
        Field f1 = c1.getDeclaredField("sex");
        //封装属性不能被访问！
        //打破封装
        f1.setAccessible(true);
        System.out.println(f1.get(student));
        f1.set(student, true);
        System.out.println(f1.get(student));
    }
}
