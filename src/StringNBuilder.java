public class StringNBuilder {
    static String string = "";
    public static void main(String[] args) {

        string = string.concat("Hello");
        System.out.println(string);
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);
        sb.append("1234",1,2);
        System.out.println(sb);
        sb.insert(0,"insert");
        sb.insert(sb.length(),"outer");
        System.out.println(sb);
        

    }
}
