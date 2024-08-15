package Aufgaben_08;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@ToString
@Getter
@Setter
@AllArgsConstructor
public class Kunde implements Serializable {

    String Name;
    String Adresse;
    Konto konto;

}
