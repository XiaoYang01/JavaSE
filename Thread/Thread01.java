package Thread;

/**
 * @Author:XiaoYang01
 * @Date:2021/1/8 21:57
 */
public class Thread01 {
    /*
    * 多线程的实现
    * 两种方法：
    *   第一种：继承extends，JavaLang包下的Thread（abstract）重写run方法
    *   第二种：实现imlements，Runnable接口，实现run方法，传参给Thread，start()方法，启动多线程！
    * */
    //main方法
    public static void main(String[] args){
        MyThread mt = new MyThread();
        //启动多线程
        mt.start();
        for (int i = 0; i < 100 ; i++) {
            System.out.println("主线程==》"+i);
        }
    }
}
class MyThread extends Thread{
    public void run(){
        for (int i = 0; i < 100 ; i++) {
            System.out.println("分支线程==》"+i);
        }
    }
}

