import java.util.Scanner;

/**
 * @Author:xiaoyang01
 * @Date：2020/11/13 17:47
 */
public class Test10 {
    /**
     *1、题目：一个5位数，判断它是不是回文数。即12321是回文数，
     * 个位与万位相同，十位与千位相同
     * */
    //main方法
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.println("请输入一个万回数！");
       int ints  = scanner.nextInt(); //String的length（）方法
       int intsValue = count(ints);
       System.out.println("输入的是："+intsValue+"位数");
       String stringValue = String.valueOf(ints);
        char charValue = stringValue.charAt(0);
        char charValue1 = stringValue.charAt(1);
        char charValue2 = stringValue.charAt(3);
        char charValue3 = stringValue.charAt(4);
        if(charValue == charValue3 || charValue1 == charValue2){
            System.out.println("是一个回文数！");
        }else{
            System.out.println("不是一个回文数！");
        }
    }
    
    private static int count(int ints) {
        int index=0;
        while(ints > 0){
            ints = ints/10;
            index++;
        }
        return index;
    }
}
