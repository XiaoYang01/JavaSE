import javax.naming.Name;
import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author:xiaoyang01
 * @Date：2020/11/21 10:37
 */
public class Test12_5 {
    /**
     * day 14作业
     *
     * 第一题：设计日期类，每个日期对象都可以描述年月日信息。
     *
     * 第二题：设计男人类，每个男人都有身份证号、姓名、性别、女人。设计女人类，每个女人都有身份证号、姓名、性别、男人。
     *
     * 第三题：设计银行账户类，每个账户都有账号、密码、余额等信息。
     *
     * 第四题：设计微信账号类，每个微信账号都有微信号、手机号、昵称等信息。
     *
     * 第五题：定义丈夫类 Husband 和妻子类 Wife，
     * 丈夫类的属性包括：身份证号，姓名，出生日期，妻子。
     * 妻子类的属性包括：身份证号，姓名，出生日期，丈夫。
     * 分别给这两个类提供构造方法（无参数构造方法和有参数构造方法都要提供），
     * 编写测试程序，创建丈夫对象，然后再创建妻子对象，丈夫对象关联妻子对象，
     * 妻子对象关联丈夫对象，要求能够输出这个“丈夫对象”的妻子的名字，
     * 或者能够输出这个“妻子对象”的丈夫的名字。要求能够画出程序执行过程的内存图。
     * 并且要求在程序中演示出空指针异常的效果。
     * */
    //main方法
    public static void main(String[] args) throws Exception{
        //创建Husband对象
        Husband husband = new Husband();
        //创建Wife对象
        Wife wife = new Wife();
        //出生年月日
        String husbandS1 = "2003-06-12";
        String wifeS2 = "2006-06-13";
        //创建SimpDataFormat对象
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        //丈夫出生
            Date husbandData01 = simpleDateFormat.parse(husbandS1);
            husband.setHusbandDate(husbandData01);
        //打印
        System.out.println(husband.getHusbandDate());
            Date wifeDate01 = simpleDateFormat.parse(wifeS2);
            wife.setWifeDate(wifeDate01);
        //打印
        System.out.println(wife.getWifeDate());
        //打印丈夫，妻子名称
        wife.setName("123");
        husband.setName("321");
        husband.wife = wife;
        wife.husband = husband;
        System.out.println(husband.wife.getName());
        System.out.println(wife.husband.getName());
        /*try {
            throw new formatException();
        } catch (formatException e) {
            e.printStackTrace();
        }*/

    }
}

//丈夫类
class Husband {
    //身份证证号
    private String id;
    //姓名
    private String name;
    //出生日期
    private Date husbandDate;
    //丈夫的妻子
    //private Wife wife;
    //不封装关联
    Wife wife;

    //参数

    public Husband(Wife wife) {
        this.wife = wife;
    }

    public Husband() {
    }

    public Husband(String id, String name, Date husbandDate, Wife wife) {
        this.id = id;
        this.name = name;
        this.husbandDate = husbandDate;
        this.wife = wife;
    }
    //set,get

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getHusbandDate() {
        return husbandDate;
    }

    public Wife getWife() {
        return wife;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHusbandDate(Date husbandDate) {
        this.husbandDate = husbandDate;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }
}
//妻子类
class Wife {
    //身份证证号
    private String id;
    //姓名
    private String name;
    //出生日期
    private Date wifeDate;
    //妻子的丈夫
   // private Husband husband;
    //不封装关联
     Husband husband;
    //参数

    public Wife() {
    }

    public Wife(String id, String name, Date wifeDate, Husband husband) {
        this.id = id;
        this.name = name;
        this.wifeDate = wifeDate;
        this.husband = husband;
    }
    //get,set
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getWifeDate() {
        return wifeDate;
    }

    public Husband getHusband() {
        return husband;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWifeDate(Date wifeDate) {
        this.wifeDate = wifeDate;
    }

    public void setHusband(Husband husband) {
        this.husband = husband;
    }
}
/*
//自定义异常
class formatException extends Exception{
    public formatException() {
    }

    public formatException(String message) {
        super(message);
    }
}*/
