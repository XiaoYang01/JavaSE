//测试类
package Set;

public class SetTest05 {
    /**
     *4. 现在有一个map集合如下：
     * Map<Integer,String> map = new HashMap<Integer, String>();
     * map.put(1, "张三丰");
     * map.put(2, "周芷若");
     * map.put(3, "汪峰");
     * map.put(4, "灭绝师太");
     * 要求：
     * 	1.遍历集合，并将序号与对应人名打印。
     * 	2.向该map集合中插入一个编码为5姓名为郭靖的信息
     * 	3.移除该map中的编号为1的信息
     * 	4.将map集合中编号为2的姓名信息修改为"周林"
     * */
    public static void main(String[] args){
        MapTest01 mt = new MapTest01();
        mt.add(1, "张三丰");
        mt.add(2, "周芷若");
        mt.add(3, "汪峰");
        mt.add(4, "灭绝师太");
        System.out.println("添加的数量："+mt.size());
        mt.sort();
        System.out.println("=======================================");
        mt.add(5,"郭靖");
        mt.sort();
        System.out.println("=======================================");
        mt.remove(1);
        mt.sort();
        System.out.println("=======================================");
        mt.set(2,"周林");
        mt.sort();

    }
}
//遍历类
package Set;

import com.sun.jmx.snmp.SnmpUnknownAccContrModelException;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest01 {
    //size
    int size = 0;
    public int size(){
        return size;
    }
    //add
    //创建Map集合
    Map<Integer,String> mp = new HashMap<Integer,String>();
    public void add(Integer id, String name){
        mp.put(id,name);
        size++;
    }
    //删除数据remove
    public void remove(Integer id ){
       mp.remove(id);
    }
    //遍历
    public void sort(){
        for (int i = 1; i <= mp.size() ; i++) {
            Object obj = mp.get(i);
            System.out.println(obj);
        }
    }
    //修改数据set
    public void set(Integer id,String name){
        mp.put(id, name);
    }
}
