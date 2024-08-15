package Aufgaben_08;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class Konto implements Serializable {
    int kontoNr;
    double betrag;
}
