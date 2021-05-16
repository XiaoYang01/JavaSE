package Thread;

/**
 * @Author:XiaoYang01
 * @Date: 2021/1/21 @Week: 星期四
 * Package: JavaSE
 * java多线程模拟实现12306售票
 * 业务描述
 * 	假设有200张票，用4个线程去订票，不能有两个或者以上的线程订到了
 * 	同一个票（原因就不说了），当最后一张票卖掉的时候结束，再订就抛
 * 	异常提示出票卖完了。
 * 业务分析,要实现以上功能，
 * 	1、需要创建一个车票类，初始化票，卖票的接口saleTicket()
 * 	2、自定义异常的一个类。
 * 	3、创建卖票线程类，在run方法中卖车票。
 * 	4、初始化车票的线程,负责初始化车票,也就是初始化Ticket类中的数组。
 * 	5、创建主方法进行测试。
 */
public class Thread07 {
    public static void main(String[] args){
        //创建车票对象
        Ticket ticket = new Ticket();
        //创建多线程对象
        Thread t1 = new Thread(new SaleTicket(ticket));
        Thread t2 = new Thread(new SaleTicket(ticket));
        Thread t3 = new Thread(new SaleTicket(ticket));
        Thread t4 = new Thread(new SaleTicket(ticket));
        //线程改名
        t1.setName("售票窗口一");
        t2.setName("售票窗口二");
        t3.setName("售票窗口三");
        t4.setName("售票窗口四");
        //启动线程
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
//车票对象
class Ticket{
    int ticket;
    //构造器

    public Ticket(int ticket) {
        this.ticket = ticket;
    }

    public Ticket() {
        ticket = 200;
    }
    //set,get

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    public int getTicket() {
        return ticket;
    }
}
//销售线程
class SaleTicket implements Runnable{
    //车票的引用
    Ticket ticket;
    //构造器

    public SaleTicket() {
    }

    public SaleTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public void run() {
        for (int i = 0; i < 200 ; i++) {
            synchronized(ticket){
                //获取车票数
                int index = ticket.getTicket();
                //售卖控制
                if(index == 0) {
                    try {
                        throw new TicketException(Thread.currentThread().getName()+"车票售卖完了！");
                    } catch (TicketException e) {
                        e.printStackTrace();
                        return;
                    }
                }
                //模拟网络延迟
              /*  try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
                //票数减少
                index--;
                //更新票数
                ticket.setTicket(index);
                //打印
                System.out.println(Thread.currentThread().getName()+"成功售卖出一张，目前剩余："+ticket.getTicket());
            }
        }
    }
}
//自定义异常
class TicketException extends Exception{
    public TicketException() {
    }

    public TicketException(String message) {
        super(message);
    }
}
