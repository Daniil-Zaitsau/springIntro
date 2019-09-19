import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    private Client client;
    private ConsoleEventLogger eventLogger;

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        App app = (App) context.getBean("app");
        app.logEvent("Some event for 1");
    }

    public App(Client client, ConsoleEventLogger eventLogger) {
        this.client = client;
        this.eventLogger = eventLogger;
    }

    private void logEvent(String msg){
        String message = msg.replaceAll(client.getId(), client.getName());
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Event event = (Event) context.getBean("event");
//        eventLogger.logEvent(message);
        eventLogger.logEvent(event);
    }
}
