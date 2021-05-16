import java.util.Scanner;

/**
 * @Author:XiaoYang01
 * @Date:2020/11/15 18:46
 */
public class Test05 {
    /**
     * 1、根据指定月份，打印该月份所属的季节。
     *     3,4,5 春季
     *     6,7,8 夏季
     *     9,10,11 秋季
     *     12, 1, 2 冬季
     *
     *     if和switch各写一版
     *
     * 2、从键盘接收一个数字，判断该数字的正负。
     *
     * 3、从键盘接收一个数字，判断该数字的奇偶。
     *
     * 4、整数大小比较：输入两个整数，比较大小，
     *     若x>y 输出 >
     *     若x=y 输出 =
     *     若x<y 输出 <
     *
     * 5、编写程序，由键盘输入三个整数分别存入变量num1,num2,num3中，对它们进行排序，
     * 使用if-else结构，并按从小到大的顺序输出
     *
     * 6、打车起步价8元（3KM以内）
     * 超过3KM，超出的每公里1.2元
     * 超过5KM，超出的每公里1.5元
     * 请在键盘上接收公里数，得出总价。
     * */
    //main方法
    public static void main(String[] args){
        boolean booleanValue = true;
        Scanner scanner = new Scanner(System.in);
        while(booleanValue){
            System.out.println("欢迎使用打车系统！");
            System.out.println("打车：1");
            System.out.println("退出打车系统：2");
            int value = scanner.nextInt();
            if(value == 1 ){
                //Take a taxi
                double doubleValue = takeATaxi();
                if(doubleValue == 0){
                    System.out.println("计算有误");
                }else {
                    System.out.println("车费：" + doubleValue);
                }
            }else if(value == 2){
                System.out.println("已经退出了打车系统！");
                return;
            }
        }
    }
    public static double takeATaxi(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入行车路程");
        double doubleValue = scanner.nextDouble();
        double cost = 8.0;
        double journey = 3.0;
        if(doubleValue <= journey){
            return cost;
        }if(doubleValue > journey && doubleValue <= 5){
            doubleValue -= journey;
            return (doubleValue * 1.2)+cost;
        }if(doubleValue > 5){
            doubleValue -=journey;
            return (doubleValue * 1.5) + cost;
        }
        return 0;
    }
}
