package Bridge;

import Bridge.Control.RemoteControlWithMuteButton;
import Bridge.Control.RemoteControle;
import Bridge.Device.Radio;
import Bridge.Device.TV;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        Radio radio = new Radio();

        RemoteControle remoteTv = new RemoteControle(tv);
        remoteTv.decreaseVolume();
        remoteTv.power();
        remoteTv.increaseVolume();
        remoteTv.increaseVolume();
        remoteTv.increaseVolume();
        remoteTv.increaseVolume();
        remoteTv.increaseVolume();
        remoteTv.decreaseVolume();
        remoteTv.decreaseVolume();
        remoteTv.decreaseVolume();
        remoteTv.increaseVolume();
        remoteTv.power();

        System.out.println("\n#######################################################");
        System.out.println("#                         RADIO                       #");
        System.out.println("#######################################################\n");

        RemoteControlWithMuteButton remoteRadio = new RemoteControlWithMuteButton(radio);

        remoteRadio.power();
        remoteRadio.increaseVolume();
        remoteRadio.power();
    }
}
