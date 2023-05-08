package oopJava.src.mid;

public class ObjectTest {

    public static void main(String[] args) {
        Car c1 = new Car();

        System.out.println(c1.getClass());//클래스 정보
        System.out.println(c1.equals(new Car()));//같은지
        System.out.println(c1.hashCode());//해쉬코드반환
        System.out.println(c1.toString());//문자열정보
        //c1.finalize();//사여ㅛㅇ하지 않는 객체

    }
}
