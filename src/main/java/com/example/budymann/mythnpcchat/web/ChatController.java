package com.example.budymann.mythnpcchat.web;

import com.example.budymann.mythnpcchat.domain.model.ChatMessage;
import com.example.budymann.mythnpcchat.domain.model.DiscreetChatMessage;
import com.example.budymann.mythnpcchat.domain.model.notification.MessageStatusNotification;
import com.example.budymann.mythnpcchat.domain.services.DiscreetChatService;
import com.example.budymann.mythnpcchat.domain.wrappers.MessageTemplateWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChatController {
    @Autowired
    private MessageTemplateWrapper messageTemplateWrapper;

    @Autowired
    DiscreetChatService discreetChatService;

    @MessageMapping({"/chat/message"})
    public void chat(DiscreetChatMessage dcm) throws Exception{
        var message = discreetChatService.save(dcm);
        messageTemplateWrapper.sendToUser(dcm.getRecipientId(), message);
    }

    @MessageMapping({"/chat/status"})
    public void chatStatus(MessageStatusNotification messageStatusNotification){
        var message = discreetChatService.getDiscreetChatMessage(messageStatusNotification.getMessageId());
        message.setMessageStatus(messageStatusNotification.getMessageStatus());
        discreetChatService.save(message);
        messageTemplateWrapper.sendToUser(message.getSenderId(), message);

    }

    public List<DiscreetChatMessage> getChatMessage(int personId, int otherPersonId){
        return discreetChatService.getDiscreetChatMessages(personId, otherPersonId);
    }

}
