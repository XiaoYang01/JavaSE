/**
 * @Author:XiaoYang01
 * @Date:2020/11/22 21:28
 */
public class Test13_3 {
    /**
     * 一、请通过代码封装，实现如下需求：
     * 	编写一个类Book，代表教材:
     * 	1.具有属性：名称（title）、页数（pageNum）
     * 	2.其中页数不能少于200页，否则输出错误信息，并赋予默认值200
     * 	3.为各属性提供赋值和取值方法
     * 	4.具有方法:detail，用来在控制台输出每本教材的名称和页数
     * 	5.编写测试类BookTest进行测试：为Book对象的属性赋予初始值，并调用Book对象的detail方法，看看输出是否正确
     *
     * 二、写一个名为Account的类模拟账户。
     * 该类的属性和方法如下所示。
     * 该类包括的属性：账户id，余额balance，年利率annualInterestRate；
     * 包含的方法：各属性的set和get方法。取款方法withdraw()，存款方法deposit()
     *
     * 写一个测试程序
     * （1）创建一个Customer，名字叫Jane Smith，他有一个账号为1000，余额为2000，年利率为1.23%的账户
     * （2）对Jane Smith操作：
     * 存入100元，再取出960元，再取出2000。
     * 打印Jane Smith的基本信息
     * 信息如下显示：
     * 成功存入：100
     * 成功取出：960
     * 余额不足，取钱失败
     * Customer [Smith，Jane] has a account ：id is 1000 annualInterestRate is 1.23% balance is 1140.0
     *
     * 三、(封装)已知一个类 Student 代码如下：
     * class Student{
     * 	String name;
     * 	int age;
     * 	String address;
     * 	String zipCode;
     * 	String mobile;
     * }
     * 要求：
     * 	1、把Student 的属性都作为私有，并提供get/set 方法以及适当的构造方法。
     * 	2、为Student 类添加一个getPostAddress 方法，要求返回Student 对象的地址和邮编。
     * */
    //main方法
    public static void  main(String[] args){
        //Student.getPostAddress();
        System.out.println( Student.getPostAddress());
    }
}
class Student{
    private String name;
    private int age;
    private String address;
    private String zipCode;
    private String mobile;
    //参数

    public Student() {
    }

    public Student(String name, int age, String address, String zipCode, String mobile) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.zipCode = zipCode;
        this.mobile = mobile;
    }
    //get,set

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getMobile() {
        return mobile;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    //返回Studens的对象地址和邮编
    public static Student getPostAddress(){
        Student student = new Student();
        return student;
    }
}
