package enumeration;

public class EnumDemo {

    public static void main(String[] args){
        //直接引用
        Day day =Day.MONDAY;
        System.out.println(day);
        System.out.println(Day.MONDAY);
    }

}
//定义枚举类型
enum Day {
    MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY, SUNDAY
}