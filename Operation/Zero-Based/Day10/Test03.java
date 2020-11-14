import java.util.Scanner;

/**
 * @Author:xiaoyang01
 * @Date：2020/11/14 10:45
 */
public class Test10_3 {
    /**
     * 3、题目：计算 1! + 2! + 3! + 4! +... + 10!
     * 	说明：4! 表示4的阶乘。4的阶乘是：1 * 2 * 3 * 4
     *提示：for循环的嵌套使用和赋值运算符的使用！
     * */
    //main方法
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("计算范围1-100的阶乘。请输入你要计算的范围");
        int multiplyValue = scanner.nextInt();
        //给定阶乘容量
        int twoMultiplay = 0;
        //外循环1次
        while(multiplyValue >0){
            //给定一个内循循环阶乘容量，外循环一次重新为0
            int multiply = 1;
            //外循环x次，内循环x次阶乘
            for(int ml = 1; ml <= multiplyValue;ml++){
                //内循环自乘
               multiply *= ml;
            }
            //外循环求和自增
            twoMultiplay +=multiply;
            //外循环自减
            multiplyValue--;
        }
        System.out.println("阶乘和："+twoMultiplay);
    }
}
