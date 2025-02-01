import model.Iphone;

public class App {
    public static void main(String[] args) throws Exception {
        
        Iphone iphone = new Iphone();

        iphone.turnOn();
        iphone.restart();

        System.out.println();

        iphone.musicPlayer();
        iphone.videoPlayer();

        System.out.println();

        iphone.call();
        iphone.sendTextMessage();
        iphone.acceptCall();
        iphone.rejectCall();
        iphone.putCallOnWait();

        System.out.println();

        iphone.navigate();

        System.out.println();

        iphone.installApp();
        iphone.removeApp();
        iphone.updateApp();
        iphone.openApp();
        iphone.closeApp();

        System.out.println();

        iphone.record();
        iphone.takePicture();
        iphone.openGallery();

        System.out.println();

        iphone.turnOff();

    }
}
