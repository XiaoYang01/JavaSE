import java.util.Scanner;

/**
 * @Author:xiaoyang01
 * @Date：2020/11/14 17:14
 */
public class Test08_2_1 {
    /**
     * 1、根据指定月份，打印该月份所属的季节。
     * 	3,4,5 春季
     * 	6,7,8 夏季
     * 	9,10,11 秋季
     * 	12, 1, 2 冬季
     *
     * 	if和switch各写一版
     *
     * 2、从键盘接收一个数字，判断该数字的正负。
     *
     * 3、从键盘接收一个数字，判断该数字的奇偶。
     *
     * 4、整数大小比较：输入两个整数，比较大小，
     * 	若x>y 输出 >
     * 	若x=y 输出 =
     * 	若x<y 输出 <
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
        Scanner scanner = new Scanner(System.in);
        System.out.println("请随机输入一个数字");
        int intValue_1 = scanner.nextInt();
        //判断奇偶：Parity
        boolean booleanValue_1 = pariy(intValue_1);
        System.out.println(booleanValue_1 == true ? "偶数" : "奇数");
    }
    //奇偶判断
    public static boolean pariy(int intValue_1){
        if(intValue_1 % 2 ==0){
            return true;
        }
        return false;
    }
}
