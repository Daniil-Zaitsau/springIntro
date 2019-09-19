import java.text.DateFormat;
import java.util.Date;
import java.util.Random;

public class Event {
   private int id;
   private String msg;
   private Date date;
   private DateFormat dateFormat;

    public void setMsg(String msg) {
        this.msg = msg;
    }


    public Event(Date date, DateFormat dateFormat) {
        this.date = date;
        Random random = new Random();
        this.id = random.nextInt(1000);
        this.dateFormat = dateFormat;
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", msg='" + msg + '\'' +
                ", date=" + dateFormat.format(date) +
                '}';
    }
}
