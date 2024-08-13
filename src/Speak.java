

public class Speak {
    public static void main(String[] args) {
        Speak s = new GoodSpeak();

        //((Tone)s).up();
        ((GoodSpeak) s).up();


    }
}
class GoodSpeak extends Speak implements Tone{
    public void up(){
        System.out.println("UP UP UP");
    }
}
interface Tone{
    void up();
}