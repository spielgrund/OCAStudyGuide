package Aufgaben_08;

import java.io.Serializable;
import java.util.Date;

abstract class Kontakt implements Serializable {
    Date timestamp;

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
    abstract String getInfo();


}
