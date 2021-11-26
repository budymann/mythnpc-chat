package com.example.budymann.mythnpcchat.domain.services;

import com.example.budymann.mythnpcchat.domain.model.GroupChatMessage;
import com.example.budymann.mythnpcchat.repository.ChatroomRepository;
import com.example.budymann.mythnpcchat.repository.GroupChatMessageRepository;
import com.example.budymann.mythnpcchat.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupChatService {
    @Autowired
    GroupChatMessageRepository groupChatMessageRepository;

    @Autowired
    ChatroomRepository chatroomRepository;

    @Autowired
    PersonRepository personRepository;

    public GroupChatMessage save(GroupChatMessage groupChatMessage){
        return groupChatMessageRepository.save(groupChatMessage);
    }

    public List<GroupChatMessage> getGroupChatMessage(int chatroomId){
        return groupChatMessageRepository.findByChatroomId(chatroomId);
    }

    public void addPersonToChatroom(int chatroomId, int inviteeId){
        var person = personRepository.getById(inviteeId);
        var chatroom = chatroomRepository.getById(chatroomId);

        person.getChatroomParticipated().add(chatroom);
        chatroom.getParticipants().add(person);

        personRepository.save(person);
        chatroomRepository.save(chatroom);
    }

    public void leaveChatroom(int chatroomId, int personId){
        var person = personRepository.getById(personId);
        var chatroom = chatroomRepository.getById(chatroomId);

        person.getChatroomParticipated().remove(chatroom);
        chatroom.getParticipants().remove(person);

        personRepository.save(person);
        chatroomRepository.save(chatroom);
    }
}
