import java.util.Scanner;

/**
 * @Author:XiaoYang01
 * @Date:2020/11/17 21:47
 */
public class Test08 {
    /**
     * 1、计算1000以内所有不能被7整除的整数之和
     *
     * 2、计算 1+2-3+4-5+6-7....+100的结果
     *
     * 3、从控制台输入一个正整数，计算该数的阶乘。例如输入5，阶乘为 5*4*3*2*1
     *
     * 4、从控制台接收一个正整数，判断该数字是否为质数
     * 质数（质数是指在大于1的自然数中，除了1和它本身以外不再有其他因数的自然数）
     *
     * 5、从键盘接收一个正整数，该正整数作为行数，输出以下图形
     *     *
     *    ***
     *   *****
     *  *******
     * *********
     * 例如：输入5，则打印如上图5行。
     *
     * 6、小芳的妈妈每天给她2.5元钱，她都会存起来，但是，每当这一天是存钱的第5天
     * 或者5的倍数的话，她都会花去6元钱，请问，经过多少天，小芳才可以存到100元钱。
     *
     * 7、一个数如果恰好等于它的因子之和，这个数就是完数，例如 6 = 1 + 2 + 3，编程
     * 找出1000内所有的完数。
     *
     * 8、给一个不多于5位的正整数，
     * 要求：
     * 一、求它是几位数
     * 二、逆序打印出各位数字
     * */
    //main方法
    public static void main(String[] args){
        sum();
    }
    public static void sum(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个1-5位的正整数：");
        int value = scanner.nextInt();
        //求它是几位数
        int index = count(value);
        System.out.println("输入的是："+index +"位数");
        //逆序打印出各位数字
        printlnTest01(value);
    }
    public static int count(int value){
        int index = 0;
        while(value > 0){
            value /= 10;
            index++;
        }
        return index;
    }
    //逆序打印出各位数字
    public static int printlnTest01(int value){
        String s1 = String.valueOf(value);
        byte [] bytes = s1.getBytes();
        for (int i = bytes.length-1; i >=0 ; i--) {
            System.out.println("逆顺序输出："+bytes[i]);
        }
        return 1;
    }
}
