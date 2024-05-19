package Aufgaben_05;

public class RandomString {
    public static String RandomString(int n){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            //97-122
            sb.append(Character.valueOf((char)(Math.random()*26+97)));

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "";
        while(true){
            s = RandomString(50);
            if(s.contains("z")){
                break;
            }

        }
        System.out.println(s);
    }
}
