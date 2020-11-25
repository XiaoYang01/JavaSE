/**
 * @Author:xiaoyang01
 * @Date：2020/11/25 11:49
 */
public class Test15_2 {
    /**
     * 1.编写程序实现乐手弹奏乐器。乐手可以弹奏不同的乐器从而发出不同的声音。
     * 可以弹奏的乐器包括二胡、钢琴和琵琶。
     *     实现思路及关键代码：
     *        1)定义乐器类Instrument，包括方法makeSound()
     *        2)定义乐器类的子类：二胡Erhu、钢琴Piano和小提琴Violin
     *        3)定义乐手类Musician，可以弹奏各种乐器play(Instrument i)
     *        4)定义测试类，给乐手不同的乐器让他弹奏
     *
     * 2.1.多态练习题
     * 编写程序模拟“主人”喂养“宠物”的场景：
     * 提示1：
     *     主人类：Master
     *     宠物类：Pet
     *     宠物类子类：Dog、Cat、YingWu
     * 提示2：
     *     主人应该有喂养的方法：feed()
     *     宠物应该有吃的方法：eat()
     *     只要主人喂宠物，宠物就吃。
     *
     * 要求：主人类中只提供一个喂养方法feed()，要求达到可以喂养各种类型的宠物。
     *
     * 编写测试程序：
     *     创建主人对象
     *     创建各种宠物对象
     *     调用主人的喂养方法feed()，喂养不同的宠物，观察执行结果。
     *
     * 通过该案例，理解多态在开发中的作用。
     * 重要提示：feed方法是否需要一个参数，参数选什么类型！！！
     * */
    //main方法
    public static void  main(String[] args){
        //主人类
        Dog dog = new Dog();
        Cat cat = new Cat();
        YingWu yingWu = new YingWu();
        Master master = new Master();
        master.feed(dog);
        master.feed(cat);
        master.feed(yingWu);
    }
}
//主人类
class Master{
    //主人有宠物
    Pet pet;
    //喂养
    public void feed( Pet pet){
        pet.eat();
    }
}
//宠物接口
interface Pet{
    void eat();
}
//狗类
class Dog implements Pet{

    @Override
    public void eat() {
        System.out.println("狗在吃饭");
    }
}
//猫类
class Cat implements Pet{

    @Override
    public void eat() {
        System.out.println("猫在吃饭");
    }
}
//鹦鹉类
class YingWu implements Pet{

    @Override
    public void eat() {
        System.out.println("鹦鹉在吃饭");
    }
}

