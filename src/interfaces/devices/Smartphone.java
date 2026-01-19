package interfaces.devices;

public class Smartphone implements Camera, MusicPlayer, Phone {
    @Override
    public void clickPhoto() {
        System.out.println("Photo clicked");
    }

    @Override
    public void playMusic() {
        System.out.println("Play music");
    }

    @Override
    public void makeCall() {
        System.out.println("made a call");
    }
}
