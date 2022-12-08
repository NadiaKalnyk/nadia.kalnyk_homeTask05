package Phone;

public abstract class Phone {
    public void makeCall (String number) { //метод з реалізацією: я здійснюю дзвінок
        System.out.println ("calling " + number);
    }

    public void receiveCall (String num) { // метод з реалізаією: я приймаю дзвінок
        System.out.println ("new call from " + num);
        }

        abstract void receiveSMS (String text); //метод без реалізації: отримали СМС
}
