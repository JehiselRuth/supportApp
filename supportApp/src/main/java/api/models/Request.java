package api.models;

public class Request {
    private String name;
    private int date;
    private String event;
    private String description;

    

    

    public Request(String name, int date, String event, String description) {
        this.name = name;
        this.date = date;
        this.event = event;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getdate() {
        return date;
    }

    public void setdate(int date) {
        this.date = date;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "request [name=" + name + ", date=" + date + ", event=" + event + ", description=" + description + "]";
    }

  

}
