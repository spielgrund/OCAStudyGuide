package Aufgaben_06;

public class ZahlenPaar extends Paar <Number, Number>{

public double sum(){
    return getValue1().doubleValue()+ getValue2().doubleValue();
}
//    double doubleValue(){
//        return super.getValue1().doubleValue();
//    }
    public void print(){
        System.out.println("(" + this.getValue1() + "," + this.getValue2() + ")");
    }

}
