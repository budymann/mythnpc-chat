package com.example.budymann.mythnpcchat.domain.services;

import com.example.budymann.mythnpcchat.domain.model.DiscreetChatMessage;
import com.example.budymann.mythnpcchat.domain.model.GroupChatMessage;
import com.example.budymann.mythnpcchat.repository.DiscreetChatMessageRepository;
import com.example.budymann.mythnpcchat.repository.GroupChatMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscreetChatService {

    @Autowired
    DiscreetChatMessageRepository discreetChatMessageRepository;

    public DiscreetChatMessage save(DiscreetChatMessage discreetChatMessage){
        return discreetChatMessageRepository.save(discreetChatMessage);
    }

    public List<DiscreetChatMessage> getDiscreetChatMessages(int senderId, int recipientId){
        return discreetChatMessageRepository.findBySenderIdAndRecipientId(senderId, recipientId);
    }

    public DiscreetChatMessage getDiscreetChatMessage(int messageId){
        return discreetChatMessageRepository.findById(messageId).get();
    }


}
