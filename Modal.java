package com.hitesh.Chat.Engine.modal;



public class ChatMessage {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    private String sender;

    private MessageType type;

    public enum MessageType{
        CHAT, LEAVE, JOIN
    }


}
