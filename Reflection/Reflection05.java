package Reflection;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.util.Properties;

/**
 * @Author:XiaoYang01
 * @Date: 2021/1/24 @Week: 星期日
 * Package: JavaSE
 * 对象属性修改
 */
public class Reflection05 {
    //main方法
    public static void main(String[] args) throws Exception{
        //获取配置文件路径
        String path = "E:\\JavaSE\\src\\Reflection\\Reflection01.properties";
        //IO流读取
        FileInputStream fls = new FileInputStream(new File(path));
        //Properties对象
        Properties pts = new Properties();
        //读取属性配置文件
        pts.load(fls);
        //关闭流
        fls.close();
        //获取文件路径
        String path_1 = pts.getProperty("className");
        //反射机制
        Class c1 = Class.forName(path_1);
        Object student = c1.newInstance();
        Field f1 = c1.getDeclaredField("age");
        System.out.println(student);
        //赋值
        f1.set(student, 200);
        System.out.println(f1.get(student));
        System.out.println(student);
    }
}
