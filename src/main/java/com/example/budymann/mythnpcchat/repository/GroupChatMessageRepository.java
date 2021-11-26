package com.example.budymann.mythnpcchat.repository;

import com.example.budymann.mythnpcchat.domain.model.DiscreetChatMessage;
import com.example.budymann.mythnpcchat.domain.model.GroupChatMessage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GroupChatMessageRepository extends JpaRepository<GroupChatMessage, Integer> {
    List<GroupChatMessage> findByChatroomId(int chatroomId);

}
