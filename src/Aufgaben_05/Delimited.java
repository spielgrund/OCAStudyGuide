package Aufgaben_05;

public class Delimited {
    public static String delimitedString(String s, char start, char end){
        if(s.indexOf(start) == -1 ){
            return start + " befindet sich nicht in " + s;
        }
        if(s.indexOf(end) == -1 ){
            return end + " befindet sich nicht in " + s;
        }

        return s.substring(s.indexOf(start),s.indexOf(end)+1);
    }

    public static void main(String[] args) {
        System.out.println(delimitedString("Hallo",'H', 'l'));
    }
}
