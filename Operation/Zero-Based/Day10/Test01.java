public class Test01{
    /**
    * 5、一个四位数，恰好等于去掉它的首位数字之后所剩的三位数的3倍，这个
     * 四位数是多少？
     * 提升：从赋值运算符和数字位数考虑
     * */
  
  //main方法
  pubulic static void main(String[] args){
    //三位数起步
    int threeDigits = 000;
    //四位数起步
    int fourDigits = 1000;
    //使用两个for循环进行三位数比较实现
    for(fourDigits; fourDigits < 10000; fourDigits++){
        for(threeDigits;threeDigits < 1000; threeDigits++){
          if((threeDigits * 3) == fourDigits){
            System.out.println("这个四位数是："+fourDigits);
          }
        }
      }
    }
  
}
