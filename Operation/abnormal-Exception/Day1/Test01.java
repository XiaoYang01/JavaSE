import java.util.Scanner;

/**
 * @Author:xiaoyang01
 * @Date：2020/11/26 14:32
 */
public class Exception01 {
    /**
     * 编写程序模拟用户注册：
     * 1、程序开始执行时，提示用户输入“用户名”和“密码”信息。
     * 2、输入信息之后，后台java程序模拟用户注册。
     * 3、注册时用户名要求长度在[6-14]之间，小于或者大于都表示异常。
     *
     * 注意：
     * 	完成注册的方法放到一个单独的类中。
     * 	异常类自定义即可。
     *
     * 	class UserService {
     * 		public void register(String username,String password){
     * 			//这个方法中完成注册！
     *                }* 	}
     *
     * 	编写main方法，在main方法中接收用户输入的信息，在main方法
     * 	中调用UserService的register方法完成注册。
     * */
    //main方法
    public static void main(String[] args){
        //给账户和密码赋初始值
        Registered registered = new Registered();
        //注册异常捕捉
        try {
            //进行账户注册
            registered.doregistered();
        } catch (RegisteredException e) {
            e.printStackTrace();
        }
    }
}
class Registered{
    //账户
    private String account;
    //密码
    private String password;

    //构造
    public Registered() {
    }

    public Registered(String account, String password) {
        this.account = account;
        this.password = password;
    }

    //set,get

    public String getAccount() {
        return account;
    }

    public String getPassword() {
        return password;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    //doregistered，进行注册
    public void doregistered() throws RegisteredException{
        Scanner scanner = new Scanner(System.in);
        boolean bl = true;
        String s1 = "null";
        while(bl) {
            System.out.println("请输入用户名：");
            s1 = scanner.next();
            if(s1.length() > 6 && s1.length() < 8) {
                System.out.println("请输入密码：");
                String s2 = scanner.next();
                Registered registered = new Registered(s1,s2);
                System.out.println("注册成功。账户名："+getAccount()+"  "+"账户密码："+getPassword());
                bl = false;
            }else{
                //自定义异常，和返回值
                throw new RegisteredException("用户名输入异常");
            }
        }
    }
}
