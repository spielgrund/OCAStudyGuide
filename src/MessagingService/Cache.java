package MessagingService;

import java.util.ArrayList;
import java.util.List;

public class Cache {
    private List<MessagingService> services = new ArrayList<>();

    public MessagingService getService(String serviceName) {
        // retrieve from the list
        for(MessagingService ms : services){
            if(services.equals(ms.getServiceName())){
                return ms;
            }
        }
        return null;
    }

    public void addService(MessagingService newService) {
        // add to the list
        services.add(newService);
    }
}

