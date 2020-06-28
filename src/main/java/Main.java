public class Main {
    public static void main(String[] args){
        System.out.println("Hello world!");

        SomeFunctions functions = new SomeFunctions();
        String text = functions.getWelcomeText("Valera");
        String textTwo = functions.getWelcomeText("Valera Bitch");
        System.out.println(text + textTwo);

    }
}
