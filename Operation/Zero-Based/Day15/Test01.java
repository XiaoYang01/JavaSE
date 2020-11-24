/**
 * @Author:XiaoYang01
 * @Date:2020/11/24 22:03
 */
public class Test15_1 {
    /**
     * 1.编写程序实现乐手弹奏乐器。乐手可以弹奏不同的乐器从而发出不同的声音。
     * 可以弹奏的乐器包括二胡、钢琴和琵琶。
     * 	实现思路及关键代码：
     * 		1)定义乐器类Instrument，包括方法makeSound()
     * 		2)定义乐器类的子类：二胡Erhu、钢琴Piano和小提琴Violin
     * 		3)定义乐手类Musician，可以弹奏各种乐器play(Instrument i)
     * 		4)定义测试类，给乐手不同的乐器让他弹奏
     *
     * 2.1.多态练习题
     * 编写程序模拟“主人”喂养“宠物”的场景：
     * 提示1：
     * 	主人类：Master
     * 	宠物类：Pet
     * 	宠物类子类：Dog、Cat、YingWu
     * 提示2：
     * 	主人应该有喂养的方法：feed()
     * 	宠物应该有吃的方法：eat()
     * 	只要主人喂宠物，宠物就吃。
     *
     * 要求：主人类中只提供一个喂养方法feed()，要求达到可以喂养各种类型的宠物。
     *
     * 编写测试程序：
     * 	创建主人对象
     * 	创建各种宠物对象
     * 	调用主人的喂养方法feed()，喂养不同的宠物，观察执行结果。
     *
     * 通过该案例，理解多态在开发中的作用。
     * 重要提示：feed方法是否需要一个参数，参数选什么类型！！！
     * */
    //main方法
    public static void main(String[] args){
        Erhu erhu = new Erhu();
        Piano piano = new Piano();
        Violin violin = new Violin();
        //多态向上转型
        Musician musician = new Musician(piano);
        //Instrument instrument = new Piano();
            musician.instrument.play();
    }
}
class Musician{
    //乐手有有乐器
    Instrument instrument;

    public Musician(Instrument instrument) {
        this.instrument = instrument;
    }

    public Musician() {
    }
}
interface Instrument{
    //乐器弹奏
    void play();
}
//二胡
class Erhu implements Instrument{

    @Override
    public void play() {
        System.out.println("乐手正在拉二胡");
    }
}
//钢琴
class Piano implements Instrument{

    @Override
    public void play() {
        System.out.println("乐手正在谈钢琴");
    }
}
//小提琴
class Violin implements Instrument{

    @Override
    public void play() {
        System.out.println("乐手正在拉小提琴");
    }
}
