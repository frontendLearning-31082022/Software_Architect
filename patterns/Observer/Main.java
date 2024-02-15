public class Main {

    public static void main(String[] args) {
        Subject subject=new Subject();
        subject.start();

        SubscriberA subscriber=new SubscriberA(subject);
        subscriber.start();
    }
}
