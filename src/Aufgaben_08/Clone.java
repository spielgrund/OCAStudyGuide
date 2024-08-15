package Aufgaben_08;

import java.io.*;

public class Clone {

    public static <T extends Serializable> T clone(T obj) {
        T result = null;
        byte[] bytes = null;

        try (ByteArrayOutputStream bytesOutput = new ByteArrayOutputStream();
             ObjectOutputStream objectOutput = new ObjectOutputStream(
                     bytesOutput)) {
            objectOutput.writeObject(obj);
            objectOutput.flush();
            bytes = bytesOutput.toByteArray();
        } catch (IOException e) {
            System.err.println(e);
        }

        try (ByteArrayInputStream bytesInput = new ByteArrayInputStream(bytes);
             ObjectInputStream objectInput = new ObjectInputStream(
                     bytesInput)) {
            result = (T) objectInput.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println(e);
        }

        return result;
    }
}

