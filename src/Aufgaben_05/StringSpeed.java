package Aufgaben_05;

public class StringSpeed {

    public static final long TESTDURATION = 5000;

    public static void SimpleConcat(){
        long timer = System.currentTimeMillis() + TESTDURATION;
        String testString = "";
        while(System.currentTimeMillis() < timer){
            testString += "x";
        }
        System.out.println("SimpleConcat: " + testString.length());
    }

    public static void StringBuilderSpeedTest(){
        long timer = System.currentTimeMillis() + TESTDURATION;
        StringBuilder sb = new StringBuilder();
        while(System.currentTimeMillis() < timer){
            sb.append("x");
        }
        System.out.println("StringBuilder: " + sb.length());
    }

    public static void StringBufferSpeedTest(){
        long timer = System.currentTimeMillis() + TESTDURATION;
        StringBuffer stringBuffer = new StringBuffer();
        while(System.currentTimeMillis() < timer){
            stringBuffer.append("x");
        }
        System.out.println("StringBuffer: " + stringBuffer.length());
    }

    public static void main(String[] args) {
        SimpleConcat();
        StringBuilderSpeedTest();
        StringBufferSpeedTest();
    }
}
