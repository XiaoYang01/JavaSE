import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

/**
 * @Author:xiaoyang01
 * @Date：2020/11/25 15:39
 */
public class Test16_4 {
    /**
     * 某公司的雇员分为以下若干类：
     * 	Employee：这是所有员工总的父类，
     * 		属性：
     * 			员工的姓名,员工的生日月份。
     * 		方法：getSalary(intmonth)
     * 			根据参数月份来确定工资，如果该月员工过生日，则公司会额外奖励100 元。
     *
     * 	SalariedEmployee：
     * 		Employee 的子类，拿固定工资的员工。
     * 		属性：月薪
     *
     * 	HourlyEmployee：
     * 		Employee 的子类， 按小时拿工资的员工，每月工作超出160 小时的部分按照1.5 倍工资发放。
     * 		属性：每小时的工资、每月工作的小时数
     *
     * 	SalesEmployee：
     * 		Employee 的子类，销售人员，工资由月销售额和提成率决定。
     * 		属性：月销售额、提成率
     *
     * 	BasePlusSalesEmployee：
     * 		SalesEmployee 的子类，有固定底薪的销售人员，工资 由底薪加上销售提成部分。
     * 		属性：底薪。
     *
     * 	根据要求创建 SalariedEmployee 、 HourlyEmployees 、SaleEmployee 和 BasePlusSalesEmployee四个类的对象各一个，
     * 	并计算某个月这四个对象的工资。
     *
     * 	注意：要求把每个类都做成完全封装，不允许非私有化属性。
     * */
    //main方法
    public static void main(String[] args){
        boolean b1 = true;
        while(b1){
            System.out.println("欢迎使用员工薪资管理系统！");
            System.out.println("查询固定薪资的员工，请输入：1");
            System.out.println("查询按小时计算薪资的员工，请输入：2");
            System.out.println("查询无底薪销售员工的薪资，请输入：3");
            System.out.println("查询有底薪销售员工的薪资，请输入：4");
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            if(a == 1){
                //创建子类对象
                HourlyEmployee h1 = new HourlyEmployee();
                h1.employeeTest();
            }
            if(a == 2){
                //创建子类对象，调用
                SalariedEmployee s_1 = new SalariedEmployee();
                s_1.SalariedEmployee();
            }
            if(a == 3){
                //创建子类
                SalesEmployee s_2 = new SalesEmployee();
                s_2.SalesEmployeeTest();
            }
            if(a == 4){
                //创建子类
                BasePlusSalesEmployee s_3 = new BasePlusSalesEmployee();
                s_3.BasePlusSalesEmployeeTest();
            }

        }
    }
}
//公司员工类：Employee；父类
 class Employee{
    //员工姓名
    private String name;
    //员工生日月份
    private int month;
    //参数

    public Employee() {
    }

    public Employee(String name, int month) {
        this.name = name;
        this.month = month;
    }
    //get,set

    public String getName() {

        return name;
    }

    public int getMonth()
    {
        return month;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setMonth(int month) {

        this.month = month;
    }
}
//子类：	HourlyEmployee：//固定薪资员工
class HourlyEmployee extends Employee{
        //固定薪资
    private double fixedMonthlySalary;
    //参数
    public HourlyEmployee(){

    }
    public HourlyEmployee(double fixedMonthlySalary){

        this.fixedMonthlySalary = fixedMonthlySalary;
    }
    //set,get

    public double getFixedMonthlySalary() {

        return fixedMonthlySalary;
    }

    public void setFixedMonthlySalary(double fixedMonthlySalary) {

        this.fixedMonthlySalary = fixedMonthlySalary;
    }

    public void employeeTest(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请分别输入员工的姓名和生日月份");
        String s1= scanner.next();
        int i1 = scanner.nextInt();
        //创建父类对象
        Employee e1 = new Employee(s1,i1);
        //创建子类对象
        System.out.println("请输入该员工的固定薪资：");
        setFixedMonthlySalary(scanner.nextDouble());
        System.out.println(e1.getName()+"的固定薪资是："+getFixedMonthlySalary());
    }
}
//SalariedEmployee：子类
class SalariedEmployee extends Employee{
    //每小时工资
   private double hourlyWage;
   //工作小时
    private double hour;
    //参数
    public SalariedEmployee(){

    }
    public SalariedEmployee(double hourlyWage,double hour){
        this.hourlyWage = hourlyWage;
        this.hour = hour;
    }
    //set,get

    public double getHourlyWage() {

        return hourlyWage;
    }

    public double getHour() {

        return hour;
    }

    public void setHourlyWage(double hourlyWage) {

        this.hourlyWage = hourlyWage;
    }

    public void setHour(double hour) {

        this.hour = hour;
    }
    public void SalariedEmployee(){
        Scanner scanner = new Scanner(System.in);
        double b1 =0;
        double b2 =0;
        System.out.println("请分别输入员工的姓名和生日月份");
        String s1= scanner.next();
        int i1 = scanner.nextInt();
        //创建父类对象
        Employee e2 = new Employee("s1",i1);
        System.out.println("请输入该员工的每小时薪资和工作时长：");
        setHourlyWage(scanner.nextDouble());
        setHour(scanner.nextDouble());
        if(getHour()> 160){
            double b3 = getHour()-160;
            b1 += (b3*1.5)+(160*getHourlyWage());
            System.out.println("按小时拿薪资的员工："+e2.getName()+"  "+"薪资："+b1);
        }
        if(getHour() < 160){
            b2 += (getHour()*getHourlyWage());
            System.out.println("按小时拿薪资的员工："+e2.getName()+"  "+"薪资："+b2);
        }
    }
}
//SalesEmployee：子类
class SalesEmployee extends Employee{
    //月销售额度
    private double monthlySales;
    //提成
    private double commission;
    //参数
    public SalesEmployee(){

    }
    public SalesEmployee(double monthlySales,double commission){
        this.monthlySales = monthlySales;
        this.commission = commission;
    }
    //set,get

    public double getMonthlySales() {

        return monthlySales;
    }

    public double getCommission() {

        return commission;
    }

    public void setMonthlySales(double monthlySales) {

        this.monthlySales = monthlySales;
    }

    public void setCommission(double commission) {

        this.commission = commission;
    }
    public void SalesEmployeeTest(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请分别输入员工的姓名和生日月份");
        String s1= scanner.next();
        int i1 = scanner.nextInt();
        //创建父类对象
        Employee e3 = new Employee(s1,i1);
        System.out.println("请输入该员工当月的销售额和提成占比：");
        setMonthlySales(scanner.nextDouble());
        setCommission(scanner.nextDouble());
        //薪资
        double b1 = 0;
        b1 = (getCommission()*getMonthlySales());
        System.out.println("员工："+e3.getName()+"  "+"员工销售额："
                +getMonthlySales()+"员工提成率："+getCommission()+"薪资："+b1);
    }
}
//BasePlusSalesEmployee 子类
class BasePlusSalesEmployee extends Employee{
    //底薪
    private double basicSalary;
    //参数
    public BasePlusSalesEmployee(){

    }
    public BasePlusSalesEmployee(double basicSalary){

        this.basicSalary = basicSalary;
    }
    //set,get

    public double getBasicSalary() {

        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {

        this.basicSalary = basicSalary;
    }
    public void BasePlusSalesEmployeeTest(){
       Scanner scanner = new Scanner(System.in);
        System.out.println("请分别输入员工的姓名和生日月份");
        String s1= scanner.next();
        int i1 = scanner.nextInt();
        //创建父类对象
        Employee e4 = new Employee("s1",i1);
        System.out.println("请输入该员工的底薪：");
        setBasicSalary(scanner.nextDouble());
        System.out.println("当月销售额：");
        double xs = scanner.nextDouble();
        System.out.println("当月提成率：");
        double tc = scanner.nextDouble();
        double b1 = getBasicSalary()+(xs*tc);
        System.out.println("员工："+e4.getName()+"  "+"员工销售额："
                +xs+"员工提成率："+tc+"薪资："+b1);
    }
}
