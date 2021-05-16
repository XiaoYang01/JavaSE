package Reflection;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Properties;

/**
 * @Author:XiaoYang01
 * @Date: 2021/1/24 @Week: 星期日
 * Package: JavaSE
 */
public class Reflection04 {
    /*
    * 获取field
    * */
    ///main方法
    public static void main(String[] args) throws Exception{
        //获取配置文件路径
        String path = "E:\\JavaSE\\src\\Reflection\\Reflection01.properties";
        //io流
        FileInputStream fls = new FileInputStream(new File(path));
        //创建Properties对象
        Properties pts = new Properties();
        //添加
        pts.load(fls);
        //关闭流
        fls.close();
        //获取对象路径
        String path_1 = pts.getProperty("className");
        //获取class与对象
        Class c1 = Class.forName(path_1);
        Object c2 = c1.newInstance();
        //获取Field——属性名称
        Field[] f1 = c1.getDeclaredFields();
        for (Field f: f1) {
            System.out.println(f.getName());
            //获取Field——数据类型
            System.out.println(f.getType());
            //获取修饰符
            int i = f.getModifiers();
            String modifier = Modifier.toString(i);
            System.out.println(modifier);
        }
    }
}
