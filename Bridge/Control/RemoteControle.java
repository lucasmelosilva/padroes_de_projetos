package Bridge.Control;

import Bridge.Device.Device;

public class RemoteControle implements IRemoteControl {
    protected Device device;

    public RemoteControle(Device device) {
        this.device = device;
    }

    private int currentVolume() {
        return this.device.getVolume();
    }

    private boolean currentStatusPower() {
        return this.device.getPower();
    }

    @Override
    public void increaseVolume() {
        this.device.setVolume(this.currentVolume() + 10);
    }

    @Override
    public void decreaseVolume() {
        this.device.setVolume(this.currentVolume() - 10);
    }

    @Override
    public void power() {
        this.device.setPower(!this.currentStatusPower());
    }
}
