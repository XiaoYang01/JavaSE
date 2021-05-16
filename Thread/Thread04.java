package Thread;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:XiaoYang01
 * @Date:2021/1/17 17:57
 * 生产与消费者模式，同一个容器，两个线程，一个锁
 */
public class Thread06 {
    //main方法
    public static void main(String[] args){
        //创建数组对象
        List<String> lst = new ArrayList<>();
        //创建生产，消费线程
        Thread t1 = new Thread(new Produce(lst));
        Thread t2 = new Thread(new Consumption(lst));
        //线程改名
        t1.setName("生产线程");
        t2.setName("消费线程");
        //线程启动
        t1.start();
        t2.start();
    }
}
//创建线程
class Produce implements Runnable{
    //数组对象的引用
    List lst;
    //构造方法
    public Produce(List lst){
        this.lst = lst;
    }
    @Override
    public void run() {
        while (true) {
            synchronized (lst) {
                //不为空
                if (lst.size() > 0) {
                    //等待消费
                    try {
                        lst.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //为空
                Object obj = lst.add("王文杰");
                System.out.println(Thread.currentThread().getName() + obj);
                //启动
                lst.notify();
            }
        }
    }
}
//消费线程
class Consumption implements Runnable{
    //数组对象的引用
    List lst;
    //构造方法
    public Consumption(List lst){
        this.lst = lst;
    }
    @Override
    public void run() {
        while(true){
            synchronized (lst){
                //为空
                if(lst.size() == 0){
                    try {
                        lst.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //不为空
                Object obj = lst.remove(0);
                System.out.println(Thread.currentThread().getName()+obj);
                //启动
                lst.notify();
            }
        }
    }
}
