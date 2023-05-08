package oopJava.src.mid;

public interface RemoteControl {
    public void turnOn();
    public void turnOff();


    //추상클래스 : A,B,C 클래스 깐에 비슷한 필드와 메서드를 공통적으로 추출해 만듬
    //객체 생성 X

    //인터페이스 : 클래스를 작성할때 기본이 되는 틀을 제공하며, 클래스 사이의 매개 역할
    //추상 클래스는 메소드, 생성자, 필드등이 가능하지만 인터페이스는 메소드와 상수만 포함 가능
    //생성자 X 오버라이딩 필수

}

class Atest {
    public static void main(String[] args) {
        RemoteControl ac = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("까능");
            }

            @Override
            public void turnOff() {
                System.out.println("가ㅏ능");
            }
        };
        ac.turnOff();
    }
}