public abstract class FunctionalInterface1 implements Message {
    public static void main(String[] args) {
        Message msg=()-> System.out.println("msg");

        Message msg2=()-> System.out.println("msg -123");
        msg.showMessages();
        msg2.showMessages();
    }

}
interface Message{
    void showMessages();
}