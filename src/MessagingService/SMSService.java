package MessagingService;

public class SMSService implements MessagingService {

    public String getMessageBody() {
        return "SMS message";
    }

    public String getServiceName() {
        return "SMSService";
    }
}
