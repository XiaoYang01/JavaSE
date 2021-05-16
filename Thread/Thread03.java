package Thread;

/**
 * @Author:XiaoYang01
 * @Date:2021/1/12 21:46
 * 线程调度测试
 */
public class Thread04 {
    //main方法
    public static void main(String[] args){
        MyThread04 mt = new MyThread04();
        //线程改名
        mt.setName("mt");
        //启动线程
        mt.start();
        //结束睡眠
        mt.interrupt();
        //线程调度实现——优先级
       /* System.out.println("默认线程优先级："+mt.getName()+mt.NORM_PRIORITY);
        System.out.println("最大线程优先级："+mt.getName()+mt.MAX_PRIORITY);
        System.out.println("最小线程优先级："+mt.getName()+mt.MIN_PRIORITY);*//*
        mt.setPriority(10);
        Thread.currentThread().setPriority(1);*/
        //线程调度——线程让位yield
        //Thread.yield();
        //线程调度——线程合并
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程："+Thread.currentThread().getName()+"==>"+i);
        }
    }
}
//线程
class MyThread04 extends Thread{
    public void run(){
        try {
            Thread.currentThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //分支线程沉睡5s
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("分支线程："+Thread.currentThread().getName()+"==>"+i);
        }
    }
}
