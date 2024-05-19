package Aufgaben_04;

public class ZufallsZahl {
    public static void main(String[] args) throws Exception {
        while(true){
            int i = (int) (Math.random() * 100);
            System.out.println(i);
            if(i==0){
                throw new Exception();
            }
        }
    }
}
