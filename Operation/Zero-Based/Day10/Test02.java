/**
* 4、题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半再落下，
* 求它在第10次落地时，共经过多少米
*提示：考虑每次落地高度的变化与赋值运算符的使用
*/
public class Test02{
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
     System.out.println("请输入落地页次数：");
     int ints = scanner.nextInt();
     double int_1 = 100;
     double int_2 = 0;
    for(int a = 0;a<ints;a++){
        int_2 +=int_1+(int_1/2);
        int_1 = int_1/2;
    }

}
