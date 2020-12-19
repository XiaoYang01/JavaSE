package Set;

public class SetTest02 {
    /*
    * 1.产生10个1-100的随机数，并放到一个数组中，
    * 把数组中大于等于10的数字放到一个list集合中，并打印到控制台。
    * */
    //main方法
    public static void main(String [] args){
        //创建SetCount01对象
        SetCount01 setCount01 = new SetCount01();
        setCount01.count(10);
    }
}

//类SetCount01
package Set;

import java.util.LinkedList;
import java.util.Random;

public class SetCount01 {
    //计数
    public void count(int i){
        //创建一个int数组
        int [] intArray = new int[i];
        //导包，创建随机数
        Random random = new Random();
        //创建一个集合
        LinkedList  linkedList = new LinkedList();
       for (int j = 0; j < intArray.length; j++) {
            int ints = random.nextInt(100);
            intArray[j] = ints;
            //创建list集合
           if(intArray[j] >= 10){
               //把数据内的数据存储到集合内
               int a = intArray[j];
               linkedList.add(a);
           }
        }
        for (int j = 0; j < linkedList.size(); j++) {
            System.out.println(linkedList.get(j)+"存储成功");
        }
    }
}
