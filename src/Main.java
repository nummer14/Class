class Car {
    String brand;
    int year;
    // 필드 추가하기
    String MBTI;
    public void displayInfo() {
        System.out.println("안녕하세요. 저는 " + name + "입니다. 저의 나이는 " + age + "살입니다." + "저의 MBTI는 " + MBTI + "입니다.");
    }
    public void work() {
        System.out.println("일하는 중...");
    }
}
public class Main {
    public static void main(String[] args) {
        Person person = new Person();  // 객체 또는 instance

        person.name = "앨리스";
        person.age = 25;
        person.MBTI = "ENFP";
        person.sayHello();
        person.work();
    }
}