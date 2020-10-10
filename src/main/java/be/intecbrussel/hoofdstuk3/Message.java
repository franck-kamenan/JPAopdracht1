package be.intecbrussel.hoofdstuk3;

import javax.persistence.*;

@Entity // omdat het een entity-klasse is
public class Message {

    private long id;
    private String text;

    public Message(){}

    public Message(long id, String text){

        this.id = id;
        this.text = text;
    }

    @Id // omdat het de primary key is
    public long getId(){

        return id;
    }

    public void setId(long id) {

        this.id = id;
    }

    public String getText() {

        return text;
    }

    public void setText(String text) {

        this.text = text;
    }
}
