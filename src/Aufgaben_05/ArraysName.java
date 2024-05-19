package Aufgaben_05;

public class ArraysName {
    public static void main(String[] args) {
        int[] intArr = new int[1];
        System.out.println(intArr.getClass());
        double[] doubleArr = new double[1];
        Class c = intArr.getClass();
        String classNameOfArray = c.getName();

        System.out.println(classNameOfArray);
        System.out.println(doubleArr.getClass());
        String[] stringArr = new String[1];

        System.out.println(stringArr.getClass());
    }
}
