import java.util.Scanner;

/**
 * @Author:xiaoyang01
 * @Date：2020/11/24 17:06
 */
public class Test14_3 {
    /**
     * 1、猜数字游戏
     * 一个类A有一个实例变量v，从键盘接收一个正整数作为实例变量v的初始值。
     * 另外再定义一个类B，对A类的实例变量v进行猜测。
     * 	如果大了则提示大了
     * 	小了则提示小了
     * 	等于则提示猜测成功
     *
     * 2、请定义一个交通工具(Vehicle)的类
     * 其中有属性：
     * 	速度(speed)
     * 	体积(size)等等
     * 	方法移动(move())
     * 	设置速度(setSpeed(int speed))
     * 	加速speedUp(),
     * 	减速speedDown()等等.
     *
     * 最后在测试类Vehicle中的main()中实例化一个交通工具对象
     * 并通过方法给它初始化speed,size的值并且打印出来。
     * 另外调用加速减速的方法对速度进行改变。
     *
     * 3、在程序中经常要对时间进行操作但是并没有时间类型的数据。
     * 那么我们可以自己实现一个时间类来满足程序中的需要。
     * 定义名为MyTime的类其中应有三个整型成员时hour分minute秒second
     * 为了保证数据的安全性这三个成员变量应声明为私有。
     * 为MyTime类定义构造方法以方便创建对象时初始化成员变量。
     * 再定义diaplay方法用于将时间信息打印出来。
     * 为MyTime类添加以下方法
     * 	addSecond(int sec)
     * 	addMinute(int min)
     * 	addHour(int hou)
     * 	subSecond(int sec)
     * 	subMinute(int min)
     * 	subHour(int hou)
     * 分别对时、分、秒进行加减运算。
     *
     * 4、编写Java程序模拟简单的计算器。
     * 定义名为Number的类其中有两个整型数据成员n1和n2应声明为私有。
     * 编写构造方法赋予n1和n2初始值
     * 再为该类定义加addition()、减subtration()、乘multiplication()、除division()等公有实例方法
     * 分别对两个成员变量执行加、减、乘、除的运算。
     *
     * 在main方法中创建Number类的对象调用各个方法并显示计算结果
     *
     * 5、编写Java程序用于显示人的姓名和年龄。
     * 定义一个人类Person该类中应该有两个私有属性姓名name和年龄age。
     * 定义构造方法用来初始化数据成员。再定义显示display方法将姓名和年龄打印出来。
     * 在main方法中创建人类的实例然后将信息显示
     * */
    //main方法
    public static void main(String[]  args){
        //创建时间；类
        MyTime myTime = new MyTime(12,25,35);
        //具体方法，直接调用！
    }
}
class MyTime{
    //小时
    private int hour;
    //分钟
    private int minute;
    //秒
    private int second;
    //构造

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    //set,get

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    //打印
    public void diaplay(){
        System.out.println("时间："+getHour()+"小时"+getMinute()+"分钟"+getSecond()+"秒");
    }
    //秒加法
   public void 	addSecond(int sec){
        int addSecond = getSecond();
        int addSecondValue = sec;
       addSecondValue += addSecond;
       setSecond(addSecondValue);
       System.out.println("运算结果："+getSecond());
   }

   //分钟加法
    public void addMinute(int min){
        int addSecond = getMinute();
        int addSecondValue = min;
        addSecondValue += addSecond;
        setMinute(addSecondValue);
        System.out.println("运算结果："+getMinute());
    }

    //小时计算
    public void addHour(int hou){
        int addSecond = getHour();
        int addSecondValue = hou;
        addSecondValue += addSecond;
        setHour(addSecondValue);
        System.out.println("运算结果："+getHour());
    }
    //秒减法
    public void subSecond(int sec){
        int addSecond = getSecond();
        int addSecondValue = sec;
        addSecondValue -= addSecond;
        setSecond(addSecondValue);
        System.out.println("运算结果："+getSecond());
    }
    //分减法
    public void subMinute(int min){
        int addSecond = getMinute();
        int addSecondValue = min;
        addSecondValue -= addSecond;
        setMinute(addSecondValue);
        System.out.println("运算结果："+getMinute());
    }

    //时减法
    public void subHour(int hou){
        int addSecond = getHour();
        int addSecondValue = hou;
        addSecondValue -= addSecond;
        setHour(addSecondValue);
        System.out.println("运算结果："+getHour());
    }
}

