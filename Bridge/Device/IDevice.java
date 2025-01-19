package Bridge.Device;

public interface IDevice {
    int getVolume();
    void setVolume(int volume);
    boolean getPower();
    void setPower(boolean power);
}
