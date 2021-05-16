//测试类
package Set;

public class SetTest03 {
    /**
     * 2.已知数组存放一批QQ号码，QQ号码最长为11位，
     * 最短为5位String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"}。
     * 将该数组里面的所有qq号都存放在LinkedList中，将list中重复元素删除，将list中所有元素分别用迭代器和增强for循环打印出来。
     * */
    //main方法
    public static void main(String[] args){
        SetCount02 sct = new SetCount02();
        sct.SetCount();
        System.out.println("计数："+sct.size());
    }
}
//遍历类
package Set;

import java.util.Iterator;
import java.util.LinkedList;

public class SetCount02 {
    /**
     * 2.已知数组存放一批QQ号码，QQ号码最长为11位，
     * 最短为5位String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"}。
     * 将该数组里面的所有qq号都存放在LinkedList中，将list中重复元素删除，将list中所有元素分别用迭代器和增强for循环打印出来。
     * */
    //计数
    int size;
    public int size(){
        return size;
    }
    //SetCount计数遍历
    public void SetCount(){
        //创建String数组
        String [] str = {"12345","67891","12347809933","98765432102","67891","12347809933"};
        //创建LinkedList集合
        LinkedList<Object> linkedList = new LinkedList<>();
        for (int i = 0; i <str.length ; i++) {
            linkedList.add(str[i]);
            size++;
        }
        //进行去重
        for (int j = 0; j < linkedList.size() ; j++) {
            Object obj = linkedList.get(j);
            for (int k = j+1; k < linkedList.size() ; k++) {
                Object ob = linkedList.get(k);
                if(obj == ob){
                    linkedList.remove(k);
                }
            }
        }
        //创建LinkedList集合的迭代器
        //Iterator it = linkedList.iterator();
        for ( Iterator it = linkedList.iterator();it.hasNext();){
            Object oj = it.next();
            System.out.println("筛选结果如下："+oj);
        }
    }
}

