package oopJava.src.mid;

public class Television implements RemoteControl{
    private int channel;
    private int volume;
    boolean onOff;
    public static int count = 0;

    public Television(int channel, int volume, boolean onOff) {
        this.channel = channel;
        this.volume = volume;
        this.onOff = onOff;
        count++;
    }



    public Television(int channel, int volume) {
        this(channel, volume, true);
    }

    void print() {
        System.out.println("텔레비전 채널은 " + channel + " 이고 볼륨은 " + volume);
    }

    public String toString() {
        return "채널은 " + channel +
                ", 볼륨은 " + volume;
    }
    int getChannel() {
        return channel;
    }

    void setChannel(int ch) {
        channel = ch;
    }

    @Override
    public void turnOn() {
        onOff = true;
    }

    @Override
    public void turnOff() {
        onOff = false;
    }
}
