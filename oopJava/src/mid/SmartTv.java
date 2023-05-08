package oopJava.src.mid;

public class SmartTv extends Television{
    private String youtubeId;

    public SmartTv(int channel, int volume, boolean onOff) {
        super(channel, volume, onOff);
    }

    public SmartTv(int channel, int volume, String youtubeId) {
        super(channel, volume);
        this.youtubeId = youtubeId;
    }

    public SmartTv(int channel, int volume) {
        super(channel, volume);
    }
}
