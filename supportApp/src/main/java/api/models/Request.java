package api.models;

import java.sql.Statement;

import com.mysql.cj.MysqlConnection;

import api.repositories.mysql.MysqlConnexion;

public class Request {
    private String name;
    private int date;
    private String event;
    private String description;

    MysqlConnexion repository = new MysqlConnexion();

    

    public Request(String name, int date, String event, String description) {
        this.name = name;
        this.date = date;
        this.event = event;
        this.description = description;
    }

    public Request() {
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



    public Request index() {
        try {
            Statement statement = repository.conn.createStatement();
            String sql = "SELECT * FROM db_supporapp.request";
        } catch (Exception e) {
            // TODO: handle exception
        }
        
        this.event = "partido champions";
        this.name = "diego";
        return this;

    }
  

}
