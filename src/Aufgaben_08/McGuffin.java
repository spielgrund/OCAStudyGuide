package Aufgaben_08;

import java.io.Serializable;

public class McGuffin implements Serializable {
    private int id;
    public McGuffin(int id){
        this.id = id;
    }

    @Override
    public String toString() {
        return "McGuffin{" +
                "id=" + id +
                '}';
    }
}
