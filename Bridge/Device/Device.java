package Bridge.Device;

public class Device implements IDevice {
    private int volume;
    private boolean power;
    protected String nome;

    public Device() {
        this.volume = 10;
        this.power = false;
        this.nome = Device.class.getSimpleName();
    }

    @Override
    public boolean getPower() {
        return power;
    }

    @Override
    public void setPower(boolean power) {
        this.power = power;
        String powerStatus = this.power ? "ON" : "OFF";

        System.out.println(this.nome + " is now " + powerStatus + '.');
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        boolean isPower = this.power;
        if (!isPower) {
            System.out.println("Please turn " + this.nome + " ON.");
            return;
        }

        if (this.volume > 100) {
            System.out.println("Max volume.");
            return;
        }

        if (this.volume < 0) {
            System.out.println("Min volume.");
            return;
        }

        this.volume = volume;
        System.out.println("Volume is now " + this.volume);
    }
}
