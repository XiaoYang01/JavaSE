import javafx.beans.binding.BooleanExpression;

/**
 * @Author:xiaoyang01
 * @Date：2020/11/19 11:18
 */
public class Test12_1 {
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
        People people = new Male();
        people.personalInformation();
    }
}
interface People{
    void personalInformation();
}
class Male implements People{
    //身份证
    private String iDCard;
    //姓名
    private String name;
    //性别
    private boolean gender;
    //老婆
    private Female female;
    //构造

    public Male() {
    }

    public Male(String iDCard, String name, boolean gender, Female female) {
        this.iDCard = iDCard;
        this.name = name;
        this.gender = gender;
        this.female = female;
    }
    //get,set
    public String getiDCard() {
        return iDCard;
    }

    public String getName() {
        return name;
    }

    public boolean getGender() {
        return gender;
    }

    public Female getFemale() {
        return female;
    }

    public void setiDCard(String iDCard) {
        this.iDCard = iDCard;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setFemale(Female female) {
        this.female = female;
    }

    @Override
    public void personalInformation() {
        String s1 = getiDCard();
        String s2 = getName();
        Boolean s3 = getGender();
        Female s4 = getFemale();
        System.out.println(s1+""+s2+""+s3+s4);
    }
}
class Female  implements People{
    //身份证
    private String iDCard;
    //姓名
    private String name;
    //性别
    private boolean gender;
    //老公
    private Male male;
    //参数
    public Female() {
    }
    public Female(String iDCard, String name, boolean gender, Male male) {
        this.iDCard = iDCard;
        this.name = name;
        this.gender = gender;
        this.male = male;
    }
    //get,set

    public String getiDCard() {
        return iDCard;
    }

    public String getName() {
        return name;
    }

    public boolean isGender() {
        return gender;
    }

    public Male getMale() {
        return male;
    }

    public void setiDCard(String iDCard) {
        this.iDCard = iDCard;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setMale(Male male) {
        this.male = male;
    }

    @Override
    public void personalInformation() {

    }
}
