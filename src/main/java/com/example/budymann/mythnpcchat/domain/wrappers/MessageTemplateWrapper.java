package com.example.budymann.mythnpcchat.domain.wrappers;


import com.example.budymann.mythnpcchat.domain.model.ChatMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageTemplateWrapper {
    public static String USER_PREFIX = "user";
    public static String TOPIC_PREFIX = "/topic";

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    //user/mamaduke/queue/message -> queue/user-mamaduke-message
    public void sendToUser(int userId, Object payload){
        var destination = "/topic" + "/" + USER_PREFIX + "-" + userId + "-" + "message";
        messagingTemplate.convertAndSend(destination, payload);
    }
}
