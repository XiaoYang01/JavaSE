package Thread;

/**
 * @Author:XiaoYang01
 * @Date:2021/1/8 22:57
 */
public class Thread02 {
    //多线程第二种实现方式，接口
    //main方法
    public static void main(String[] args){
        //newRunnable对象
        MyThread01 mtd = new MyThread01();
        //传参到Thread
        Thread th = new Thread(mtd);
        th.start();
        for (int i = 0; i <100 ; i++) {
            System.out.println("主线程==》"+i);
        }
    }
}
class MyThread01 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println("分支线程==》"+i);
        }
    }
}
