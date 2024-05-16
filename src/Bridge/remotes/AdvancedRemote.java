package Bridge.remotes;

import Bridge.devices.Device;

public class AdvancedRemote extends BasicRemote{
    public AdvancedRemote(Device device){
        super.device = device;
    }

    public void mute(){
        System.out.println("remot: mute");
        device.setVolume(0);
    }
}
