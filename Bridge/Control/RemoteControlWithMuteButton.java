package Bridge.Control;

import Bridge.Device.Device;

public class RemoteControlWithMuteButton extends RemoteControle {
    public RemoteControlWithMuteButton(Device device) {
        super(device);
    }

    public void mute() {
        super.device.setVolume(0);
    }
}
