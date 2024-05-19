package Aufgaben_04;

public class Person {
    private int alter;

    public Person(int alter){
        if(alter < 1 || 150 < alter){
            throw new OutOfRangeException("Alter muss zwischen 1 und 150 liegen! " + alter);
        }
        else{
            this.alter = alter;
        }
    }
}
