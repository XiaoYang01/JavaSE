package Reflection;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * @Author:XiaoYang01
 * @Date: 2021/1/24 @Week: 星期日
 * Package: JavaSE
 */
public class Reflection03 {
    /*
    * 通过属性配置文件创建对象
    * */
    //main方法
    public static void main(String[] args) throws Exception{
     //获取绝对路径
        String path = "E:\\JavaSE\\src\\Reflection\\Reflection01.properties";
     //创建文件输入流
        FileInputStream fls = new FileInputStream(new File(path));
     //创建Properties属性配置文件
        Properties pts = new Properties();
     //输入
        pts.load(fls);
     //关闭流
        fls.close();
     //获取属性配置文件值
         Object obj = pts.get("className");
     //转换成String
        String path_1 = String.valueOf(obj);
     //获取class与对象
        Class c1 = Class.forName(path_1);
        Object c2 = c1.newInstance();
        System.out.println(c2);
    }
}
