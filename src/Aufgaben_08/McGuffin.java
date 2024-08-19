package Aufgaben_08;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
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
