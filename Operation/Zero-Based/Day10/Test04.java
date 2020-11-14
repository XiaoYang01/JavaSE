import java.util.Scanner;

/**
 * @Author:xiaoyang01
 * @Date：2020/11/14 9:32
 */
public class Test10_2 {
    /**
     * 2、题目：猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，
     * 还不瘾，又多吃了一个。第二天早上又将剩下的桃子吃掉一半，又多吃了
     * 一个。以后每天早上都吃了前一天剩下的一半零一个。到第10天早上
     * 想再吃时，只剩下一个桃子了。求第一天共摘了多少
     *提示，逆推最后一天的数量，赋值运算符的使用
     * */
    //main方法
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("您想吃几天！");
        int fiveValue = scanner.nextInt();
        int endsValue = 1;
        while(fiveValue > 0){
            endsValue = (endsValue+1)*2;
            fiveValue--;
        }
        System.out.println("猴子摘了："+endsValue+"桃子");
    }
}
