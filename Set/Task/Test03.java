package Set;

public class SetTest04 {
    /**
     * 3.分别用Comparable和Comparator两个接口对下列四位同学的成绩做降序排序，如果成绩一样，
     * 那在成绩排序的基础上按照年龄由小到大排序。
     * 姓名（String）年龄（int）分数（float）
     * liusan			20				90.0F
     * lisi				22				90.0F
     * wangwu			20				99.0F
     * sunliu			22				100.0F
     *
     * 编写一个Student类用来实现Comparable<Student>接口,并在其中重写CompareTo(Student o)方法　
     * 在主函数中使用Comparable 与 Comparetor分别对ArrayList进行排序.
     * */
    //main方法
    public static void main(String[] args){
        SetSort01 sdt = new SetSort01();
        sdt.add("liusan",20,90.0F);
        sdt.add("lisi"	,22,90.0F);
        sdt.add("wangwu",20,99.0F);
        sdt.add("sunliu",22,100.0F);
        //sdt.add();
        System.out.println("添加了"+sdt.size());
        sdt.sort();
    }
}
//遍历类
package Set;

import java.util.*;

public class SetSort01 {
    Student student;
    //计数
    int size = 0;
    public int size(){
        return size;
    }
    //添加
    //创建TreeMap数组
    ArrayList tmp = new ArrayList();
    public void add(String name , int age , float fraction){
        tmp.add(new Student(name,age,fraction));
        size++;
    }
    //遍历
    public void sort(){
        //传入工具类！
        Collections.sort(tmp);
        Iterator it = tmp.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}

//Student类
package Set;

import java.util.Comparator;

public class Student implements Comparable<Student>{
    String name;
    int age;
    float fraction;

    public Student(String name, int age, float fraction) {
        this.name = name;
        this.age = age;
        this.fraction = fraction;
    }

    public Student() {
    }

   @Override
    public String toString(){
        return "name="+name+" "+"age="+age+" "+"fraction="+fraction;
   }

    @Override
    public int compareTo(Student o) {
       if(this.fraction == o.fraction){
           return this.age - o.age;
       }
       return (int) (this.fraction - o.fraction);
    }
}
