package Bridge.devices;

public class Tv implements Device{
    private boolean on = false;
    private int volume = 30;
    private int channel = 3;

    @Override
    public boolean isEnabled() {
        return this.on;
    }

    @Override
    public void enable() {
        this.on = true;
    }

    @Override
    public void disable() {
        this.on = false;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public void setVolume(int percent) {
        if(percent >= 0 && percent <= 100){
            this.volume = percent;
        }else if(percent < 0){
            this.volume = 0;
        }else{
            this.volume = 100;
        }
    }

    @Override
    public int getChannel() {
        return this.channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public void printStatus() {
        System.out.println("Device:Tv,Turned:"+this.on+",Volume:"+this.volume+",Channel:"+this.channel);
    }
}
