//测试类
/**
 * @Author:XiaoYang01
 * @Date:2020/12/22 21:36
 */
public class SetTest06 {
    /**
     * 6.定义一个泛型为String类型的List集合，统计该集合中每个字符
     * （注意，不是字符串）出现的次数。例如：集合中有”abc”、”bcd”两个元素，
     * 程序最终输出结果为：“a = 1,b = 2,c = 2,d = 1”。
     * */
    //main方法
    public static void main(String[] args){
        SortSet06 sst = new SortSet06();
        sst.add("abc");
        sst.add("bcd");
        sst.size();
        sst.sort();
    }
}

//遍历类
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @Author:XiaoYang01
 * @Date:2020/12/22 21:47
 */
public class SortSet06 {
    //size
    int size = 0;
    public int size(){
        return size;
    }
    //add
    //创建List集合
    List<String> list = new ArrayList<String>();
    public void add(String value){
        list.add(value);
        size++;
    }
    //sort
    public void sort(){
        //Collections工具类
        Collections.sort(list);
        //迭代器
        Iterator it = list.iterator();
        //遍历计数
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        while(it.hasNext()){
            String s = (String) it.next();
            //下标遍历
            for (int i = 0; i < 3 ; i++) {
                char c1 = s.charAt(i);
                String s1 = String.valueOf(c1);
                //System.out.println(s1);
                if(s1.equals("a")){
                    a++;
                }else if(s1.equals("b")){
                    b++;
                }else if(s1.equals("c")){
                    c++;
                }else if(s1.equals("d")){
                    d++;
                }
            }
        }
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("d="+d);
    }
}
