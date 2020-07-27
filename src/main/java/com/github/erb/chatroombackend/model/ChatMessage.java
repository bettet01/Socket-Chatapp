package com.github.erb.chatroombackend.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ChatMessage {

    private MessageType type;

    private String content;

    private String sender;

    private String time;
}
