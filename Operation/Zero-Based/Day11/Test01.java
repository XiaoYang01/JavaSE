import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

/**
 * @Author:xiaoyang01
 * @Date：2020/11/18 15:11
 */
public class Test11_2 {
    /**
     * 1、编写一个方法，求整数n的阶乘，例如5的阶乘是1*2*3*4*5
     * 思考：这个方法应该起什么名字，这个方法的形参是什么，方法的返回值类型是什么。
     *
     * 2、编写一个方法，输出大于某个正整数n的最小的质数。
     * 思考：这个方法应该起什么名字，这个方法的形参是什么，方法的返回值类型是什么。
     *
     * 3、画出以下程序运行过程的内存图
     *
     * public class Test{
     *  public static void main(String[] args){
     *   int a = 100;
     *   int b = 200;
     *   int retValue = m1(a, b);
     *   System.out.println(retValue);
     *  }
     *  public static int m1(int x, int y){
     *   int k = x * 10;
     *   int m = y * 10;
     *   int result = m2(k, m);
     *   return result;
     *  }
     *  public static int m2(int c, int d){
     *   int e = c / 2;
     *   int f = d / 2;
     *   int i = e + f;
     *   return i;
     *  }
     * }
     * */
    //main方法
    public static void main(String[] args){
        primeNumber();
    }
    private static void primeNumber() {
        Scanner scannr =new Scanner(System.in);
        System.out.println("请输入数组大小：");
        int ints_1 = scannr.nextInt();
        System.out.println("请输入一个正整数：");
        int ints_2 = scannr.nextInt();
        int [] ints = new int[ints_1];
        int index = 0;
        int index_1 = 0;
        for (int i = 1; i < ints_1+1 ; i++) {
            for (int j = 2; j < i ; j++) {
                if(i % j == 0){
                    i++;
                }
            }
            ints[index] = i;
            index++;
        }
        while(index_1 < ints_1){
            if(ints[index_1] > ints_2){
                System.out.println(ints[index_1]+"是大于正整数"+ints_2+"最小的质数");
                return;
            }
            index_1++;
        }
    }

}
