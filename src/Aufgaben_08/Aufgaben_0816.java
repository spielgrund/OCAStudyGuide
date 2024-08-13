package Aufgaben_08;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Aufgaben_0816 {

    public static void main(String[] args) {
        List<McGuffin> mcGuffinList = new ArrayList<>();
        McGuffin m1 = new McGuffin(1);
        McGuffin m2 = new McGuffin(2);
        McGuffin m3 = new McGuffin(3);

        mcGuffinList.addAll(List.of(m1,m2,m3));
        storeObjects(mcGuffinList,"mcguffins.guff");
        mcGuffinList.clear();
        mcGuffinList = restoreObjects("mcguffins.guff");
        System.out.println(mcGuffinList);
    }
    public static void storeObjects(List<McGuffin> mcGuffinList, String fileName){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            int sizeList = mcGuffinList.size();

            if (sizeList > 0){
                objectOutputStream.writeInt(sizeList);
                for(McGuffin m : mcGuffinList){
                    objectOutputStream.writeObject(m);
                }
            }
            objectOutputStream.close();
            fileOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static List<McGuffin> restoreObjects(String fileName) {
        List<McGuffin> mcGuffinList = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            int sizeList = objectInputStream.readInt();
            while(true){
                McGuffin m = (McGuffin) objectInputStream.readObject();
                mcGuffinList.add(m);
            }
        } catch (EOFException e){
            System.out.println("End of File");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return mcGuffinList;
    }
}
