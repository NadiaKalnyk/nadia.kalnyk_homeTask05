package Phone;

public class IPhone extends Phone implements InterfaceFilming,InterfaceListening {
    @Override
    void receiveSMS (String text) {
        System.out.println("Receive SMS on IPhone" + text);
    }

    public void listenToTrack(String track) {
        System.out.println("listen to " + track + "on IPhone");
    }

    @Override
    public void makePhoto() {

    }

    @Override
    public void makeVideo() {

    }

    @Override
    public void listenToPodcast() {

    }
}
