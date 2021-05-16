import java.math.BigDecimal;

/**
 * @Author:xiaoyang01
 * @Date：2020/11/19 14:34
 */
public class Test12_3 {
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
    public static void main(String[] args){
        String s1 = "123.333333333";
        BigDecimal decimal = new BigDecimal(123);
       BankAccount bankAccount =new BankAccount("laowang","1234",decimal);
       bankAccount.bankAccount();
    }
}
class B{
    Account account;

    public B() {
    }

    public B(Account account) {
        this.account = account;
    }
}
abstract class Account{
    public abstract void bankAccount();
}
class BankAccount extends Account{
    //账户
    private String account;
    //密码
    private String passWord;
    //余额
    private BigDecimal balance;

    public BankAccount(String account, String passWord, BigDecimal balance) {
        this.account = account;
        this.passWord = passWord;
        this.balance = balance;
    }

    public String getAccount() {
        return account;
    }

    public String getPassWord() {
        return passWord;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    //打印
    @Override
    public void bankAccount() {
    System.out.println("账户："+getAccount());
    System.out.println("密码："+getPassWord());
    System.out.println("余额："+getBalance());
    }
}
