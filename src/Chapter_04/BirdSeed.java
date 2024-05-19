package Chapter_04;

public class BirdSeed {
    private int numberBags;
    boolean call;

    public BirdSeed() {
        this(2);
        call = false;
        //Line 2
    }
    public BirdSeed(int numberBags){
        this.numberBags = numberBags;
    }

    public static void main(String[] args) {
        BirdSeed seed = new BirdSeed();
        System.out.println(seed.numberBags);
    }
}
