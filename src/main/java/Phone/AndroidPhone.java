package Phone;

public class AndroidPhone extends Phone implements InterfaceListening,InterfaceFilming {
    @Override
    void receiveSMS (String text) {
        System.out.println("Receive SMS on AndroidPhone" + text);
    }

    public void listenToTrack (String track) {
        System.out.println("listen to " + track + "on Android");
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
