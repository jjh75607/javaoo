package oopJava.src.mid;

public class TelevisionTest {
    public static void main(String[] args) {
        Television myTv = new Television(7, 9, true);
        Television myTv1 = new Television(5, 9, true);
        Television myTv2 = new Television(3, 9, true);
//        myTv.channel = 7;
//        myTv.volume = 9;
//        myTv.onOff = true;
        myTv.setChannel(12);
        int ch = myTv.getChannel();
        myTv.print();
        System.out.println("나의 " + myTv.toString());
        System.out.println(Television.count);
//        Television yourTv = new Television();
//        yourTv.channel = 9;
//        yourTv.volume = 12;
//        yourTv.onOff = false;
//        yourTv.print();

        myTv.turnOn();
        myTv.turnOff();
    }
}
