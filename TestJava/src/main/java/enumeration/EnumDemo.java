package enumeration;

public class EnumDemo {

    public static void main(String[] args){
        //ֱ������
        Day day =Day.MONDAY;
        System.out.println(day);
        System.out.println(Day.MONDAY);
    }

}
//����ö������
enum Day {
    MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY, SUNDAY
}