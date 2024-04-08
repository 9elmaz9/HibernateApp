package be.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Message {

    @Column(name = "Message")
    @Id
    private int messageId ;


    @Column (name = "FromUserId")
    private Integer fromUserId;

    @Column(name = "ToUserId")
    private Integer toUserId;

    @Column(name = "Subject")
    private String subject;

    @Column(name = "Content")
    private String content ;

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public Integer getFromUserId() {
        return fromUserId;
    }

    public Integer getToUserId() {
        return toUserId;
    }

    public String getSubject() {
        return subject;
    }

    public String getContent() {
        return content;
    }

    public void setFromUserId(Integer fromUserId) {
        fromUserId= fromUserId;
    }

    public void setToUserId(Integer toUserId) {
        toUserId = toUserId;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
