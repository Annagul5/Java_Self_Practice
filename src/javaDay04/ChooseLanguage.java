package javaDay04;

public class ChooseLanguage {
    public static void main(String[] args) {
        int selection=4;
        switch (selection){
            case 1:
                System.out.println("Hello, thank you for your call");
                break;
            case 2:
                System.out.println("Hello, thank you for your call");
                break;
            case 3:
                System.out.println("Merhaba, aradığınız için teşekkürler");
                break;
            case 4:
                System.out.println("Привет, спасибо за ваш звонок");
                break;
            case 5:
                System.out.println("Merci, pour votre appell");
                break;
            default:
                System.out.println("Invalid language number");


        }

    }
}
