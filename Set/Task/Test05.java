//测试类
/**
 * @Author:XiaoYang01
 * @Date:2020/12/21 21:22
 */
public class SetTest05 {
    /**
     * 5.有2个数组，第一个数组内容为：[黑龙江省,浙江省,江西省,广东省,福建省]，
     * 第二个数组为：[哈尔滨,杭州,南昌,广州,福州]，
     * 将第一个数组元素作为key，第二个数组元素作为value存储到Map集合中。
     * 如{黑龙江省=哈尔滨, 浙江省=杭州, …}
     * */
    //main方法
    public static void main(String[] args){
        MapTest01 mt = new MapTest01();
        mt.add();
        mt.sort();
    }
}
//遍历类
import java.util.HashMap;
import java.util.Map;

/**
 * @Author:XiaoYang01
 * @Date:2020/12/21 21:24
 */
public class MapTest01 {
    //添加方法add
    //创建hashMap对象
    Map map = new HashMap();
    String [] s1 = {"黑龙江省","浙江省","江西省","广东省","福建省"};
    String [] s2 = {"哈尔滨","杭州","南昌","广州","福州"};
    public void add(){
        //System.out.println(s1[1]);
        //赋值循环
        //map.put(s1, s2);
        int i = 0;
        while(i < s1.length){
            map.put(s1[i],s2[i]);
            i++;
        }
    }
    //遍历sort
    public void sort(){
        //获取存储的个数
        System.out.println(map.size());
        //获取存储的key
        System.out.println(map.keySet());
        //获取存储的value
        System.out.println(map.values());
        int j = 0;
        for (String i : s1) {
            Object obj = map.get(i);
            System.out.println(s1[j]+"="+obj);
            j++;
        }
    }

}
