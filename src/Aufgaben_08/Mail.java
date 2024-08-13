package Aufgaben_08;

public class Mail extends Kontakt{
    String mailAdresse;

    public Mail(String mailAdresse){
        this.mailAdresse = mailAdresse;
    }

    public String getMailAdresse(){
        return mailAdresse;
    }

    public void setMailadresse(String mailAdresse){
        this.mailAdresse = mailAdresse;
    }

    public String getInfo(){
        return mailAdresse;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "mailAdresse='" + mailAdresse + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
